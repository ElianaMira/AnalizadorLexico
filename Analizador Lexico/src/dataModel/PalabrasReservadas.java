package dataModel;

public class PalabrasReservadas 
{
	private Matriz palabras;
	private int MaxFil = 2;
	private int MaxCol = 5;
	
	public PalabrasReservadas()
	{
		palabras = new Matriz(MaxFil,MaxCol);
		palabras.set(0, 0, "if");
		palabras.set(0, 1, "else");
		palabras.set(0, 2, "print");
		palabras.set(0, 3, "float");		 
	}             
    
	public boolean esPalabraReservada(String Palabra)
	{		
		for (int i = 0; i < MaxCol; i++) 
		{
			if (palabras.get(0, i).equals(Palabra))
				return true;			
		} 
		return false;
	}

}
