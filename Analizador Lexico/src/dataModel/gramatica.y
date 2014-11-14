%{

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

%}

%token  SI,SINO,ENTONCES,IMPRIMIR,IDENTIFICADOR, VECTOR, DE,CADENA, INT,FLOAT,PARA,ASIG,MAYOR_IGUAL,MENOR_IGUAL,DISTINTO

%start programa

%%


programa: sentencias { logSintactico.addLog("El programa finalizo correctamente"); };

sentencias:
	 sentencia
	 |sentencias sentencia  ;

sentencia:	
	declaracion 
	|asignacion ';'
	|seleccion
	|bucle
	|condicion ';'
	|impresion ;

declaracion:
	numero variables ';' { $$.sval = $1.sval; }
	|numero error {yyerror("Error sintactico-> Declaracion invalida.");}
	|VECTOR IDENTIFICADOR'['INT '.''.' INT']' DE numero ';'{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
	|VECTOR IDENTIFICADOR error {logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");};

variables: 

	IDENTIFICADOR {	$1.stipo = varTipo; }
	|variables','IDENTIFICADOR { $3.stipo = varTipo; };

asignacion: 
	IDENTIFICADOR ASIG expresion  
	{
		Token identificador = obtenerToken($1.sval,nroAmbito,$1.stipo);
		if(!existeToken(identificador))
			yyerror("Error: la variable <'" +aux.getLexema()+"'> no se encuentra declarada.");
		
		String operador1 = $1.sval;
		String operador2 = new String($3.sval);
		vectorTercetos.add(new Tercetos(":-",operador1,operador2));
			
		Imprimir("Asignacion.");
	}
	|IDENTIFICADOR '['expresion']' ASIG expresion ; { VER BIENN QUE PONER}
	
numero:
	FLOAT {	varTipo = "float";} 
	|INT  { varTipo = "int";
	  };
	
expresion:
	termino 
	{
		$$.sval = $1.sval;
		$$.stipo = $1.stipo;
	}
	|expresion '+' termino 
	{	
		Token operador1 = obtenerToken($1.sval,nroAmbito,obtenerToken);
		Token operador2 = obtenerToken($3.sval,nroAmbito,obtenerToken);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("+",op1,op2); 
	} 
	|expresion '-' termino
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,$1.stipo);
		Token operador2 = obtenerToken($3.sval,nroAmbito,$1.stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("-",op1,op2); 
	};

vector:
	IDENTIFICADOR '['expresion']';
	
termino:
	argumento
	{
		$$.sval = $1.sval;	
		$$.stipo = $1.stipo;
	}
	|termino '*' argumento 
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,$1.stipo);
		Token operador2 = obtenerToken($3.sval,nroAmbito,$1.stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("*",op1,op2);
	}
	|termino '/' argumento
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,$1.stipo);
		Token operador2 = obtenerToken($3.sval,nroAmbito,$1.stipo);
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("/",op1,op2);
	}
	|termino '*' error { yyerror("Error sintactico-> Falta el factor del lado derecho del operador *"); }
	|termino '/' error { yyerror("Error sintactico-> Falta el factor del lado derecho del operador /"); };
		
argumento:
	IDENTIFICADOR 
	{
		$1.simb.setAmbito(nroAmbito);
		
		Token identificador = obtenerToken($1.sval,nroAmbito,$1.stipo);
		$1.stipo = identificador.getTipo();
		existeVariable($1.simb);
		$1.sval = identificor.getPuntero().getValor();
		$$.sval = $1.sval;
		$$.stipo = $1.stipo;
		$$.simb = $1.simb;
	}	
	|numero
	|vector;

comparador:
	'<'  { $$.sval = "<"; }
	|MAYOR_IGUAL { $$.sval = "MAYOR_IGUAL"; }
	|'>' { $$.sval = ">"; }
	|MENOR_IGUAL { $$.sval = "MENOR_IGUAL"; }
	|'=' { $$.sval = "="; }
	|DISTINTO { $$.sval = "DISTINTO"; };		

