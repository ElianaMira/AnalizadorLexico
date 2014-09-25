package dataModel;

public class Token 
{
    private String tipo;
	private Simbolo simb;
	private int linea;
	
	public Token(){
		
	}
	
	public Token(String t,Simbolo s){
		tipo = t;
	    simb = s;
	    linea = 0;
	}
	    
	public Simbolo getPuntero(){
	        return simb;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setPuntero(Simbolo s) {
		this.simb = s;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getLinea(){
		return this.linea;
	}
	
	public void setLinea(int l){
		linea = l;
	}
}
