package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;


/* Verifico que la el id sea palabra reservada VECTOR, en caso que no lo sea, guardo lexema verifico tamaño12 y retorno el ult caracter leido*/

public class AccionSemantica10 extends AccionesSemanticas
{

	public AccionSemantica10(String accion) 
	{
		super(accion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) 
	{
		Simbolo s;
		if (lexema.toString().equals("VECTOR"))
		{
			lexema.append(caracter);
			return null;
		}
		else
		{
			if (lexema.length() > 12) 
	    	{
	    		lexema = lexema.delete(12, lexema.length()); // trunco el string
	            super.error = true;
	            super.msjError = "WARNING en linea "+linea+": el identificador es demasiado largo";
	        }
	    	s = new Simbolo(lexema, "IDENTIFICADOR");	        
	    	ts.addSimbolo(s);
	 	    Token t = new Token(s.getTipo(),s);
	 	    retroceder = true;
	 	    return t;
		}
		
	}
 
}
