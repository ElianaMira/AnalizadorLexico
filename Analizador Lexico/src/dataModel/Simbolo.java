package dataModel;

public class Simbolo 
{
	private StringBuffer valor;
    private String tipo;
    
    public Simbolo(StringBuffer v, String t)
    {
        this.valor = new StringBuffer();
        this.valor.append(v);
        tipo = t ;
    }

    public String getTipo() {
        return tipo;
    }

    public StringBuffer getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public boolean equals(Simbolo s){       
        if (s != null)
            return s.getValor().toString().equals(valor.toString());
        return false;
    }

}
