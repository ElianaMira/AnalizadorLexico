package dataModel;

import java.io.FileNotFoundException;
import java.io.IOException;
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
	private Token token;
	private int nroLinea;
	private ParserVal parserVal;
	
	public AnalizadorLexico(String ruta){
		lector = new LectorArchivo(ruta);
		tablaS = new TablaSimbolo();
		errores = new ArrayList<String>();
		estados = new Matriz(16,19);
		accionesSemanticas = new Matriz(16,19);
		
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
        for (int i = 0; i < 16; i++) {
            System.out.print("F:" + i);
            for (int j = 0; j < 19; j++) {
                System.out.print(" C" + j + ":" + estados.get(i, j));
            }
            System.out.println("");
        }
    }

    public void imprimirAcciones() {
        for (int i = 0; i < 16; i++) {
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
    
    public Token obtenerToken() {
        StringBuffer lexema = new StringBuffer();
        Integer eActual = 0;
        Integer eSig = 0;
        Token token = new Token();
        char caracter = ' ';
        while (caracter != '#' && eSig != 16) {
            caracter = lector.getCaracter();
            AccionesSemanticas accion = (AccionesSemanticas) accionesSemanticas.getCelda(caracter, eActual);
            eSig = (Integer) estados.getCelda(caracter, eActual);
            token = accion.ejecutar(lexema, caracter, tablaS, lector.getLine());
            if (token != null){
                token.setLinea(lector.getLine()+1);
            }

            if (accion.getError() == true) {
                errores.add(accion.getMsjError());
                logErrores.addLog(accion.getMsjError());
                accion.setError(false);
            }

             if (accion.getRetroceder()) {
                lector.retrocederPosicion();
                accion.setRetroceder(false);
                eSig = (Integer) estados.getCelda(caracter, eActual);
            }
            eActual = eSig;
            if (eActual == 16) {
                lexema = new StringBuffer().append("");
            }
        }
        return token;
    }
    
    public int yylex() throws FileNotFoundException, IOException {
    	 int numero = 0;
    	 nroLinea = lector.getLine();
         token = obtenerToken();
         if (token != null) {
             logToken.addLog("<"+token.getLinea() +","+ token.getTipo() + "," + token.getPuntero().getValor() + ">");

             if (token.getTipo().equals("INT")) {
                 numero = Parser.INT;
             }
             else{ 
            	 if (token.getTipo().equals("FLOAT")) {
                 numero = Parser.FLOAT;
	             } else if (token.getTipo().equals(":=")) {
	                 numero = Parser.ASIG;
	             } else if (token.getTipo().equals("IF")) {
	                 numero = Parser.IF;
	             }/*else if (token.getTipo().equals("OF")) {
	                 numero = Parser.OF;
	             }*/
	               else if (token.getTipo().equals("FOR")) {
	                 numero = Parser.FOR;
	             } else if (token.getTipo().equals("THEN")) {
	                 numero = Parser.THEN;
	             } else if (token.getTipo().equals("ELSE")) {
	                 numero = Parser.ELSE;
	             } else if (token.getTipo().equals("PRINT")) {
	                 numero = Parser.PRINT;
	             } else if (token.getTipo().equals("VECTOR")) {
	                 numero = Parser.VECTOR;
	             } else if (token.getTipo().equals("CADENA")) {
	                 numero = Parser.CADENA;
	             } else if (token.getTipo().equals("IDENTIFICADOR")) {
	                 numero = Parser.IDENTIFICADOR;
	             } else if (token.getPuntero().getValor().length() == 1) {
	                 numero = token.getPuntero().getValor().charAt(0);
	             } 
             }
             parserVal = new ParserVal(token.getPuntero().getValor().toString());
         }
         return numero;
     }
    
    public boolean masTokens() {
        return (!lector.finArchivo());
    }
    
    public ParserVal getValorSimbolo() {
        return parserVal;
    }
    
    public int getLineas(){
    	return lector.getLine();
    }
 } 
    
