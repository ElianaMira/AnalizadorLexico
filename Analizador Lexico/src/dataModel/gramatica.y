%{
package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;
%}

%token SI,SINO,ENTONCES,IMPRIMIR,IDENTIFICADOR, DIMENSION ,VECTOR, DE,CADENA, INT,FLOTANTE,PARA,ASIG,MAYOR_IGUAL,MENOR_IGUAL,DISTINTO

%start programa

%%


programa: sentencias { logSintactico.addLog("El programa finalizo correctamente"); };

sentencias:
	 sentencia {indiceSentencias = indiceSentencia;}
	 |sentencias sentencia  ;

sentencia:	
	declaracion 
	|asignacion ';' {indiceSentencia = indiceAsignacion;}
	|sentenciaestructurada
	|condicion ';'
	|impresion ;

declaracion:
	numero variables ';' { $$.sval = $1.sval;}
	|numero ';'{sintacticoError.addLog("Error sintactico -> Declaracion invalida.");}
	|VECTOR IDENTIFICADOR DIMENSION DE numero ';' {lexico.getTablaSimbolos().addTipo($1.sval,"VECTOR FLOTANTE");}
	|VECTOR IDENTIFICADOR ';'{sintacticoError.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");};

variables: 

	IDENTIFICADOR {	$1.obj = varTipo;
					lexico.getTablaSimbolos().addTipo($$.sval,varTipo);}
	|variables','IDENTIFICADOR { $3.obj = varTipo; };

asignacion: 
	IDENTIFICADOR ASIG expresion  
	{
		Token identificador = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ identificador.getPuntero().getValor() +" no se encuentra declarada.");
		}
		indiceAsignacion = vectorTercetos.size();
		String operador1 = $1.sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion,varTipo));
			indiceExpresion = 0;
		}
		else	
			vectorTercetos.add(new Tercetos(":=",operador1,$3.sval,varTipo));
	}
	
	
	|IDENTIFICADOR'['expresion']' ASIG expresion  
	{
		Token identificador = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ identificador.getPuntero().getValor() +" no se encuentra declarada.");
		}
		String operador1 = $1.sval + $2.sval + $3.sval + $4.sval;
		if (indiceExpresion != 0){
			vectorTercetos.add(new Tercetos(":=",operador1,indiceExpresion));
			indiceExpresion = 0;	
		}
		else{
			vectorTercetos.add(new Tercetos(":=",operador1,$6.sval));
		}				
	};
	
numero:
	FLOTANTE {	varTipo = "flotante";} 
	|INT  { varTipo = "int";
	  };	  
	
expresion:
	termino 
	{
		$$.sval = $1.sval;
		$$.obj = $1.obj;
	}
	|expresion '+' termino 
	{	
		Token operador1 = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		Token operador2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador1.getPuntero().getValor() +" no se encuentra declarada.");
		}
		if(!lexico.getTablaSimbolos().existeTipoVariable($3.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador2.getPuntero().getValor() +" no se encuentra declarada.");
		}
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());		
		vectorTercetos.add(new Tercetos("+",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
		 
	} 
	|expresion '-' termino
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		Token operador2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador1.getPuntero().getValor() +" no se encuentra declarada.");
		}
		if(!lexico.getTablaSimbolos().existeTipoVariable($3.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador2.getPuntero().getValor() +" no se encuentra declarada.");
		}
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("-",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	};

vector:
 IDENTIFICADOR DIMENSION DE numero
 {
	  $$.sval = $1.sval + $2.sval + $3.sval + $4.sval;
	  lexico.getTablaSimbolos().addTipo($$.sval,"VECTOR");
	  
};
	
