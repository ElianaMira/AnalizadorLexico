package accionesSemanticas;

import dataModel.TablaSimbolo;
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
	 // retorna un String con el lexema que va formando en caso contrario lo devuelve vacío.	     
	public abstract Token ejecutar(StringBuffer lexema,char caracter,TablaSimbolo tablaS,int linea);  
}
