package dataModel;
import java.util.ArrayList;

public class PalabrasReservadas 
{
	private ArrayList<String> palabras; 
	public PalabrasReservadas()
	{
		palabras = new ArrayList<String>();
		palabras.add("si");
		palabras.add("entonces");
		palabras.add("sino");
		palabras.add("imprimir");
		palabras.add("int");
		palabras.add("float");
		palabras.add("para");
		palabras.add("vector");
		palabras.add("de");
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