seleccion: 
	SI'('condicion')'ENTONCES'{'sentencias'}' {logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES");}	  
	|SI'('condicion')'ENTONCES'{'sentencias'}' SINO '{'sentencias'}'  {logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES SINO");}
	|SI'('condicion')'ENTONCES'{'sentencias'}' SINO  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
	|SI'('condicion')''{'sentencias'}' SINO  {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia ENTONCES ");}
	|SI'('condicion')'ENTONCES {logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");};

condicion: 
	expresion comparador expresion
	{
		if(!$1.stipo.equals($3.stipo))
			Warning("Warning: Los tipos de los operandos en la comparacion de la sentencia son distintos");
		vectorTercetos.add(new Tercetos($2.sval,$1.sval,$3.sval));
	}
	| expresion comparador { yyerror("Error sintactico-> Falta lado derecho de la expresion.");}                      
	| expresion comparador error { yyerror("Error sintactico-> Falta abrir parentisis en la expresion.");};

impresion: 
	IMPRIMIR'('CADENA')'';' 
	{
		vectorTercetos.add(new Tercetos("IMPRIMIR",$3.sval,"_"));
		Imprimir("Fin de la sentencia Print.");
	}
	|IMPRIMIR'('CADENA {yyerror("Error sintactico->Falta cerrar parentesis en la instruccion Imprimir.");}
	|IMPRIMIR CADENA   {yyerror("Error sintactico->La cadena de la sentencia Imprimir debe estar entre parentesis.");}
	|IMPRIMIR CADENA ')' {yyerror("Error sintactico->Falta abrir parentesis en la instruccion 'Imprimir'.");}	
	|IMPRIMIR'('')'      {yyerror("Error sintactico->Falta la cadena en la instruccion Imprimir.");}
	|IMPRIMIR'('error')' {yyerror("Error sintactico->La cadena es incorrecta en la instruccion Imprimir.");}					
	|IMPRIMIR error 	 {yyerror("Error sintactico en la instrucion 'Imprimir'.");};

bucle:
	PARA '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR'+'')' '{' sentencias '}'';' {logSintactico.addLog("Linea "+lexico.getLineas()+":bucle");};

%%
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;
  private Vector<Tercetos> vectorTercetos;
  private boolean errores;
  
  public Parser(AnalizadorLexico l) {
         lexico = l;
         vectorTercetos = new Vector<Tercetos>();
 		 pila = new Stack<String>();  
         logSintactico.generar();

    }

    private int yylex(){
        int yyl_return = -1;
        while (lexico.masTokens()) {
            try {
                yyl_return = lexico.yylex();
                yylval = lexico.getValorSimbolo();

            } catch (IOException e) {
                System.err.println("error de E/S:" + e);
            }
            return yyl_return;
        }
        return 0;
    }

public void putNegativo(String valor){
        Simbolo s = new Simbolo(new StringBuffer("-"+valor),"INT");
        lexico.getTablaSimbolos().addSimbolo(s);
        
        Simbolo raya = new Simbolo(new StringBuffer("-"),"-");
        lexico.getTablaSimbolos().eliminarSimbolo(raya);
        
        Simbolo elival = new Simbolo(new StringBuffer(valor),"INT");
        lexico.getTablaSimbolos().eliminarSimbolo(elival);
}

public void imprimirSintactico(){
    logSintactico.imprimir();
}

public boolean existeToken(Token t){
	return  TablaSimbolo.existeSimbolo(t);	
}

public Token obtenerToken(String lexema,int ambito,String tipo){
	StringBuffer sb = new StringBuffer();
	sb.append(lexema);
	Simbolo simb = new Simbolo(sb,tipo);
	return TablaSimbolo.getToken(simb,ambito);
}

void yyerror(String s)
{
	errores = true;
	System.out.println("Linea "+lexico.getLineas()+": "+s);
}

public boolean TieneErrores(){
	return errores;
}


void Warning(String s){
	System.out.println("Linea "+lexico.getLineas()+": "+s);
}
//imprime error si la variable no existe
public void existeVariable(Token t){
	TablaSimbolo.existeVariable(t);	
}


public void mostrarTercetos(){
	vectorTercetos.add(new Tercetos("FIN","_","_"));
	for(int i= 0; i<vectorTercetos.size();i++){
		System.out.print((i+1)+" ");
		vectorTercetos.elementAt(i).mostrarTerceto();
	}
}
