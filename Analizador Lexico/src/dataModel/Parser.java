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
    3,    3,    3,    3,   10,   10,    9,    9,    9,    4,
    4,   11,   11,   11,   12,   12,   13,   13,   13,   13,
   14,   14,   15,   15,   15,   15,   15,   15,   15,    5,
    5,    5,    5,    5,    5,   16,   16,    8,    8,    8,
    8,    7,
};
final static short yylen[] = {                            2,
    1,    1,    2,    1,    2,    0,    2,    1,    1,    2,
    3,    3,    3,    3,    4,    1,    1,    3,    1,    3,
    6,    1,    1,    1,    1,    1,    3,    3,    3,    3,
    1,    4,    1,    1,    1,    1,    1,    1,    1,    8,
   12,    9,    8,    5,    1,    3,    1,    5,    5,    4,
    3,   14,
};
final static short yydefred[] = {                         0,
    0,    0,    0,    0,    0,    0,    0,    0,    2,    4,
    0,    0,    8,    9,    0,    0,    0,    0,   16,    0,
    0,   19,   17,    0,    0,    0,   10,    3,    5,   45,
    0,    7,   51,    0,    0,    0,   26,   25,   20,    0,
   23,    0,    0,    0,   14,   13,   12,   11,    0,    0,
    0,    0,   50,    0,   39,   33,   34,   35,   36,   37,
   38,    0,    0,    0,    0,   18,    0,   47,    0,    0,
   49,   48,    0,   30,   29,   28,   27,    0,   15,    0,
    0,    0,   32,   21,    0,   46,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,   43,    0,    0,    0,
    0,    0,    0,    0,   41,   52,
};
final static short yydgoto[] = {                          7,
    8,    9,   10,   11,   32,   12,   13,   14,   25,   21,
   39,   40,   41,   42,   62,   70,
};
final static short yysindex[] = {                        22,
  -14,  -79, -229,  -45,   -7, -218,    0,   22,    0,    0,
  -19, -209,    0,    0, -203,  -57, -230, -230,    0,  -26,
  -52,    0,    0, -190,  -20, -196,    0,    0,    0,    0,
   29,    0,    0,   30, -181,  -15,    0,    0,    0,  -51,
    0,  -51,  -13, -230,    0,    0,    0,    0, -184, -183,
 -210,  -46,    0, -230,    0,    0,    0,    0,    0,    0,
    0, -230, -230, -188,  -11,    0,   23,    0,  -51,   42,
    0,    0,   -8,    0,    0,    0,    0, -230,    0, -178,
 -230, -107,    0,    0, -174,    0,  -35,   22,  -51,   22,
  -53, -230,  -30, -170, -171, -168,    0,   51,  -29,  -27,
   22,   22,  -23,  -16,    0,    0,
};
final static short yyrindex[] = {                      -207,
    0,    0,    0,    0,    0,    0,    0,    3,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,  -41,    0,    0,    0,  -37,
    0,  -36,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    1, -207,    0, -207,
 -207,    0, -207,    0,    0,    8,    0,    0,   15,    0,
 -207, -207, -207, -207,    0,    0,
};
final static short yygindex[] = {                         0,
  -60,   17,    0,    0,    0,    0,    0,    0,    0,    0,
   19,   -4,    0,   -1,  -25,    0,
};
final static int YYTABLESIZE=288;
static short yytable[];
static { yytable();}
static void yytable(){
yytable = new short[]{                         31,
   44,   35,    1,   22,   24,    6,   46,   40,   56,   60,
   58,   18,   72,   24,   42,   88,   63,   31,   31,   31,
   31,   22,   24,   49,   28,   16,   19,   91,    6,   93,
   36,   20,   26,   37,   38,    6,   43,   27,   48,   29,
  103,  104,    6,   81,   15,   68,   30,   31,    6,    6,
   36,   31,   33,   37,   38,   22,   24,   74,   76,   44,
   75,   77,   65,   92,   44,   47,   40,   50,   51,   69,
   52,   94,   73,   42,   53,   54,   66,   67,   78,   64,
    6,   79,   82,   80,   83,   85,   89,   90,   97,   98,
   99,  100,    0,  101,   96,  102,   84,    0,    0,   86,
    0,  105,    0,    0,    0,    0,    0,   28,  106,   28,
   95,    0,    0,    0,    0,    0,    0,    0,    0,   28,
   28,    0,    0,    0,    0,   44,    0,    0,    0,    0,
    0,    0,   40,    0,    0,    0,    0,    0,    0,   42,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
   87,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,    0,    0,    0,    0,   17,    0,    0,
    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
    0,    0,    0,   45,   55,   34,    1,    2,    3,   71,
   22,    4,    5,    0,   31,   23,   57,   59,   61,   31,
    0,    0,    0,   22,   24,    0,   31,   31,   31,    1,
    2,    3,    0,    0,    4,    5,    1,    2,    3,    0,
    0,    4,    5,    1,    2,    3,    0,    0,    4,    5,
    0,    0,    0,    0,    0,    0,   44,   44,    6,    6,
   44,   44,   44,   40,   40,   44,   44,   40,   40,   40,
   42,   42,   40,   40,   42,   42,   42,    0,    0,   42,
   42,    1,    2,    3,    0,    0,    4,    5,
};
}
static short yycheck[];
static { yycheck(); }
static void yycheck() {
yycheck = new short[] {                         41,
    0,   59,    0,   41,   41,   59,   59,    0,   60,   61,
   62,   91,   59,   59,    0,  123,   42,   59,   60,   61,
   62,   59,   59,   44,    8,   40,  256,   88,   59,   90,
  261,  261,   40,  264,  265,   59,   18,  256,   59,   59,
  101,  102,   59,   69,   59,  256,  256,  257,  256,  257,
  261,   93,  256,  264,  265,   93,   93,   62,   63,   59,
   62,   63,   44,   89,   91,  256,   59,  264,   40,   51,
   41,  125,   54,   59,  256,   91,  261,  261,  267,   93,
   59,   93,   41,   61,   93,  264,  261,  123,  259,  261,
  259,   41,   -1,  123,  125,  123,   78,   -1,   -1,   81,
   -1,  125,   -1,   -1,   -1,   -1,   -1,   91,  125,   93,
   92,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,  103,
  104,   -1,   -1,   -1,   -1,  125,   -1,   -1,   -1,   -1,
   -1,   -1,  125,   -1,   -1,   -1,   -1,   -1,   -1,  125,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
  258,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,  267,   -1,   -1,
   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,   -1,
   -1,   -1,   -1,  256,  256,  263,  260,  261,  262,  256,
  256,  265,  266,   -1,  256,  261,  268,  269,  270,  261,
   -1,   -1,   -1,  261,  261,   -1,  268,  269,  270,  260,
  261,  262,   -1,   -1,  265,  266,  260,  261,  262,   -1,
   -1,  265,  266,  260,  261,  262,   -1,   -1,  265,  266,
   -1,   -1,   -1,   -1,   -1,   -1,  256,  257,  256,  257,
  260,  261,  262,  256,  257,  265,  266,  260,  261,  262,
  256,  257,  265,  266,  260,  261,  262,   -1,   -1,  265,
  266,  260,  261,  262,   -1,   -1,  265,  266,
};
}
final static short YYFINAL=7;
final static short YYMAXTOKEN=270;
final static String yyname[] = {
"end-of-file",null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,
null,null,null,null,null,null,null,null,null,null,"'('","')'",null,null,"','",
null,null,null,null,null,null,null,null,null,null,null,null,null,null,"';'",
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
"sentencias : sentencias sentencia",
"sentencia : declaracion",
"sentencia : asignacion ';'",
"$$1 :",
"sentencia : $$1 seleccion",
"sentencia : bucle",
"sentencia : impresion",
"sentencia : ';' error",
"declaracion : FLOAT variables ';'",
"declaracion : FLOAT ';' error",
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
"operador : '<'",
"operador : \"<=\"",
"operador : '>'",
"operador : \">=\"",
"operador : '='",
"operador : \"^=\"",
"operador : error",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE '{' sentencias '}'",
"seleccion : IF '(' condicion ')' THEN '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' '{' sentencias '}' ELSE",
"seleccion : IF '(' condicion ')' THEN",
"seleccion : error",
"condicion : expresion operador expresion",
"condicion : error",
"impresion : PRINT '(' CADENA ')' ';'",
"impresion : PRINT '(' CADENA ')' error",
"impresion : PRINT '(' ';' error",
"impresion : PRINT ';' error",
"bucle : FOR '(' INT IDENTIFICADOR '=' INT IDENTIFICADOR operador expresion IDENTIFICADOR ')' '{' sentencias '}'",
};

