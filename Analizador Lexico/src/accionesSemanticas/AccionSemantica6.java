package accionesSemanticas;
import dataModel.LectorArchivo;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/*Guardar el lexema y devolver el ultimo caracter leido  > < [ */
public class AccionSemantica6 extends AccionesSemanticas
{	
	public AccionSemantica6(String m)
	{
	       super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) 
	{			
		 Simbolo s = new Simbolo(lexema, lexema.toString());
	     ts.addSimbolo(s);
	     Token t = new Token(s.getTipo(), s);
	     retroceder = true;
	     return t;
	}
	
}
