package dataModel;
import java.util.Stack;
import java.util.Vector;


public class Assembler {
	
	private Stack<String> pilaCodigo;
	private Integer contaux;	
	private Tercetos ter;
	private String argu1;
	private String argu2;
	static int numTerceto;
	static String saltoBI; //Guarda la posicion a donde tiene que saltar(se setea cuando encuentra un BI, si la posici�n a la que tiene que saltar es menor a numTerceto (o sea un salto para atras 'sentencia for'.),no hacemos nada porque antes en el CMP se seteo la label, si es mayor entonces cuando coincida saltoBI con numterceto marcaremos esa instr assembler con la una label+saltoBI. 
    String LabelBIBF;//Label que se seteara con el numero de salto de un BI o BF. el cual se encontrara en el comienzo una operacion.  
	static String CMP; //Para saber cual operador de comparacion la BF debe evaluar.	
	private static Stack <String> pilaBF; //Alamcena las posiciones de regreso para setear a donde deben saltar los BF. 
	private Vector<String> listAux;
	
	private Vector<String> InstruccionesTercetos;
	
	public Assembler(){
		saltoBI="-2";
		LabelBIBF="";
		contaux = 0;
		pilaBF= new Stack<String>();
		pilaCodigo = new Stack<String>();
		listAux = new Vector<String>();
	}

	//SUMA
	private void SUMA (String x, String y, String z)
	    {
			
			if(ter.getTipo()!=null &&  ter.getTipo().equals("flotante")){
				GEN("FLD",argu1,"");
				GEN("FADD",argu2,"");
				listAux.clear();
				GEN("FSTP _aux"+contaux,"","");
				GEN("FLD _aux"+contaux,"","");
				pilaCodigo.push("_aux" + contaux);				
				contaux++;
				}
			else 
			{
				if (ter.getTipo()!=null )
				{	
					GEN("ADD","AX,",argu2);
					GEN("CMP","LimiteINT,","AX");
				}
			}
	    }
	//RESTA
	 private void RESTA (String x,String y,String z)
	    {
		 	if(ter.getTipo()!=null && ter.getTipo().equals("flotante")){
		 		GEN("FLD ",argu1,"");
				GEN("FSUB ",argu2,"");
				GEN("FST _aux"+contaux,"","");
				pilaCodigo.push("_aux" + contaux);				
				contaux++;
		 	}
		 	else
		 	{
		 		GEN("FSUB",argu2,"");
		 	}
	    }

	
	//PRODUCTO
	private void  MUL (String x, String y, String z)
	    {
			if(ter.getTipo().equals("flotante"))
			{
				GEN("FLD  ",argu1," ");
				GEN("FMUL ",argu2," ");
				GEN("FST _aux"+contaux,"","");
				GEN("FCOMP"," LimiteFLOAT"," ");
				GEN("FSTSW","ax","");
				GEN("SAHF","","");
				GEN("JNBE LabelOverflow","","");
				pilaCodigo.push("_aux" + contaux);
				contaux++;
			}		
			else
				GEN ("FMUL ",argu2,"");
	    } 
	
	//DIVISION
	 private void DIV (String x,String y,String z)
	    {
		 	if(ter.getTipo()!=null && ter.getTipo().equals("flotante"))
		 	{	 			 		
		 		GEN("FLD",argu1,"");
		 		GEN("FLD",argu1,"");
		        GEN("FDIVR","",""); 
				GEN("FST _aux"+contaux,"","");
				pilaCodigo.push("_aux" + contaux);
				contaux++;
			}		 		 	
	    }
	 
	//ASIGNACION
	 private void ASSIG(String x,String y)
	 {				 
		 if (ter.getTipo()!=null && ter.getTipo().equals("flotante"))
		 {	
			 GEN(LabelBIBF +" FLD",argu2,"");
		     GEN("FSTP",argu1,"");
		 }
		 else
		 {
			 if (ter.getTipo()!=null && (ter.getTipo().equals("int")))
			 {
				 GEN (LabelBIBF+"MOV", "AX" +",",argu2);
				 GEN ("MOV "+argu1+",","AX","");
				 if(ter.isSentenciaFor())
					 GEN ("MOV AUX_FOR,","AX","");				 
			 }
			
			else{
				int index = x.indexOf("[");
				String pos = x.substring(index+1, x.length()-1);
				String name = x.substring(0, index);
				
				GEN("CMP cte_rango, ",pos,"");
				GEN("JL LabelOutRange","","");
				GEN ("MOV EAX, ",argu2,"");
				GEN ("MOV", "AX, ",pos );
				GEN("MOV SI,","AX","");				
				GEN ("MOV "+ name+"[SI],", "EAX","");
			}				 
		 }
	}
	 