//#line 100 "gramatica.y"
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
         Simbolo s = new Simbolo(new StringBuffer("-"+valor),"NUMERO");
        lexico.getTablaSimbolos().addSimbolo(s);
        
        Simbolo raya = new Simbolo(new StringBuffer("-"),"-");
        lexico.getTablaSimbolos().eliminarSimbolo(raya);
        
        Simbolo elival = new Simbolo(new StringBuffer(valor),"NUMERO");
        lexico.getTablaSimbolos().eliminarSimbolo(elival);
}
public void imprimirSintactico(){
    logSintactico.imprimir();
}
//#line 358 "Parser.java"
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
//#line 16 "gramatica.y"
{ logSintactico.addLog("El programa finalizo correctamente"); }
break;
case 6:
//#line 25 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": Seleccion");}
break;
case 10:
//#line 28 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");}
break;
case 11:
//#line 31 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
break;
case 12:
//#line 32 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 13:
//#line 33 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 14:
//#line 34 "gramatica.y"
{logSintactico.addLog("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 16:
//#line 38 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");}
break;
case 19:
//#line 43 "gramatica.y"
{logSintactico.addLog("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");}
break;
case 20:
//#line 46 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 21:
//#line 47 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": asignacion");}
break;
case 22:
//#line 50 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 23:
//#line 51 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 24:
//#line 52 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 39:
//#line 75 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
break;
case 41:
//#line 80 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+": seleccion ifelse");}
break;
case 42:
//#line 81 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 43:
//#line 82 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
break;
case 44:
//#line 83 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 45:
//#line 84 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");}
break;
case 47:
//#line 88 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");}
break;
case 48:
//#line 91 "gramatica.y"
{logSintactico.addLog("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 49:
//#line 92 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 50:
//#line 93 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 51:
//#line 94 "gramatica.y"
{logSintactico.addLog("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
//#line 607 "Parser.java"
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

