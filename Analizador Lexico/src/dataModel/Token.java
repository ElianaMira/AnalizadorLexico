package dataModel;

public class Token 
{
    private String tipo;
	private Simbolo simb;
	
	public Token(String t,Simbolo s)
	{
		tipo = t;
	    simb = s;
	}
	    
	public Simbolo getPuntero()
	{
	        return simb;
	}
	
	public String getTipo()
	{
		return tipo;
	}
	
	public void setPuntero(Simbolo s) 
	{
		this.simb = s;
	}
	
	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
	}	    
}
