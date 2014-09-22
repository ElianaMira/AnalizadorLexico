package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Devuelve el lexema para los token de comparacion y asignacion*/
public class AccionSemantica5 extends AccionesSemanticas 
{

	public AccionSemantica5(String m)
	{
	        super(m);
	}

	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea)
	{
		String tipo = "";
		lexema.append(caracter);
		
		switch(lexema.toString())
		{
			case ">=":
				tipo = "MAYOR_IGUAL";
				break;
			case "<=":
				tipo = "MENOR_IGUAL";
				break;
			case "^=":
				tipo = "DISTINTO";
				break;
			case ":=":
				tipo = "ASIGNACION";
				break;
	   }
       Simbolo s = new Simbolo(lexema, tipo);
       ts.addSimbolo(s);
       Token t = new Token(s.getTipo(), s);
       return t;
	}
	
	
	
}
