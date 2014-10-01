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
public final static short IF=257;
public final static short THEN=258;
public final static short ELSE=259;
public final static short PRINT=260;
public final static short IDENTIFICADOR=261;
public final static short VECTOR=262;
public final static short CADENA=263;
public final static short INT=264;
public final static short FLOAT=265;
public final static short FOR=266;
public final static short ASIG=267;
public final static short YYERRCODE=256;
final static short yylhs[] = {                           -1,
    0,    1,    1,    2,    2,    6,    2,    2,    2,    2,
    3,    3,    3,    3,    3,   10,   10,    9,    9,    9,
    4,    4,   11,   11,   11,   12,   12,   13,   13,   13,
   13,   14,   14,   15,   15,   15,   15,   16,   16,   16,
   16,   16,   16,   16,    5,    5,    5,    5,    5,    5,
   17,   17,    8,    8,    8,    8,    7,
};
final static short yylen[] = {                            2,
    1,    1,    2,    1,    2,    0,    2,    1,    1,    2,
    3,    3,    3,    3,    3,    4,    1,    1,    3,    1,
    3,    6,    1,    1,    1,    1,    1,    3,    3,    3,
    3,    1,    4,    1,    1,    1,    1,    1,    1,    1,
    1,    1,    1,    1,    8,   12,    9,    8,    5,    1,
    3,    1,    5,    5,    4,    3,   16,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,
    4,    0,    0,    8,    9,    0,    0,    0,    0,   17,
    0,    0,   20,   18,    0,    0,    0,    0,   10,    3,
    5,   50,    0,    7,   56,    0,    0,    0,   27,   26,
   21,    0,   24,    0,    0,    0,   15,   14,   13,    0,
   12,   11,    0,    0,    0,   55,    0,   34,   35,   36,
   37,    0,    0,    0,    0,   19,    0,   52,    0,    0,
   54,   53,    0,   31,   30,   29,   28,    0,   16,    0,
   44,   38,   39,   40,   41,   42,   43,    0,    0,   33,
   22,    0,   51,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   48,    0,    0,    0,    0,    0,    0,
    0,   46,    0,    0,   57,
};
final static short yydgoto[] = {                          8,
    9,   10,   11,   12,   34,   13,   14,   15,   25,   22,
   41,   42,   43,   44,   62,   88,   70,
};
final static short yysindex[] = {                       -57,
   -9,  -81, -217, -213,  -37,    9, -200,    0,    0,  -57,
    0,   -1, -216,    0,    0, -193,  -45, -210, -210,    0,
  -17,  -35,    0,    0,  -12, -179,   -6, -186,    0,    0,
    0,    0,   39,    0,    0,   40, -176,   -8,    0,    0,
    0,   19,    0,   19,   -7, -210,    0,    0,    0, -177,
    0,    0, -174, -219,  -30,    0, -210,    0,    0,    0,
    0, -210, -210, -182,   -5,    0,   29,    0,  -56,   50,
    0,    0,    2,    0,    0,    0,    0, -210,    0, -172,
    0,    0,    0,    0,    0,    0,    0, -210, -107,    0,
    0,   34,    0,  -29,  -57, -165,  -57,  -28,  -56,  -27,
 -159, -210, -158,    0,   44,  -18, -155,  -57,   66,  -16,
  -15,    0,  -57,  -14,    0,
};
final static short yyrindex[] = {                      -187,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    3,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,  -34,    0,    0,
    0,  -41,    0,  -26,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    1, -187,    0, -187,    0,    0,    0,
    0,    0,   12,    0,    0,   23,    0, -187,    0,    0,
    0,    0, -187,    0,    0,
};
final static short yygindex[] = {                         0,
    7,    0,    0,    0,    0,    0,    0,    0,  105,    0,
   11,   10,    0,   13,   68,   15,    0,
};
final static int YYTABLESIZE=289;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         23,
   49,    7,    2,   82,   86,   84,   32,   32,   32,   19,
   32,   45,   32,   37,   25,   95,   30,   23,   23,   23,
   23,   26,   47,   48,   32,   32,   32,   32,   72,   45,
   17,   50,   25,   25,   25,   25,   68,   50,   20,   32,
   33,   38,   23,   21,   39,   40,   49,   24,   28,   16,
   38,   23,   52,   39,   40,   29,   65,   31,   32,   49,
   60,   58,   35,   59,   69,   61,   25,   73,    6,    6,
   45,   74,   76,   46,   75,   77,   51,   53,   54,   56,
   55,   47,   57,   66,   78,   64,   67,   79,   91,   80,
   89,   92,   96,   97,   90,   99,  101,  103,   93,  104,
  106,   98,  107,  100,  108,  109,  111,  113,  112,   27,
  115,   63,  105,  102,  110,    0,    0,    0,    0,  114,
    0,    0,    0,    0,    0,   49,    0,    2,    0,    0,
    0,    0,    0,    0,    0,    0,   45,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   47,    0,    0,
   94,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,   18,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,   81,
    0,    0,    1,    2,    3,    0,    4,    5,    6,    0,
    0,   83,   85,   87,   23,    0,    0,   36,   23,    0,
   47,   32,    0,   24,    0,   71,   23,   23,   23,   25,
    0,    0,    0,   32,   32,   32,    0,    0,    0,    0,
    0,   25,   25,   25,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   49,   49,    6,    6,
   49,   49,   49,    0,   49,   49,   49,   45,   45,    0,
    0,   45,   45,   45,    0,   45,   45,   45,   47,   47,
    0,    0,   47,   47,   47,    0,   47,   47,   47,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
    0,   59,    0,   60,   61,   62,   41,   42,   43,   91,
   45,    0,   47,   59,   41,  123,   10,   59,   60,   61,
   62,   59,    0,   59,   59,   60,   61,   62,   59,   19,
   40,   44,   59,   60,   61,   62,  256,   44,  256,  256,
  257,  261,  256,  261,  264,  265,   59,  261,   40,   59,
  261,   93,   59,  264,  265,  256,   46,   59,   93,   59,
   42,   43,  256,   45,   54,   47,   93,   57,  256,  257,
   59,   62,   63,   91,   62,   63,  256,  264,   40,  256,
   41,   59,   91,  261,  267,   93,  261,   93,   78,   61,
   41,  264,   59,  123,   93,  261,  125,  125,   88,  259,
  259,   95,   59,   97,  123,  261,   41,  123,  125,    5,
  125,   44,  102,   99,  108,   -1,   -1,   -1,   -1,  113,
   -1,   -1,   -1,   -1,   -1,  125,   -1,  125,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  125,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  125,   -1,   -1,
  258,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,  267,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  256,
   -1,   -1,  260,  261,  262,   -1,  264,  265,  266,   -1,
   -1,  268,  269,  270,  256,   -1,   -1,  263,  256,   -1,
  256,  256,   -1,  261,   -1,  256,  268,  269,  270,  256,
   -1,   -1,   -1,  268,  269,  270,   -1,   -1,   -1,   -1,
   -1,  268,  269,  270,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,  256,  257,  256,  257,
  260,  261,  262,   -1,  264,  265,  266,  256,  257,   -1,
   -1,  260,  261,  262,   -1,  264,  265,  266,  256,  257,
   -1,   -1,  260,  261,  262,   -1,  264,  265,  266,
};
}
final static short YYFINAL=8;
final static short YYMAXTOKEN=270;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"'('","')'","'*'","'+'","','",
"'-'",null,"'/'",null,null,null,null,null,null,null,null,null,null,null,"';'",
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
null,null,null,null,null,null,null,null,"IF","THEN","ELSE","PRINT",
"IDENTIFICADOR","VECTOR","CADENA","INT","FLOAT","FOR","ASIG","\"<=\"","\">=\"",
"\"^=\"",
};
final static String yyrule[] = {
"$accept : programa",
"programa : sentencias",
"sentencias : sentencia",
"sentencias : sentencia sentencias",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"$$1 :",
"sentencia : $$1 seleccion",
"sentencia : bucle",
"sentencia : impresion",
"sentencia : ';' error",
"declaracion : FLOAT variables ';'",
"declaracion : FLOAT ';' error",
"declaracion : INT variables ';'",
"declaracion : VECTOR vector ';'",
"declaracion : VECTOR vector error",
"vector : IDENTIFICADOR '[' expresion ']'",
"vector : error",
"variables : IDENTIFICADOR",
"variables : variables ',' IDENTIFICADOR",
"variables : error",
"asignacion : IDENTIFICADOR ASIG expresion",
"asignacion : IDENTIFICADOR '[' expresion ']' ASIG expresion",
"expresion : numero",
"expresion : operacionAritmetica",
"expresion : variable",
"numero : FLOAT",
"numero : INT",
"operacionAritmetica : variable operador variable",
"operacionAritmetica : variable operador numero",
"operacionAritmetica : numero operador variable",
"operacionAritmetica : numero operador numero",
"variable : IDENTIFICADOR",
"variable : IDENTIFICADOR '[' expresion ']'",
"operador : '+'",
"operador : '-'",
"operador : '*'",
"operador : '/'",
"comparador : '<'",
"comparador : \"<=\"",
"comparador : '>'",
"comparador : \">=\"",
"comparador : '='",
"comparador : \"^=\"",
"comparador : error",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' THEN",
"seleccion : error",
"condicion : expresion comparador expresion",
"condicion : error",
"impresion : PRINT '(' CADENA ')' ';'",
"impresion : PRINT '(' CADENA ')' error",
"impresion : PRINT '(' ';' error",
"impresion : PRINT ';' error",
"bucle : FOR '(' INT IDENTIFICADOR '=' INT ';' IDENTIFICADOR comparador expresion ';' IDENTIFICADOR ')' '{' sentencias '}'",
};

//#line 108 "gramatica.y"
  private Log logSintactico = new Log("sintactico.log");
  private AnalizadorLexico lexico;

  public Parser(AnalizadorLexico l) {
         lexico = l;

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
//#line 366 "Parser.java"
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
case 6:
//#line 26 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": Seleccion");}
break;
case 10:
//#line 29 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");}
break;
case 11:
//#line 32 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
break;
case 12:
//#line 33 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 14:
//#line 35 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 15:
//#line 36 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 17:
//#line 40 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");}
break;
case 20:
//#line 45 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");}
break;
case 21:
//#line 48 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 22:
//#line 49 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 23:
//#line 52 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 24:
//#line 53 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 25:
//#line 54 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 44:
//#line 83 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
break;
case 46:
//#line 88 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion ifelse");}
break;
case 47:
//#line 89 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 48:
//#line 90 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
break;
case 49:
//#line 91 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 50:
//#line 92 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");}
break;
case 52:
//#line 96 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");}
break;
case 53:
//#line 99 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 54:
//#line 100 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 55:
//#line 101 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 56:
//#line 102 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
//#line 615 "Parser.java"
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
