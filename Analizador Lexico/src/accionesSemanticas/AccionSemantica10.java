package accionesSemanticas;

import dataModel.TablaSimbolo;
import dataModel.Token;

public class AccionSemantica10  extends AccionesSemanticas
{

	public AccionSemantica10(String m)
	{
		super(m);
	}
	
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo tablaS, int linea) {
		return null;
	}

}
