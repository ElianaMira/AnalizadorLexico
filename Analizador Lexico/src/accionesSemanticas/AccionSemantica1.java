package accionesSemanticas;

import dataModel.TablaSimbolo;
import dataModel.Token;

/* Guardo caracteres que se van leyendo*/
public class AccionSemantica1 extends AccionesSemanticas
{
	public AccionSemantica1(String m)
	{
		super(m);
	}
	
	@Override
	public Token ejecutar(StringBuffer lexema,char caracter,TablaSimbolo tablaS,int linea) 
	{
		lexema.append(caracter);
		return null;
	}

}