	 private void BI(String x,String y){
		 String salto;
		 salto= ter.getElem2().replace("[","");
		 salto = salto.replace("]","");
		 saltoBI=salto;	
		 GEN(LabelBIBF+"JMP EtiquetaSalto_"+salto,"","");
	 }
	 
	 
	 private void BF(String x,String y){		
			
		  	pilaBF.push(String.valueOf(InstruccionesTercetos.size()+1));//Apilo la pos de la instruccion del BF, para poder volver.
		 	String salto;
		 	salto= ter.getElem3().replace("[","");
		 	salto = salto.replace("]","");
		 	pilaBF.push(salto); //Apilo(y desapilo cuando encuentro el terceto destino) a donde va a saltar, si numTerceto = salto, entonces a ese terceto lo marco con una etiqueta.
		 			 	
		 	if ( CMP.equals(">") )
		 		GEN(LabelBIBF+"JG EtiquetaSalto_"+salto,"","");
		 	else
			if ( CMP.equals("<") )
			{
				if (ter.isSentenciaFor())
					GEN(LabelBIBF+"JLE EtiquetaSalto_"+salto,"","");
				else
					GEN(LabelBIBF+"JL EtiquetaSalto_"+salto,"","");				
			}
			else
			if ( CMP.equals("MENOR_IGUAL") )
				GEN(LabelBIBF+"JLE EtiquetaSalto_"+salto,"","");
			else
			if ( CMP.equals("<=") )
					GEN(LabelBIBF+"JLE EtiquetaSalto_"+salto,"","");
			else
			if ( CMP.equals("MAYOR_IGUAL") )
				GEN(LabelBIBF+"JGE EtiquetaSalto_"+salto,"","");
			else
			if ( CMP.equals("DISTINTO") )
				GEN(LabelBIBF+"JE EtiquetaSalto_"+salto,"","");
			else
			if ( CMP.equals("=") )
				GEN(LabelBIBF+"JNE EtiquetaSalto_"+salto,"","");
		
			if(ter.isSentenciaFor())
		 		GEN("invoke MessageBox, NULL, addr msjFOR, addr msjFOR, MB_OK","","");
		
	 }
	 
	 
	 private void CMP(String x,String y){
		 String label="";
		 label=LabelBIBF;
		 if(ter.isSentenciaFor())
			 label=ter.getEtiquetaSalto();
		 
		 if (ter.getTipo().equals("flotante")){	
			
			 if(!label.equals("")){
				 	GEN("MOV AX, ","AUX_FOR","");	
			 		GEN(label+"CMP "+argu2,",","EAX");			 		
			 }
			 else{				
				 GEN(" MOV EAX, ",argu1,"");	
				 GEN(label+"CMP "+argu2,",","EAX");					
			 }
		}
		else{
			if (ter.isSentenciaFor())
			{
				GEN(label+" FILD ",argu1,"");
				GEN("MOV","_maximo,",argu2);
				GEN("FILD","_maximo","");
				GEN("FCOMP","",""); 
				GEN("FSTSW","ax",""); 
				GEN("SAHF","",""); 
			}
		}		
	 }

	public void GEN(String instr1,String instr2,String Instr3)
	{
		InstruccionesTercetos.add(instr1+" "+instr2+" "+Instr3);
	}
	
	public void GEN(String instr1,String instr2,Integer Instr3)
	{
		InstruccionesTercetos.add(instr1+" "+instr2+" "+Instr3);
	}
	
	private String getDestino(String elemTerceto){
		
		if (elemTerceto.contains("[")){
			return "_aux"+(contaux-1);
		}
		else
			if (!(elemTerceto.charAt(0)>='0' && elemTerceto.charAt(0)<='9')) {
				return elemTerceto;
			}
			else
				if(ter.getTipo()!=null && ter.getTipo().equals("flotante")){
					String aux = "AuxAssem"+String.valueOf(numTerceto+1);
					if (!listAux.contains(aux)){
						listAux.add("AuxAssem"+String.valueOf(numTerceto+1));
						return "AuxAssem"+String.valueOf(numTerceto+1);
					}
					else{
						listAux.add("AuxAssem"+String.valueOf(numTerceto+listAux.size()));
						return "AuxAssem"+String.valueOf(numTerceto+listAux.size());
					}
					
				}
		return elemTerceto;
			
	}
	
