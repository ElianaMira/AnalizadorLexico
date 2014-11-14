package dataModel;

import java.util.ArrayList;


public class TablaSimbolo {

	protected static ArrayList<Simbolo> tablaSimbolo;

    public TablaSimbolo() {
    	tablaSimbolo = new ArrayList<Simbolo>();
    }
    
    public static ArrayList<Simbolo> getTabla() {
        return tablaSimbolo;
    }

    public static Simbolo obtenerSimbolo(Simbolo s) {
    	
    	if (tablaSimbolo.contains(s)){
    		return tablaSimbolo.get(tablaSimbolo.indexOf(s));
    	}
        return null;
    }
    
    public static boolean existeSimbolo(Token t){
    	if  (tablaSimbolo.contains(t.getPuntero()))
    		return true;
    	return false;
    }

    public void addSimbolo(Simbolo s) {
        Simbolo aux = obtenerSimbolo(s);
        if (aux == null) {
        	tablaSimbolo.add(s);
        }
    }
    
    public static Token getToken(Simbolo lexema,int ambito){
    	return new Token(lexema.getTipo(),lexema,ambito);    	 	  
    }
    
    public void eliminarSimbolo(Simbolo s) {
        if (tablaSimbolo.contains(s)){
        	tablaSimbolo.remove(s);
        }
    }
    
    public static  void existeVariable(Token t){
    	Simbolo s = obtenerSimbolo(t.getPuntero());
    	if (s == null){
    		System.out.println("Linea "+t.getLinea()+":La variable <+t.getLexema()+> no se encuentra en la tabla de simbolos.");
    	}
    }
    
    public void imprimirTabla() {
        Log logSimbolos = new Log("tablaSimbolo.log");
        System.out.println("TABLA DE SIMBOLOS");
        System.out.println("TIPO          VALOR");
        for (int i = 0; i < tablaSimbolo.size(); i++) {
            logSimbolos.addLog(tablaSimbolo.get(i).getTipo() + "        " + tablaSimbolo.get(i).getValor());
        }
        logSimbolos.imprimir();
    }

}
