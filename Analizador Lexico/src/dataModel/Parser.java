//### This file created by BYACC 1.8(/Java extension  1.15)
//### Java capabilities added 7 Jan 97, Bob Jamison
//### Updated : 27 Nov 97  -- Bob Jamison, Joe Nieten
//###           01 Jan 98  -- Bob Jamison -- fixed generic semantic constructor
//###           01 Jun 99  -- Bob Jamison -- added Runnable support
//###           06 Aug 00  -- Bob Jamison -- made state variables class-global
//###           03 Jan 01  -- Bob Jamison -- improved flags, tracing
//###           16 May 01  -- Bob Jamison -- added custom stack sizing
//###           04 Mar 02  -- Yuval Oren  -- improved java performance, added options
//###           14 Mar 02  -- Tomas Hurka -- -d support, static initializer workaround
//### Please send bug reports to tom@hukatronic.cz
//### static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";






//#line 2 "gramatica.y"

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

//#line 24 "Parser.java"




public class Parser
{

boolean yydebug;        //do I want debug output?
int yynerrs;            //number of errors so far
int yyerrflag;          //was there an error?
int yychar;             //the current working character

//########## MESSAGES ##########
//###############################################################
// method: debug
//###############################################################
void debug(String msg)
{
  if (yydebug)
    System.out.println(msg);
}

//########## STATE STACK ##########
final static int YYSTACKSIZE = 500;  //maximum stack size
int statestk[] = new int[YYSTACKSIZE]; //state stack
int stateptr;
int stateptrmax;                     //highest index of stackptr
int statemax;                        //state when highest index reached
//###############################################################
// methods: state stack push,pop,drop,peek
//###############################################################
final void state_push(int state)
{
  try {
		stateptr++;
		statestk[stateptr]=state;
	 }
	 catch (ArrayIndexOutOfBoundsException e) {
     int oldsize = statestk.length;
     int newsize = oldsize * 2;
     int[] newstack = new int[newsize];
     System.arraycopy(statestk,0,newstack,0,oldsize);
     statestk = newstack;
     statestk[stateptr]=state;
  }
}
final int state_pop()
{
  return statestk[stateptr--];
}
final void state_drop(int cnt)
{
  stateptr -= cnt; 
}
final int state_peek(int relative)
{
  return statestk[stateptr-relative];
}
//###############################################################
// method: init_stacks : allocate and prepare stacks
//###############################################################
final boolean init_stacks()
{
  stateptr = -1;
  val_init();
  return true;
}
//###############################################################
// method: dump_stacks : show n levels of the stacks
//###############################################################
void dump_stacks(int count)
{
int i;
  System.out.println("=index==state====value=     s:"+stateptr+"  v:"+valptr);
  for (i=0;i<count;i++)
    System.out.println(" "+i+"    "+statestk[i]+"      "+valstk[i]);
  System.out.println("======================");
}


//########## SEMANTIC VALUES ##########
//public class ParserVal is defined in ParserVal.java


String   yytext;//user variable to return contextual strings
ParserVal yyval; //used to return semantic vals from action routines
ParserVal yylval;//the 'lval' (result) I got from yylex()
ParserVal valstk[];
int valptr;
//###############################################################
// methods: value stack push,pop,drop,peek.
//###############################################################
void val_init()
{
  valstk=new ParserVal[YYSTACKSIZE];
  yyval=new ParserVal();
  yylval=new ParserVal();
  valptr=-1;
}
void val_push(ParserVal val)
{
  if (valptr>=YYSTACKSIZE)
    return;
  valstk[++valptr]=val;
}
ParserVal val_pop()
{
  if (valptr<0)
    return new ParserVal();
  return valstk[valptr--];
}
void val_drop(int cnt)
{
int ptr;
  ptr=valptr-cnt;
  if (ptr<0)
    return;
  valptr = ptr;
}
ParserVal val_peek(int relative)
{
int ptr;
  ptr=valptr-relative;
  if (ptr<0)
    return new ParserVal();
  return valstk[ptr];
}
final ParserVal dup_yyval(ParserVal val)
{
  ParserVal dup = new ParserVal();
  dup.ival = val.ival;
  dup.dval = val.dval;
  dup.sval = val.sval;
  dup.obj = val.obj;
  return dup;
}
//#### end semantic value section ####
public final static short SI=257;
public final static short SINO=258;
public final static short ENTONCES=259;
public final static short IMPRIMIR=260;
public final static short IDENTIFICADOR=261;
public final static short VECTOR=262;
public final static short DE=263;
public final static short CADENA=264;
public final static short INT=265;
public final static short FLOAT=266;
public final static short PARA=267;
public final static short ASIG=268;
public final static short MAYOR_IGUAL=269;
public final static short MENOR_IGUAL=270;
public final static short DISTINTO=271;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    2,    2,    2,    2,    2,    3,
    3,    3,    3,    3,    9,    9,    4,    4,    4,   10,
   10,   11,   11,   11,   13,   12,   12,   12,   14,   14,
   14,   15,   15,   15,   15,   15,   15,    5,    5,    5,
    5,    5,    7,    8,    8,    8,    8,    6,
};
final static short yylen[] = {                            2,
    1,    1,    2,    1,    2,    1,    1,    2,    1,    3,
    2,    3,   11,    3,    1,    3,    3,    6,    4,    1,
    1,    1,    3,    3,    4,    1,    3,    3,    1,    1,
    1,    1,    1,    1,    1,    1,    1,    8,   12,    9,
    8,    5,    3,    5,    5,    4,    3,   18,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    2,
    4,    0,    6,    7,    0,    9,   30,    0,    0,   31,
   26,    0,    0,    0,    0,    0,    0,    0,    0,   11,
   15,    0,    0,    3,    5,    8,   33,   35,   37,    0,
    0,   32,   34,   36,    0,    0,    0,    0,   21,   20,
    0,   47,    0,    0,    0,    0,   14,    0,    0,   12,
    0,   10,    0,    0,    0,    0,   27,   28,    0,    0,
    0,   46,    0,    0,    0,   16,    0,    0,    0,    0,
   45,   44,    0,    0,    0,   25,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   41,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   13,    0,   39,    0,
    0,    0,    0,    0,    0,   48,
};
final static short yydgoto[] = {                          8,
    9,   10,   11,   12,   13,   14,   15,   16,   29,   17,
   18,   19,   20,   21,   45,
};
final static short yysindex[] = {                      -127,
  -10,  -18,  -85, -217, -214, -156,   14,    0, -127,    0,
    0,   16,    0,    0,   18,    0,    0,  -29,   60,    0,
    0, -204, -196,  -56, -204, -204,  -81, -189,  -20,    0,
    0,   -6, -180,    0,    0,    0,    0,    0,    0, -204,
 -204,    0,    0,    0, -204, -204, -204,    7,    0,    0,
   77,    0,   78, -155,   26,   -3,    0, -154, -204,    0,
 -130,    0, -125,   60,   60,   26,    0,    0, -204, -106,
  -54,    0, -123,   95,   26,    0,   88,    3,   35, -127,
    0,    0, -204,  113, -105,    0, -127, -110,   26, -103,
  104,  -96,  -90,   79,  -88,  -82,    0,  -84,  -26,   55,
 -215, -204, -127,  125,   21,  -80,    0,  -72,    0,  151,
  154,   76, -127,  -69,  142,    0,
};
final static short yyrindex[] = {                         0,
    0,    0,   31,    0,   52,   61,    0,    0,  203,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  -41,    0,
    0,    0,    0,    0,    0,    0,    0,   -1,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -34,    0,    0,
    0,    0,    0,    0,  145,    0,    0,    0,    0,    0,
    0,    0,    0,   22,   27,   -4,    0,    0,    0,    0,
    0,    0,   82,    0,  146,    0,    0,    0,    1,    0,
    0,    0,    0,    0,    0,    0,    0,    0,  147,    0,
    0,    0,    0,    0,    0,   12,    0,    0,    0,   23,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,
};
final static short yygindex[] = {                         0,
   87,   40,    0,    0,    0,    0,  185,    0,  204,  108,
  279,   69,    0,   70,  112,
};
final static int YYTABLESIZE=381;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         22,
   42,   22,   54,   22,   82,   26,   29,   29,   29,   58,
   29,   38,   29,   40,   93,   41,   80,   22,   22,   22,
   22,   24,   40,   61,   29,   29,   29,   29,   96,   22,
   42,   44,   43,   42,   44,   43,   43,   61,   60,   40,
   23,   41,   15,   27,  109,   40,   28,   41,   34,   49,
   50,   22,   62,   33,   43,  115,   48,   15,   29,   52,
   49,   50,   23,   40,   23,   41,   23,   24,   40,   24,
   41,   24,   29,   29,   35,   29,   36,   29,   59,  108,
   23,   23,   23,   23,   63,   24,   24,   24,   24,   73,
   29,   29,   29,   21,   21,   86,   21,   69,   21,   30,
   72,   46,   20,   20,   31,   20,   47,   20,   64,   65,
   74,   21,   21,   21,   23,   67,   68,   70,   71,   24,
   20,   20,   20,   25,   25,   42,   25,   34,   25,    1,
   76,   34,    2,    3,    4,   77,   38,    5,    6,    7,
   84,   25,   25,   25,   83,   34,    1,   40,   85,    2,
    3,    4,   79,   34,    5,    6,    7,   87,   90,   91,
    1,   94,   95,    2,    3,    4,   88,   97,    5,    6,
    7,   98,   99,   92,   57,  100,    1,  103,  101,    2,
    3,    4,   25,  107,    5,    6,    7,    1,  110,  106,
    2,    3,    4,  111,  112,    5,    6,    7,  113,  114,
  116,   81,    1,   17,   19,   18,   51,   53,  104,   32,
  102,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   22,   22,   22,
    0,    0,    0,    0,   29,   29,   29,    0,    0,   37,
   38,   39,   37,   38,   39,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   42,    0,    0,
   42,   42,   42,    0,    0,   42,   42,   42,   38,    0,
    0,   38,   38,   38,    0,    0,   38,   38,   38,   40,
    0,    0,   40,   40,   40,    0,    0,   40,   40,   40,
   23,   23,   23,    0,    0,   24,   24,   24,    0,   29,
   29,   29,    0,   55,   56,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   21,   21,   21,   66,    0,    0,    0,    0,    0,   20,
   20,   20,    0,    0,    0,    0,    0,   75,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   78,    0,    0,
   25,   25,   25,    0,    0,    0,    0,    0,    0,    0,
    0,   89,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
  105,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
    0,   43,   59,   45,   59,   91,   41,   42,   43,   91,
   45,    0,   47,   43,  125,   45,  123,   59,   60,   61,
   62,   40,    0,   44,   59,   60,   61,   62,  125,   40,
   60,   61,   62,   60,   61,   62,   41,   44,   59,   43,
   59,   45,   44,  261,  125,   43,  261,   45,    9,  265,
  266,   93,   59,   40,   59,  125,  261,   59,   93,  256,
  265,  266,   41,   43,   43,   45,   45,   41,   43,   43,
   45,   45,   42,   43,   59,   45,   59,   47,  268,   59,
   59,   60,   61,   62,  265,   59,   60,   61,   62,   93,
   60,   61,   62,   42,   43,   93,   45,   91,   47,  256,
  256,   42,   42,   43,  261,   45,   47,   47,   40,   41,
  265,   60,   61,   62,   93,   46,   47,   41,   41,   93,
   60,   61,   62,   42,   43,  125,   45,   88,   47,  257,
  261,   92,  260,  261,  262,  261,  125,  265,  266,  267,
   46,   60,   61,   62,  268,  106,  257,  125,   61,  260,
  261,  262,  259,  114,  265,  266,  267,  123,   46,  265,
  257,  265,   59,  260,  261,  262,   80,  258,  265,  266,
  267,   93,  261,   87,  256,  258,  257,  123,  263,  260,
  261,  262,  268,   59,  265,  266,  267,  257,  261,  103,
  260,  261,  262,   43,   41,  265,  266,  267,  123,  113,
   59,  256,    0,   59,   59,   59,   22,  264,  101,    6,
   99,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  269,  270,  271,
   -1,   -1,   -1,   -1,  269,  270,  271,   -1,   -1,  269,
  270,  271,  269,  270,  271,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  257,   -1,   -1,
  260,  261,  262,   -1,   -1,  265,  266,  267,  257,   -1,
   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,  257,
   -1,   -1,  260,  261,  262,   -1,   -1,  265,  266,  267,
  269,  270,  271,   -1,   -1,  269,  270,  271,   -1,  269,
  270,  271,   -1,   25,   26,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  269,  270,  271,   45,   -1,   -1,   -1,   -1,   -1,  269,
  270,  271,   -1,   -1,   -1,   -1,   -1,   59,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   69,   -1,   -1,
  269,  270,  271,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   83,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  102,
};
}
final static short YYFINAL=8;
final static short YYMAXTOKEN=271;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"'('","')'","'*'","'+'","','",
"'-'","'.'","'/'",null,null,null,null,null,null,null,null,null,null,null,"';'",
"'<'","'='","'>'",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
"'['",null,"']'",null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,"'{'",null,"'}'",null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,"SI","SINO","ENTONCES","IMPRIMIR",
"IDENTIFICADOR","VECTOR","DE","CADENA","INT","FLOAT","PARA","ASIG",
"MAYOR_IGUAL","MENOR_IGUAL","DISTINTO",
};
final static String yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia",
"sentencias : sentencias sentencia",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"sentencia : seleccion",
"sentencia : bucle",
"sentencia : condicion ';'",
"sentencia : impresion",
"declaracion : FLOAT variables ';'",
"declaracion : FLOAT error",
"declaracion : INT variables ';'",
"declaracion : VECTOR IDENTIFICADOR '[' INT '.' '.' INT ']' DE numero ';'",
"declaracion : VECTOR IDENTIFICADOR error",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"asignacion : INT IDENTIFICADOR ASIG expresion",
"numero : FLOAT",
"numero : INT",
"expresion : termino",
"expresion : expresion '+' termino",
"expresion : expresion '-' termino",
"vector : IDENTIFICADOR '[' expresion ']'",
"termino : argumento",
"termino : termino '*' argumento",
"termino : termino '/' argumento",
"argumento : IDENTIFICADOR",
"argumento : numero",
"argumento : vector",
"comparador : '<'",
"comparador : MAYOR_IGUAL",
"comparador : '>'",
"comparador : MENOR_IGUAL",
"comparador : '='",
"comparador : DISTINTO",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO '{' sentencias '}'",
"seleccion : SI '(' condicion ')' ENTONCES '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' '{' sentencias '}' SINO",
"seleccion : SI '(' condicion ')' ENTONCES",
"condicion : expresion comparador expresion",
"impresion : IMPRIMIR '(' CADENA ')' ';'",
"impresion : IMPRIMIR '(' CADENA ')' error",
"impresion : IMPRIMIR '(' ';' error",
"impresion : IMPRIMIR ';' error",
"bucle : PARA '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR '+' ')' '{' sentencias '}' ';'",
};

