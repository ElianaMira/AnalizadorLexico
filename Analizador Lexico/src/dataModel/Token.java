package dataModel;

public class Token 
{
    private String tipo;
	private Simbolo simb;
	private int linea;
	private int ambito = 0;	
	
	public Token(){
		
	}
	
	public Token(String t,Simbolo s){
		tipo = t;
	    simb = s;
	    linea = 0;
	    ambito = 0;
	}
	
	public Token(String t,Simbolo s,int a){
		tipo = t;
	    simb = s;
	    linea = 0;
	    ambito = a;
	}
	    
	public Simbolo getPuntero(){
		return simb;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public int getAmbito(){
		return ambito;
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
	
	public boolean tieneTipo(){
		if(simb.getTipoVariable() != null){
			return true;
		}
		return false;
	}
}
