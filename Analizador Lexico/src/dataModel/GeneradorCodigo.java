package dataModel;

import java.util.Vector;

public class GeneradorCodigo {
		
	private Vector<Tercetos> ldt;
	private Assembler assem;
	private Log logAssembler = new Log("assembler.log");
	private Vector<String> InstruccionDeclaracion;
	private Vector<String> InstruccionesTercetos;
	private Vector<Token> varAuxiliares;
	
	public GeneradorCodigo(Vector<Tercetos> listaTercetos){		
		ldt = listaTercetos;
		InstruccionDeclaracion = new Vector<String>();
		InstruccionesTercetos = new Vector<String>();
		varAuxiliares = new Vector<Token>();
	}
	
	private static boolean isNumeric(String cadena,String tipo){
		try {
			if(tipo.equals("INT"))
				Integer.parseInt(cadena);
			else
				if(tipo.equals("FLOAT"))
					Float.parseFloat(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
	
	public String getPosTerceto(String nomb){
		Tercetos aux;
		for (int i=0; i<ldt.size(); i++){
			aux = (Tercetos)ldt.elementAt(i);
			if(aux.getElem2().equals(nomb)||aux.getElem3().equals(nomb))
				return String.valueOf(i+1);
		}
		return nomb;
	}
	
	private void CargarVariablesAUXEnTDS(){
		Token varAux;
		for (int i=0; i<varAuxiliares.size(); i++){
			varAux = varAuxiliares.elementAt(i);
			TablaSimbolo.addSimbolo(varAux.getPuntero());
		}		
	}

	public void run(){

		try{
			
			//TablaSimbolo.CleanID();			
			logAssembler.generar();
		    assem = new Assembler();

//		    InstruccionDeclaracion.add(".MODEL small");
//			InstruccionDeclaracion.add(".STACK 200h");		
			InstruccionDeclaracion.add(".386");
			InstruccionDeclaracion.add(".model flat, stdcall");
			InstruccionDeclaracion.add("option casemap :none");
			InstruccionDeclaracion.add("include\\masm32\\include\\windows.inc");
			InstruccionDeclaracion.add("include\\masm32\\include\\kernel32.inc");
			InstruccionDeclaracion.add("include\\masm32\\include\\user32.inc");
			InstruccionDeclaracion.add("includelib\\masm32\\lib\\kernel32.lib");
			InstruccionDeclaracion.add("includelib\\masm32\\lib\\user32.lib");
			InstruccionDeclaracion.add(".data");
			
			//Enumeration<Token> elem =TablaSimbolos.Enumerator();
			
			for(int i=0; i< TablaSimbolo.getTabla().size();i++){
				Simbolo simb = TablaSimbolo.getTabla().get(i);
				
				if(simb.getTipo()!=null && simb.getTipo().equals("INT")){
					if(!isNumeric(simb.getValor().toString(),simb.getTipo())){
						InstruccionDeclaracion.add(simb.getValor().toString()+" dw 0");
						varAuxiliares.add(new Token("INT",simb));
					}
				}
				else
					if(simb.getTipo()!=null && simb.getTipo().equals("FLOAT")){						
						if(isNumeric(simb.getValor().toString(),simb.getTipo())){
							InstruccionDeclaracion.add("AUXAssem"+getPosTerceto(simb.getValor().toString())+" dd "+simb.getValor().toString());
							StringBuffer sb= new StringBuffer();
							sb.append("AUXAssem"+getPosTerceto(simb.getValor().toString()));
							Simbolo s = new Simbolo(sb,"FLOAT");
							varAuxiliares.add(new Token("FLOAT",s));
						}
						else{
							InstruccionDeclaracion.add(simb.getValor().toString()+" dd 0");
							varAuxiliares.add(new Token("FLOAT",simb));
						}
					}	
			}
			CargarVariablesAuxiliares();    
			//CargarMensajesError();
			CargarVariablesAUXEnTDS();
			InstruccionDeclaracion.add(".code");
			InstruccionDeclaracion.add("start:");

			
			for (int i=0; i<ldt.size(); i++){
				assem.generarCodigo((Tercetos)ldt.elementAt(i),InstruccionesTercetos,i);
			}
			InstruccionesTercetos.add("_QUIT: invoke ExitProcess, 0");
			InstruccionesTercetos.add("end start");
			
			llenarArchivoAssembler();
		}
		catch(Exception e){
			System.err.println("El archivo logAssembler no se pudo crear.Verifique si hay errores sintacticos que puedan afectar a los tercetos.");
		}
	}
		
	/*public void cleanTDS(){
		TablaSimbolo.CleanID();
	}*/
	
	private void llenarArchivoAssembler()
	{
		
		for (int i=0; i<InstruccionDeclaracion.size(); i++){
			System.out.println(String.format(InstruccionDeclaracion.elementAt(i)));
			logAssembler.addLog(String.format(InstruccionDeclaracion.elementAt(i)));
		}
		for (int i=0; i<InstruccionesTercetos.size(); i++){
			System.out.println(String.format(InstruccionesTercetos.elementAt(i)));
			logAssembler.addLog(String.format(InstruccionesTercetos.elementAt(i)));
		}
		
	}
	
	public void mostrarCodigoAssemblerPorPantalla(){
		for (int i=0; i<InstruccionDeclaracion.size(); i++){
			System.out.println(InstruccionDeclaracion.elementAt(i));
		}
		for (int i=0; i<InstruccionesTercetos.size(); i++){
			System.out.println(InstruccionesTercetos.elementAt(i));
		}
	}
	
	private void CargarVariablesAuxiliares(){
		Tercetos aux ;
		StringBuffer sb= new StringBuffer();
		
		InstruccionDeclaracion.add("AUX_FOR dw 0");
		sb.append("AUX_FOR");
		Simbolo s = new Simbolo(sb,"INT");
		sb.delete(0, sb.length());
		varAuxiliares.add(new Token("INT",s));
		
		InstruccionDeclaracion.add("AUXCMP dw 0");
		sb.append("AUXCMP");
		Simbolo s1 = new Simbolo(sb,"INT");
		sb.delete(0, sb.length());
		varAuxiliares.add(new Token("INT",s1));
		
		InstruccionDeclaracion.add("LimiteFLOAT dd 3.40282347e38");
		sb.append("LimiteFLOAT");
		Simbolo s2 = new Simbolo(sb,"FLOAT");
		sb.delete(0, sb.length());
		varAuxiliares.add(new Token("FLOAT",s2));
		
		
		InstruccionDeclaracion.add("LimiteUINT dw 65535");
		sb.append("LimiteUINT");
		Simbolo s3 = new Simbolo(sb,"INT");
		sb.delete(0, sb.length());
		varAuxiliares.add(new Token("INT",s3));
		
		for (int i=0; i<ldt.size(); i++){
			aux = (Tercetos)ldt.elementAt(i);
			if(aux.getElem1().equals("+")||aux.getElem1().equals("-")||aux.getElem1().equals("/")||aux.getElem1().equals("*")){
				if(aux.getTipo()!=null && aux.getTipo().equals("INT")){
					InstruccionDeclaracion.add("AUX_"+String.valueOf(i+1)+" dw 0");
					sb.append("AUX_"+String.valueOf(i+1));
					Simbolo s4 = new Simbolo(sb,"INT");
					sb.delete(0, sb.length());
					varAuxiliares.add(new Token("INT", s4));
				}
				else{
					InstruccionDeclaracion.add("AUX_"+String.valueOf(i+1)+" dd 0");
					sb.append("AUX_"+String.valueOf(i+1));
					Simbolo s4 = new Simbolo(sb,"FLOAT");
					sb.delete(0, sb.length());
					varAuxiliares.add(new Token("FLOAT",s4));
				}
				
				aux.setVariable("AUX_"+String.valueOf(i+1));
			}
			else
				if(aux.getElem1().equals("Print")){
					InstruccionDeclaracion.add("AUX_"+String.valueOf(i+1)+" db \""+ aux.getElem2().substring(1, aux.getElem2().length()) + "\""+",0");
					sb.append("AUX_"+String.valueOf(i+1));
					Simbolo s4 = new Simbolo(sb,"CADENA");
					sb.delete(0, sb.length());
					varAuxiliares.add(new Token("CADENA",s4));
					aux.setVariable("AUX_"+String.valueOf(i+1));
				}						
		}
	}
	/*private void CargarMensajesError(){			
		InstruccionDeclaracion.add("tituloPrint db \""+"Print\",0");
		InstruccionDeclaracion.add("msjBI db \""+"Bifurcacion Incondicional\",0");
		InstruccionDeclaracion.add("msjBF db \""+"Bifurcacion por Falso\",0");
		InstruccionDeclaracion.add("msjFOR db \""+"Iteracion sentencia FOR.\",0");
		InstruccionDeclaracion.add("msjError db \""+"Error\",0");
		InstruccionDeclaracion.add("AUX_Overflow db \""+"OverFlow en la suma.\",0");
		varAuxiliares.add(new Token("AUX_Overflow",CADENA,"Cadena"));
		InstruccionDeclaracion.add("AUX_Negativo db \""+"El resultado de la resta es negativo.\",0");
		varAuxiliares.add(new Token("AUX_Negativo",CADENA,"Cadena"));
	}*/
}