package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Guardo id vector*/
public class AccionSemantica11 extends AccionesSemanticas
{

	public AccionSemantica11(String accion)
	{
		super(accion);		
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea)
	{
		
		Simbolo s = new Simbolo(lexema,"VECTOR");
        Token t = new Token(s.getTipo(),s);
        if (!TablaSimbolo.existeSimbolo(t)){
        	ts.addSimbolo(s);
        }
        return t;
	}

}