termino:
	argumento
	{
		$$.sval = $1.sval;	
		$$.obj = $1.obj;
	}
	|termino '*' argumento 
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		Token operador2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador1.getPuntero().getValor() +" no se encuentra declarada.");
		}
		if(!lexico.getTablaSimbolos().existeTipoVariable($3.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador2.getPuntero().getValor() +" no se encuentra declarada.");
		}
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("*",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
	|termino '/' argumento
	{
		Token operador1 = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		Token operador2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
		if(!lexico.getTablaSimbolos().existeTipoVariable($1.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador1.getPuntero().getValor() +" no se encuentra declarada.");
		}
		if(!lexico.getTablaSimbolos().existeTipoVariable($3.sval,"flotante")){
			sintacticoError.addLog("Error: la variable "+ operador2.getPuntero().getValor() +" no se encuentra declarada.");
		}
		String op1 = new String(operador1.getPuntero().getValor());
		String op2 = new String(operador2.getPuntero().getValor());			
		vectorTercetos.add(new Tercetos("/",op1,op2,varTipo));
		indiceExpresion = vectorTercetos.size();
		
	}
	|termino '*' error { sintacticoError.addLog("Error sintactico-> Falta el factor del lado derecho del operador *"); }
	|termino '/' error { sintacticoError.addLog("Error sintactico-> Falta el factor del lado derecho del operador /"); };
		
argumento:
	IDENTIFICADOR 
	{
		$1.ival = nroAmbito;
		$1.obj = "IDENTIFICADOR";
		Token identificador = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
		existeVariable(identificador);
		$1.sval = identificador.getPuntero().getValor().toString();
		$$.sval = $1.sval;
		$$.obj = $1.obj;
		$$.ival = $1.ival;
	}	
	|numero
	|vector {};

comparador:
	'<'  { $$.sval = "<"; }
	|MAYOR_IGUAL { $$.sval = "MAYOR_IGUAL"; }
	|'>' { $$.sval = ">"; }
	|MENOR_IGUAL { $$.sval = "MENOR_IGUAL"; }
	|'=' { $$.sval = "="; }
	|DISTINTO { $$.sval = "DISTINTO"; };		


sentenciaestructurada: 	
				sentenciafor
				|sentenciaif;
				
sentenciafor: PARA condicion_for
			{
				vectorTercetos.add(new Tercetos("BF",$2.sval,"_","",vectorTercetos.size()+1,true)); 
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
			bloque_sentencias
			{
				String topePilaFin = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePilaFin));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()+3)+"]");
				String topePilaBI =  pila.pop();
				String topePilaIndice = pila.pop();	
				vectorTercetos.add(new Tercetos("+",topePilaIndice,incrementoSentFor,varTipo,vectorTercetos.size()+1,true)); 
				vectorTercetos.add(new Tercetos("BI","["+topePilaBI+"]","_","",vectorTercetos.size()+1,true)); 
			}
			| PARA condicion_for ';'{sintacticoError.addLog("Error sintactico->Falta el cuerpo de la sentencia FOR.");}	
			;

bloque_sentencias: '{'sentencias'}' 
					| sentencia	
					;

condicion_for: 	'(' asignacion_for exp_logica_for argumento ')' 
				{	
					$$.sval = $3.sval;
					Token aux = obtenerToken($4.sval,nroAmbito,(String)$4.obj); 
					incrementoSentFor = aux.getPuntero().getValor().toString();
				
				}
				|'('asignacion_for exp_logica_for argumento 	  {sintacticoError.addLog("Error sintactico->Falta cerrar parentesis en sentencia FOR.");}
				|asignacion_for exp_logica_for  argumento ')'    {sintacticoError.addLog("Error sintactico->Falta abrir parentesis en sentencia FOR.");}
				;
				
