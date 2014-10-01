package dataModel;
import java.util.ArrayList;

public class PalabrasReservadas 
{
	private ArrayList<String> palabras; 
	public PalabrasReservadas()
	{
		palabras = new ArrayList<String>();
		palabras.add("if");
		palabras.add("then");
		palabras.add("else");
		palabras.add("print");
		palabras.add("int");
		palabras.add("float");
		palabras.add("for");
		palabras.add("vector");
		palabras.add("of");
	}
	
	public ArrayList<String> getReservadas()
	{
		return this.palabras; 
	}
	
	public boolean esPalabraReservada(String Palabra)
	{ 
		if (palabras.contains(Palabra))
		{ 
			return true; 
		}
		return false; 
	}
}