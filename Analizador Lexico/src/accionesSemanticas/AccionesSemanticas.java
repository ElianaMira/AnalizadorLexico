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
	    
	 public void setIdentificador(String id){
		 identificador = id;
	 }
	 public void setMsjError(String msj){
		 msjError = msj;
	 }
	
	 public void setError(Boolean e){
		 error = e;
	 }

	 public void setTipo(String t) {
		 tipo = t;
	 }
	    
	 public String getIdentificador(){
		 return identificador;
	 }	 
	 
	 public Boolean getRetroceder() 
	 {
		return retroceder;
	 }

	public void setRetroceder(Boolean retroceder)
	{
		this.retroceder = retroceder;
	}

	// retorna un String con el lexema que va formando en caso contrario lo devuelve vacío.	     
	public abstract Token ejecutar(StringBuffer lexema,char caracter,TablaSimbolo tablaS,int linea);  
}
