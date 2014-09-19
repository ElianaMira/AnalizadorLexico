package accionesSemanticas;

import dataModel.Token;

public abstract class AccionesSemanticas {
	
	protected Boolean error;
	protected Boolean retroceder;
	protected String MsjError;
	protected String tipo;
	protected String identificador;
	// comet eesta
	public abstract Token ejecutar(); 
}
