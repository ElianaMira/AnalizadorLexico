package dataModel;
import java.util.ArrayList;

public class PalabrasReservadas 
{
	private ArrayList<String> palabras; 
	public PalabrasReservadas()
	{
		palabras = new ArrayList<String>();
		palabras.add("If");
		palabras.add("Then");
		palabras.add("Else");
		palabras.add("Print");
		palabras.add("Int");
		palabras.add("Flotante");
		palabras.add("For");
		palabras.add("Vector");
		palabras.add("De");
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