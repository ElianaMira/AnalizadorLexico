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
	private ParserVal parserVal;

	public AnalizadorLexico(String ruta) {
		lector = new LectorArchivo(ruta);
		tablaS = new TablaSimbolo();
		errores = new ArrayList<String>();
		estados = new Matriz(20, 19);
		accionesSemanticas = new Matriz(20, 19);
		InicEstructuras inicia = new InicEstructuras();
		accionesSemanticas = inicia.inicializarAcciones();
		estados = inicia.InicializarEstados();

	}

	public Matriz getEstados() {
		return this.estados;
	}

	public Matriz getAcciones() {
		return this.accionesSemanticas;
	}

	public TablaSimbolo getTablaSimbolos() {
		return this.tablaS;
	}

	void crearToken() {
		logToken.generar();
	}

	void crearLexico() {
		logErrores.generar();
	}

	public void imprimirEstados() {
	for (int i = 0; i < 21; i++) {
		System.out.print("F:" + i);
		for (int j = 0; j < 21; j++) {
			System.out.print(" C" + j + ":" + estados.get(i, j));
		}
		System.out.println("");
	}
	}

	public void imprimirAcciones() {
		for (int i = 0; i < 21; i++) {
		System.out.print("F:" + i);
		for (int j = 0; j < 21; j++) {
			if (accionesSemanticas.get(i, j) != null) {
				AccionesSemanticas a = (AccionesSemanticas) accionesSemanticas
						.get(i, j);
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
		while (caracter != '#' && eSig != 21) {
			caracter = lector.getCaracter();
			AccionesSemanticas accion = (AccionesSemanticas) accionesSemanticas.getCelda(caracter, eActual);
			eSig = (Integer) estados.getCelda(caracter, eActual);
			token = accion.ejecutar(lexema, caracter, tablaS, lector.getLine());
			if (token != null) {
				token.setLinea(lector.getLine() + 1);
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
			if (eActual == 21) {
				lexema = new StringBuffer().append("");
			}
		}
		return token;
	}

	public int yylex() throws FileNotFoundException, IOException {
		int numero = 0;
		token = obtenerToken();
		if (token != null) {
			logToken.addLog("<" + token.getLinea() + "," + token.getTipo()
					+ "," + token.getPuntero().getValor() + ">");

			if (token.getTipo().equals("INT")) {
				numero = Parser.INT;
			}
			else{
				if (token.getTipo().equals("FLOTANTE")) {
					numero = Parser.FLOTANTE;
				} else if (token.getTipo().equals(":=")) {
					numero = Parser.ASIG;
				}else if (token.getTipo().equals(">=")) {
					numero = Parser.MAYOR_IGUAL;
				}else if (token.getTipo().equals("<=")) {
					numero = Parser.MENOR_IGUAL;
				}else if (token.getTipo().equals("^=")) {
					numero = Parser.DISTINTO;
				}else if (token.getTipo().equals("SI")) {
					numero = Parser.SI;
				} else if (token.getTipo().equals("DE")) {
					numero = Parser.DE;
				} else if (token.getTipo().equals("PARA")) {
					numero = Parser.PARA;
				} else if (token.getTipo().equals("ENTONCES")) {
					numero = Parser.ENTONCES;
				} else if (token.getTipo().equals("SINO")) {
					numero = Parser.SINO;
				} else if (token.getTipo().equals("IMPRIMIR")) {
					numero = Parser.IMPRIMIR;
				} else if (token.getTipo().equals("VECTOR")) {
					numero = Parser.VECTOR;
				}else if (token.getTipo().equals("DIMENSION")) {
						numero = Parser.DIMENSION;
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

	public int getLineas() {
		return lector.getLine();
	}
}
