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
    
    public void imprimirTabla() {
        Log logSimbolos = new Log("tablaSimbolo.log");
        System.out.println("TABLA DE SIMBOLOS");
        System.out.println("TIPO    VALOR");
        for (int i = 0; i < tablaSimbolo.size(); i++) {
            logSimbolos.addLog(tablaSimbolo.get(i).getTipo() + " " + tablaSimbolo.get(i).getValor());
        }
        logSimbolos.imprimir();
    }

}