asignacion_for: IDENTIFICADOR ASIG argumento ';'
				{	
					StringBuffer sb1 = new StringBuffer();
					sb1.append($1.sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					$1.obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append($3.sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					$3.obj = simb2.getTipo();
					
					Token aux = obtenerToken($1.sval,nroAmbito,(String)$1.obj); 
					Token aux2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);				
					$1.sval= aux.getPuntero().getValor().toString();
					String posTofloat = new String(aux2.getPuntero().getValor().toString());
					
					posTofloat = new String("["+String.valueOf(vectorTercetos.size()+"]"));					
					vectorTercetos.add(new Tercetos(":=",aux.getPuntero().getValor().toString(),$3.sval,varTipo,vectorTercetos.size()+1,true)); 					
					pila.push($1.sval);
					pila.push(String.valueOf(vectorTercetos.size()+1));
				}	
				;
			
exp_logica_for: IDENTIFICADOR MAYOR_IGUAL argumento ';'
				{
					Token aux = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
					Token aux2 =obtenerToken($3.sval,nroAmbito,(String)$3.obj);
					$1.sval=aux.getPuntero().getValor().toString();
					$1.obj = aux.getTipo();
					vectorTercetos.add(new Tercetos(">=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					
					$$.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
				| IDENTIFICADOR '<' argumento	';'
				{
					StringBuffer sb1 = new StringBuffer();
					sb1.append($1.sval); 
					Simbolo s1 = new Simbolo(sb1,"");
					Simbolo simb1 = getSimbolo(s1);
					$1.obj = simb1.getTipo();
					
					StringBuffer sb2 = new StringBuffer();
					sb2.append($3.sval); 
					Simbolo s2 = new Simbolo(sb2,"");
					Simbolo simb2 = getSimbolo(s2);
					$3.obj = simb2.getTipo();
					
					Token aux = obtenerToken($1.sval,nroAmbito,(String)$1.obj); 
					Token aux2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj); 
					$1.sval=aux.getPuntero().getValor().toString();
					$1.obj = aux.getTipo();
					
					vectorTercetos.add(new Tercetos("<",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					$$.sval = new String("["+String.valueOf(vectorTercetos.size() +"]"));
				}
				| IDENTIFICADOR MENOR_IGUAL argumento ';'
				{
					Token aux = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
					Token aux2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
					$1.sval=aux.getPuntero().getValor().toString();
					$1.obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<=",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					$$.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
				| IDENTIFICADOR '>' argumento	';'
				{
					Token aux =obtenerToken($1.sval,nroAmbito,(String)$1.obj);
					Token aux2 = obtenerToken($3.sval,nroAmbito,(String)$3.obj);
					$1.sval=aux.getPuntero().getValor().toString();
					$1.obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos(">",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true));  
					$$.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
				| IDENTIFICADOR DISTINTO argumento ';'
				{
					Token aux = obtenerToken($1.sval,nroAmbito,(String)$1.obj);
					Token aux2 =obtenerToken($3.sval,nroAmbito,(String)$3.obj);
					$1.sval=aux.getPuntero().getValor().toString();
					$1.obj = aux.getTipo();
					if(aux2.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux2.getPuntero().getValor().toString()+"'> no se encuentra declarada.");					
					if(aux.getTipo().equals("IDENTIFICADOR"))
						sintacticoError.addLog("Error: la variable <'" +aux.getPuntero().getValor().toString()+"'> no se encuentra declarada.");									
					if(!aux.getTipo().equals("INT")||!aux2.getTipo().equals("INT"))
						sintacticoError.addLog("Error-> No se permiten identificadores de tipo float en la comparacion de la sentencia 'FOR'. ");
					vectorTercetos.add(new Tercetos("<>",aux.getPuntero().getValor().toString(),aux2.getPuntero().getValor().toString(),varTipo,vectorTercetos.size()+1,true)); 
					$$.sval = new String("["+String.valueOf(vectorTercetos.size()+"]"));
				}
				| IDENTIFICADOR '>' error 		{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
				| IDENTIFICADOR MAYOR_IGUAL error	{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
				| IDENTIFICADOR '<' error 		{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
				| IDENTIFICADOR MENOR_IGUAL error 	{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}				
				| IDENTIFICADOR DISTINTO error 	{sintacticoError.addLog("Error sintactico->Se esperaba un Factor en la comparacion de la sentencia FOR.");}
				| IDENTIFICADOR error 	';'				{sintacticoError.addLog("Error sintactico->Error en la comparacion de la sentencia FOR.");}
				;
 
sentenciaif: SI '('condicion')' ENTONCES
			{
			vectorTercetos.add(new Tercetos("BF"," ","")); 
			pila.push(String.valueOf(vectorTercetos.size()-1));			
			}  bloque_if
			|SI bloque_if {sintacticoError.addLog("Error sintactico->Falta la condicion en la sentencia IF.");} ';'			
			;

bloque_if: 	
			bloque_sentencias 
			{
				vectorTercetos.add(new Tercetos("BI","","_")); 
				String topePila = pila.pop();
				Tercetos tercetoBF = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBF.setElem3("["+String.valueOf(vectorTercetos.size()+1)+"]");
				pila.push(String.valueOf(vectorTercetos.size()-1));
			}
			SINO bloque_sentencias
			{
				String topePila = pila.pop();
				Tercetos tercetoBI = vectorTercetos.elementAt(Integer.parseInt(topePila));
				tercetoBI.setElem2("["+String.valueOf(vectorTercetos.size()+1)+"]");
			}
			|'{'sentencias {sintacticoError.addLog("Error sintactico->Falta cerrar llave en el cuerpo de la sentencia IF.");} SINO bloque_sentencias 
			|sentencias'}' {sintacticoError.addLog("Error sintactico->Falta abrir llave en el cuerpo de la sentencia IF.");} SINO bloque_sentencias 			
			;


condicion: 
	expresion comparador expresion
	{
		if($1.obj != $3.obj)
			Warning("Warning: Los tipos de los operandos en la comparacion de la sentencia son distintos");
		vectorTercetos.add(new Tercetos($2.sval,$1.sval,$3.sval,varTipo));
	}
	| expresion comparador { sintacticoError.addLog("Error sintactico-> Falta lado derecho de la expresion.");}                      
	| expresion comparador error { sintacticoError.addLog("Error sintactico-> Falta abrir parentisis en la expresion.");};

impresion: 
	IMPRIMIR'('CADENA')'';' 
	{
		vectorTercetos.add(new Tercetos("IMPRIMIR",$3.sval,"_"));
		lexico.getTablaSimbolos().addTipo($3.sval,"STRING");
	}
	|IMPRIMIR'('CADENA {sintacticoError.addLog("Error sintactico->Falta cerrar parentesis en la instruccion Imprimir.");}
	|IMPRIMIR CADENA   {sintacticoError.addLog("Error sintactico->La cadena de la sentencia Imprimir debe estar entre parentesis.");}
	|IMPRIMIR CADENA ')' {sintacticoError.addLog("Error sintactico->Falta abrir parentesis en la instruccion 'Imprimir'.");}	
	|IMPRIMIR'('')'      {sintacticoError.addLog("Error sintactico->Falta la cadena en la instruccion Imprimir.");}					
	|IMPRIMIR error 	 {sintacticoError.addLog("Error sintactico en la instrucion 'Imprimir'.");};


%%
  private Log logSintactico = new Log("sintactico.log");
  private Log sintacticoError = new Log("errores_sintacticos.log");
  private AnalizadorLexico lexico;
  private Vector<Tercetos> vectorTercetos;
  private boolean errores;
  String varTipo;
  String incrementoSentFor;
  Stack<String> pila;
  int nroAmbito = 1;
  int indiceExpresion = 0;
  int indiceSentencia = 0;
  int indiceTermino = 0;
  int indiceArgumento = 0;
  int indiceSentencias = 0;
  int indiceAsignacion=0;
  
  public Parser(AnalizadorLexico l) {
         lexico = l;
         pila = new Stack<String>();
         vectorTercetos = new Vector<Tercetos>(); 
         logSintactico.generar();
         sintacticoError.generar();

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

public boolean fueDefinida(Token t){
	return t.tieneTipo();
}

public void imprimirErrores(){
    sintacticoError.imprimir();
}

public Simbolo getSimbolo(Simbolo s){
	return TablaSimbolo.obtenerSimbolo(s);
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
	for(int i= 0; i < vectorTercetos.size();i++){
		System.out.print((i+1)+" ");
		vectorTercetos.elementAt(i).mostrarTerceto();
	}
}

public boolean hayErrores(){
    return !(sintacticoError.estaVacio());
}

public boolean isEntero(String elem){
	return (elem.charAt(0)>='0' && elem.charAt(0)<='9');
}

public Vector<Tercetos> getTercetos(){
    return vectorTercetos;
}