//#line 99 "gramatica.y"
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;


  public Parser(AnalizadorLexico l) {
         lexico = l;
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

    private void yyerror(String stack_underflow_aborting) {
//        throw new UnsupportedOperationException("Not yet implemented");
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
//#line 381 "Parser.java"
//###############################################################
// method: yylexdebug : check lexer state
//###############################################################
void yylexdebug(int state,int ch)
{
String s=null;
  if (ch < 0) ch=0;
  if (ch <= YYMAXTOKEN) //check index bounds
     s = yyname[ch];    //now get it
  if (s==null)
    s = "illegal-symbol";
  debug("state "+state+", reading "+ch+" ("+s+")");
}





//The following are now global, to aid in error reporting
int yyn;       //next next thing to do
int yym;       //
int yystate;   //current parsing state from state table
String yys;    //current token string


//###############################################################
// method: yyparse : parse input and execute indicated items
//###############################################################
int yyparse()
{
boolean doaction;
  init_stacks();
  yynerrs = 0;
  yyerrflag = 0;
  yychar = -1;          //impossible char forces a read
  yystate=0;            //initial state
  state_push(yystate);  //save it
  val_push(yylval);     //save empty value
  while (true) //until parsing is done, either correctly, or w/error
    {
    doaction=true;
    if (yydebug) debug("loop"); 
    //#### NEXT ACTION (from reduction table)
    for (yyn=yydefred[yystate];yyn==0;yyn=yydefred[yystate])
      {
      if (yydebug) debug("yyn:"+yyn+"  state:"+yystate+"  yychar:"+yychar);
      if (yychar < 0)      //we want a char?
        {
        yychar = yylex();  //get next token
        if (yydebug) debug(" next yychar:"+yychar);
        //#### ERROR CHECK ####
        if (yychar < 0)    //it it didn't work/error
          {
          yychar = 0;      //change it to default string (no -1!)
          if (yydebug)
            yylexdebug(yystate,yychar);
          }
        }//yychar<0
      yyn = yysindex[yystate];  //get amount to shift by (shift index)
      if ((yyn != 0) && (yyn += yychar) >= 0 &&
          yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
        {
        if (yydebug)
          debug("state "+yystate+", shifting to state "+yytable[yyn]);
        //#### NEXT STATE ####
        yystate = yytable[yyn];//we are in a new state
        state_push(yystate);   //save it
        val_push(yylval);      //push our lval as the input for next rule
        yychar = -1;           //since we have 'eaten' a token, say we need another
        if (yyerrflag > 0)     //have we recovered an error?
           --yyerrflag;        //give ourselves credit
        doaction=false;        //but don't process yet
        break;   //quit the yyn=0 loop
        }

    yyn = yyrindex[yystate];  //reduce
    if ((yyn !=0 ) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
      {   //we reduced!
      if (yydebug) debug("reduce");
      yyn = yytable[yyn];
      doaction=true; //get ready to execute
      break;         //drop down to actions
      }
    else //ERROR RECOVERY
      {
      if (yyerrflag==0)
        {
        yyerror("syntax error");
        yynerrs++;
        }
      if (yyerrflag < 3) //low error count?
        {
        yyerrflag = 3;
        while (true)   //do until break
          {
          if (stateptr<0)   //check for under & overflow here
            {
            yyerror("stack underflow. aborting...");  //note lower case 's'
            return 1;
            }
          yyn = yysindex[state_peek(0)];
          if ((yyn != 0) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
            if (yydebug)
              debug("state "+state_peek(0)+", error recovery shifting to state "+yytable[yyn]+" ");
            yystate = yytable[yyn];
            state_push(yystate);
            val_push(yylval);
            doaction=false;
            break;
            }
          else
            {
            if (yydebug)
              debug("error recovery discarding state "+state_peek(0)+" ");
            if (stateptr<0)   //check for under & overflow here
              {
              yyerror("Stack underflow. aborting...");  //capital 'S'
              return 1;
              }
            state_pop();
            val_pop();
            }
          }
        }
      else            //discard this token
        {
        if (yychar == 0)
          return 1; //yyabort
        if (yydebug)
          {
          yys = null;
          if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
          if (yys == null) yys = "illegal-symbol";
          debug("state "+yystate+", error recovery discards token "+yychar+" ("+yys+")");
          }
        yychar = -1;  //read another
        }
      }//end error recovery
    }//yyn=0 loop
    if (!doaction)   //any reason not to proceed?
      continue;      //skip action
    yym = yylen[yyn];          //get count of terminals on rhs
    if (yydebug)
      debug("state "+yystate+", reducing "+yym+" by rule "+yyn+" ("+yyrule[yyn]+")");
    if (yym>0)                 //if count of rhs not 'nil'
      yyval = val_peek(yym-1); //get current semantic value
    yyval = dup_yyval(yyval); //duplicate yyval if ParserVal is used as semantic value
    switch(yyn)
      {
//########## USER-SUPPLIED ACTIONS ##########
case 1:
//#line 17 "gramatica.y"
{ logSintactico.addLog("El programa finalizo correctamente"); }
break;
case 10:
//#line 32 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de una variable FLOAT");}
break;
case 11:
//#line 33 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variable float");}
break;
case 12:
//#line 34 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de una variable INT");}
break;
case 13:
//#line 35 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 14:
//#line 36 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 17:
//#line 43 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de una asignacion");}
break;
case 18:
//#line 44 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":declaracion de una asignacion");}
break;
case 19:
//#line 45 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de una asignacion");}
break;
case 38:
//#line 80 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES");}
break;
case 39:
//#line 81 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion SI ENTONCES SINO");}
break;
case 40:
//#line 82 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 41:
//#line 83 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia ENTONCES ");}
break;
case 42:
//#line 84 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 44:
//#line 90 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 45:
//#line 91 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 46:
//#line 92 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 47:
//#line 93 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
case 48:
//#line 96 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":bucle");}
break;
//#line 606 "Parser.java"
//########## END OF USER-SUPPLIED ACTIONS ##########
    }//switch
    //#### Now let's reduce... ####
    if (yydebug) debug("reduce");
    state_drop(yym);             //we just reduced yylen states
    yystate = state_peek(0);     //get new state
    val_drop(yym);               //corresponding value drop
    yym = yylhs[yyn];            //select next TERMINAL(on lhs)
    if (yystate == 0 && yym == 0)//done? 'rest' state and at first TERMINAL
      {
      if (yydebug) debug("After reduction, shifting from state 0 to state "+YYFINAL+"");
      yystate = YYFINAL;         //explicitly say we're done
      state_push(YYFINAL);       //and save it
      val_push(yyval);           //also save the semantic value of parsing
      if (yychar < 0)            //we want another character?
        {
        yychar = yylex();        //get next character
        if (yychar<0) yychar=0;  //clean, if necessary
        if (yydebug)
          yylexdebug(yystate,yychar);
        }
      if (yychar == 0)          //Good exit (if lex returns 0 ;-)
         break;                 //quit the loop--all DONE
      }//if yystate
    else                        //else not done yet
      {                         //get next state and push, for next yydefred[]
      yyn = yygindex[yym];      //find out where to go
      if ((yyn != 0) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn]; //get new state
      else
        yystate = yydgoto[yym]; //else go to new defred
      if (yydebug) debug("after reduction, shifting from state "+state_peek(0)+" to state "+yystate+"");
      state_push(yystate);     //going again, so push state & val...
      val_push(yyval);         //for next action
      }
    }//main loop
  return 0;//yyaccept!!
}
//## end of method parse() ######################################



//## run() --- for Thread #######################################
/**
 * A default run method, used for operating this parser
 * object in the background.  It is intended for extending Thread
 * or implementing Runnable.  Turn off with -Jnorun .
 */
public void run()
{
  yyparse();
}
//## end of method run() ########################################



//## Constructors ###############################################
/**
 * Default constructor.  Turn off with -Jnoconstruct .

 */
public Parser()
{
  //nothing to do
}


/**
 * Create a parser, setting the debug to true or false.
 * @param debugMe true for debugging, false for no debug.
 */
public Parser(boolean debugMe)
{
  yydebug=debugMe;
}
//###############################################################



}
//################### END OF CLASS ##############################
