package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Devuelve el lexema para los caracteres >= <= != :=   */
public class AccionSemantica5 extends AccionesSemanticas 
{

	public AccionSemantica5(String m)
	{
	        super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea)
	{
		lexema.append(caracter);
		Simbolo s = new Simbolo(lexema,lexema.toString());
		ts.addSimbolo(s);
		Token t = new Token(s.getTipo(), s);
		return t;
	}
}
