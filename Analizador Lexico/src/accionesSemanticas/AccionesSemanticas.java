package accionesSemanticas;

import dataModel.Token;

public abstract class AccionesSemanticas {
	
	protected Boolean error;
	protected Boolean retroceder;
	protected String msjError;
	protected String tipo;
	protected String identificador;
	
	public AccionesSemanticas(String accion){
	        error = false;
	        msjError = "";
	        tipo = null;
	        retroceder = false;
	        identificador = accion;
	 }
	
	 public String getMsjError(){
		 return msjError;
	 }
	
	 public Boolean getError(){
		 return error;
	 }

	 public String getTipo() {
		 return tipo;
	 }
	    
	 public String getIdentificador(){
		 return identificador;
	 }
	
	public abstract Token ejecutar(); 
}
