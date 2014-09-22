package accionesSemanticas;
import dataModel.Simbolo;
import dataModel.TablaSimbolo;
import dataModel.Token;

/* Verifica el float que no exceda el rango*/
public class AccionSemantica4 extends AccionesSemanticas
{
	public AccionSemantica4(String m)
	{
		super(m);
	}
	@Override
	public Token ejecutar(StringBuffer lexema, char caracter,TablaSimbolo ts, int linea) 
	{
		Float a;
		Token t = null;
		Float f = Float.valueOf(lexema.toString()).floatValue();
		
		if (f.compareTo(new Float(1.17549435e-38))== -1 || f.compareTo(new Float(3.40282347e+38)) == 1)
		{
			this.error = true;
			linea++;
			this.msjError= "ERROR Float fuera de rango linea "+linea;
		}
		else
		{
			Simbolo s = new Simbolo(lexema,"NUMERO");
			t = new Token(s.getTipo(),s);
	        ts.addSimbolo(s);
	    }
		
		lexema = new StringBuffer();               
	    retroceder = true;
        return t;
	}
	
	
	
}
