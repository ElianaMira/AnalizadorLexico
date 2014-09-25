package dataModel;

import java.util.ArrayList;

import accionesSemanticas.AccionesSemanticas;

public class AnalizadorLexico {
	
	private Matriz estados;
	private Matriz accionesSemanticas;
	private LectorArchivo lector;
	private TablaSimbolo tablaS;
	private ArrayList<String> errores;
	private Log logErrores = new Log("errores_lexico.log");
	private Log logToken = new Log("token.log");
	
	public AnalizadorLexico(String ruta){
		lector = new LectorArchivo(ruta);
		tablaS = new TablaSimbolo();
		errores = new ArrayList<String>();
		estados = new Matriz(15,19);
		accionesSemanticas = new Matriz(15,19);
		
		InicEstructuras inicia = new InicEstructuras();
		accionesSemanticas = inicia.inicializarAcciones();
		estados = inicia.InicializarEstados();
	
	}
	public Matriz getEstados(){
		return this.estados;
	}
	
	public Matriz getAcciones(){
		return this.accionesSemanticas;
	}
	
	public TablaSimbolo getTablaSimbolos(){
		return this.tablaS;
	}
	
	void crearToken() {
        logToken.generar();
    }
	
	void crearLexico() {
		logErrores.generar();
    }
	
	public void imprimirEstados() {
        for (int i = 0; i < 15; i++) {
            System.out.print("F:" + i);
            for (int j = 0; j < 19; j++) {
                System.out.print(" C" + j + ":" + estados.get(i, j));
            }
            System.out.println("");
        }
    }

    public void imprimirAcciones() {
        for (int i = 0; i < 15; i++) {
            System.out.print("F:" + i);
            for (int j = 0; j < 19; j++) {
                if (accionesSemanticas.get(i, j) != null) {
                    AccionesSemanticas a = (AccionesSemanticas) accionesSemanticas.get(i, j);
                    System.out.print(" C:" + j + "_" + a.getIdentificador());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
    public Token obtenerTokens() {
        StringBuffer lexema = new StringBuffer();
        Integer eActual = 0;
        Integer eSig = 0;
        Token token = new Token();
        char caracter = ' ';
        while (caracter != '#' && eSig != 15) {
            //System.out.println("Entro");
            caracter = lector.getCaracter();
            AccionesSemanticas acc = (AccionesSemanticas) accionesSemanticas.getCelda(caracter, eActual);
            eSig = (Integer) estados.getCelda(caracter, eActual);
            //System.out.println("act:" + eActual);
            //System.out.println(acc.getIdentificador());

            token = acc.ejecutar(lexema, caracter, tablaS, lector.getLine());
            if (token != null){
                token.setLinea(lector.getLine()+1);
            }

            if (acc.getError() == true) {
                errores.add(acc.getMsjError());
                logErrores.addLog(acc.getMsjError());
                acc.setError(false);
            }

             if (acc.getRetroceder()) {
                lector.retrocederPosicion();
                acc.setRetroceder(false);
                eSig = (Integer) estados.getCelda(caracter, eActual);
            }
            eActual = eSig;
			//System.out.println("sig:" + eSiguiente);
			//System.out.println("---------------");
            if (eActual == 16) {
                lexema = new StringBuffer().append("");
            }
        }
        return token;
    }
    
	
}
