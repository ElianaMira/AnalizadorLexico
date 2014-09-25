package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Guardo simbolo y retorno lexema + - * / = { } ] ( ) */
public class AccionSemantica7 extends AccionesSemanticas{
	
	public AccionSemantica7(String m){
		super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) 
	{
		Simbolo s = new Simbolo(lexema, lexema.toString());
		ts.addSimbolo(s);
		Token t = new Token(s.getTipo(), s);
		return t;
	}
	
	
}
