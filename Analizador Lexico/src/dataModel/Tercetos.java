package dataModel;


public class Tercetos {

	private String elem1;
	private String elem2;
	private String elem3;
	private String variable; //Para las var auxiliares de las ctes float en assembler.
	private String tipo;
	private String label; //Para marcar a donde saltar en el assembler. Se setea en la gramatica.
	private boolean sentenciaFor;//Para saber si el terceto es parte de una sentencia for. Se setea en la gramatica.
	
	public Tercetos(String e1,String e2,String e3) 
	 {
		 elem1= e1;
		 elem2= e2;
		 elem3 = e3;
		 variable = new String();
		 label="";
		 sentenciaFor = false;
	 }
	
	
	public Tercetos(String e1,String e2,int e3) 
	 {
		 elem1= e1;
		 elem2= e2;
		 elem3 = "["+Integer.toString(e3)+"]" ;
		 variable = new String();
		 label="";
		 sentenciaFor = false;
	 }
	
	public Tercetos(String e1,String e2,int e3,String t) 
	 {
		 elem1= e1;
		 elem2= e2;
		 elem3 = "["+Integer.toString(e3)+"]" ;
		 tipo=t;
		 variable = new String();
		 label="";
		 sentenciaFor = false;
	 }
	 
	 public Tercetos(String e1,String e2,String e3,String tipo,int posTerceto,boolean isSentenciaFor) 
	 {
		 elem1= e1;
		 elem2= e2;
		 elem3 = e3;
		 variable = new String();
		 this.setEtiquetaSalto(posTerceto);
		 sentenciaFor = isSentenciaFor;
		 this.tipo = tipo;
	 }
	 
	 
	 public Tercetos(String e1,String e2,String e3,String t){
		 elem1= e1;
		 elem2= e2;
		 elem3 = e3;
		 tipo = t;
		 variable = new String();
		 label="";
		 sentenciaFor = false;
	 }
	 
	 public String getElem1(){
		 return elem1;
	 }
	 
	 public String getElem2(){
		 return elem2;
	 }
	 
	 public String getElem3(){
		 return elem3;
	 }
	 
	 public void setElem1(String e1){
		 elem1=e1;
	 }
	 
	 public void setElem2(String e2){
		 elem2=e2;
	 }
	 
	 public void setElem3(String e3){
		 elem3=e3;
	 }
	 
	 public void setVariable(String val){
		 variable = val;
	 }
	 public void setEtiquetaSalto(int pos){
		 label = "EtiquetaSalto_"+String.valueOf(pos)+": ";
	 }
	 public String getEtiquetaSalto(){
		 return label;
	 }
	 public boolean isSentenciaFor(){
		 return sentenciaFor;
	 }
	 public void setSentenciaFor(boolean t){
		 sentenciaFor = t;
	 }
	 public String getVariable(){
		 return variable;
	 }
	 
	 public void setTipo(String tipo){
		 this.tipo = tipo;	 
	 }
	 public String getTipo(){
		 return this.tipo;
	 }
	 public void mostrarTerceto(){
		 System.out.println("("+elem1+","+elem2+","+elem3+")");
	 }
}

