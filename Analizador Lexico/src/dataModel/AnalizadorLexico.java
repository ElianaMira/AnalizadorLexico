package dataModel;

public class AnalizadorLexico {
	
	private Matriz estados;
	private Matriz accionesSemanticas;
	
	
	public AnalizadorLexico(){
		estados = new Matriz(14,20); //ver bien filas y columnas
		accionesSemanticas = new Matriz(14,20); //ver bien filas y columnas
	}
}