	public void generarCodigo(Tercetos terceto,Vector<String> listInstr,int pos){
		InstruccionesTercetos = listInstr;
		numTerceto = pos;
		boolean seteoLabel=false;
		if(!pilaBF.empty()){
			if(pilaBF.peek().equals(String.valueOf(numTerceto+1)))//si el tope de la pila es igual al numero de Terceto.			
			{
				LabelBIBF="EtiquetaSalto_"+pilaBF.pop()+":"; //Desapilo el numero de etiqueta(salto del terceto BF)
				seteoLabel=true;
			}
			else
				LabelBIBF="";
		}
		if(saltoBI.equals(String.valueOf(numTerceto+1)))
			LabelBIBF="EtiquetaSalto_"+saltoBI+":";
		else
			if(!seteoLabel)
				LabelBIBF="";
		ter = terceto;
		String operador = terceto.getElem1();
		argu1 = getDestino(terceto.getElem2());
		argu2 = getDestino(terceto.getElem3());
	
		if ( operador.equals("+")||operador.equals("-")||operador.equals("/")||operador.equals("*")){
			if(ter.getTipo().equals("flotante")){
				GEN(LabelBIBF+"MOV","EAX,",argu1);
			}
			else{
				if(ter.isSentenciaFor())
				{
					GEN("FILD",argu1,""); 
					GEN("ADD"," AUX_FOR ,",argu2);
					GEN("MOV","AX,","AUX_FOR");
					GEN("MOV",argu1,",AX");
				}
				else
					GEN(LabelBIBF+"FILD",argu1,"");
			}
			
			if ( operador.equals("+")){
				SUMA(terceto.getElem2(),terceto.getElem3(),"");
			}
			else{
				if (operador.equals("-")){
					RESTA(terceto.getElem2(),terceto.getElem3(),"");
				}
				else{
					if(operador.equals("/")){
						DIV(terceto.getElem2(),terceto.getElem3(),"");
					}
					else{
						if(operador.equals("*"))
							MUL(terceto.getElem2(),terceto.getElem3(),"");
					}
				}
				if(ter.getTipo().equals("flotante"))
					GEN("MOV", terceto.getVariable(), ", EAX");
				else
					GEN("FSTP", terceto.getVariable(),"");
			}
		}
							
		else{
			if(operador.equals(":=")){
				ASSIG(terceto.getElem2(),terceto.getElem3());
			}
			else{
				if(operador.equals("BI")){
					BI(terceto.getElem2(),terceto.getElem3());
				}
				else{
					if(operador.equals("=")||operador.equals("<")||operador.equals(">")||operador.equals("<=")||operador.equals("MENOR_IGUAL")||operador.equals("MAYOR_IGUAL")||operador.equals("DISTINTO")){
						CMP=operador;	
						CMP(terceto.getElem2(),terceto.getElem3());
					}
					else{
						if(operador.equals("BF")){
							BF(terceto.getElem2(),terceto.getElem3());
						}
						else{
							if (operador.equals("IMPRIMIR"))
								GEN(LabelBIBF + "invoke MessageBox, NULL, addr",ter.getVariable(), ", addr tituloPrint, MB_OK");
							
							if(operador.equals("FIN")){
								GEN(LabelBIBF+"JMP","_QUIT","");
							    GEN("LabelOverflow: invoke MessageBox, NULL, addr AUX_Overflow, addr msjError, MB_OK ","","");			
								GEN("JMP","_QUIT","");
								GEN("LabelNegativo: invoke MessageBox, NULL, addr AUX_Negativo, addr msjError, MB_OK ","","");
								GEN("JMP","_QUIT","");
								GEN("LabelOutRange: invoke MessageBox, NULL, addr AUX_Range, addr msjError, MB_OK ","","");
								GEN("JMP","_QUIT","");											
							}
						}
					}
						
				}
					
			}
				
							
		}			
					
	}
}