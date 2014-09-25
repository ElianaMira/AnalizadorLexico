package dataModel;

import java.util.ArrayList;


public class TablaSimbolo {

	private ArrayList<Simbolo> tablaSimbolo;

    public TablaSimbolo() {
    	tablaSimbolo = new ArrayList<Simbolo>();
    }
    
    public ArrayList<Simbolo> getTabla() {
        return tablaSimbolo;
    }

    public Simbolo existeSimbolo(Simbolo s) {
    	
    	if (tablaSimbolo.contains(s)){
    		return tablaSimbolo.get(tablaSimbolo.indexOf(s));
    	}
        return null;
    }

    public void addSimbolo(Simbolo s) {
        Simbolo aux = existeSimbolo(s);
        if (aux == null) {
        	tablaSimbolo.add(s);
        }
    }

    public void eliminarSimbolo(Simbolo s) {
        if (tablaSimbolo.contains(s)){
        	tablaSimbolo.remove(s);
        }
    }

    /* No se para que escribir lo mismo, lo dejo para acordarme que estaba
     * public boolean contains(Simbolo s) {
        return tablaSimbolo.contains(s);
    }*/

    
    public void imprimirTabla() {
        Log logSimbolos = new Log("tablaSimbolo.log");
        System.out.println("TABLA DE SIMBOLOS");
        System.out.println("TIPO    VALOR");
        for (int i = 0; i < tablaSimbolo.size(); i++) {
            logSimbolos.addLog(tablaSimbolo.get(i).getTipo() + " " + tablaSimbolo.get(i).getValor());
        }
        logSimbolos.imprimir();
    }

    /*esto lo hace por los numeros!! ver si es necesario hablarlo con juli
     public void addTipo(String valor, String variableTipo, Logger log , int linea,String tam) {
      Simbolo s = existeSimbolo(new Simbolo(new StringBuffer(valor), ""));
        if (s.esVacio()) {
            s.setTipoVariable(variableTipo);
            s.setDeclarado(true);
            s.setTamanio(tam);
        } else {
            //System.out.println("ERROR ya se encuentra declarada esta variable");
            log.addLogger("ERROR sintactico en linea: "+linea+  " ya se encuentra declarada esta variable");
        }

    }
    public boolean existeTipoVariable(String iden,String tipo){
        Simbolo s = existeSimbolo(new Simbolo(new StringBuffer(iden), ""));
        return s.isDeclarado() && tipo.equals(s.getTipoVariable());
    }*/
}
