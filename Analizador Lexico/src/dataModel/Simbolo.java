package dataModel;

public class Simbolo 
{
	private StringBuffer valor;
    private String tipo;
    private String tipoVariable;
    private boolean declarado;
    private int rango;
    
    public Simbolo(StringBuffer v, String t)
    {
        this.valor = new StringBuffer();
        this.valor.append(v); //con el append se cambia el contenido del stringbuffer
        tipo = t ;
        declarado = false;
        rango = 0;
    }
    public boolean getDeclarado() {
        return declarado;
    }
    public void setDeclarado(boolean d) {
        declarado=d;
    }
    public int getRango() {
        return rango;
    }
    public void setRango(int r) {
        rango=r;
    }
    public String getTipo() {
        return tipo;
    }
    public String getTipoVariable() {
        return tipoVariable;
    }

    public StringBuffer getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTipoVariable(String var) {
    	tipoVariable = var;
    }
    public boolean equals(Simbolo s){       
        if (s != null)
            return s.getValor().toString().equals(valor.toString());
        return false;
    }

}
