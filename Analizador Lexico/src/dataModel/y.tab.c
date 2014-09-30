#ifndef lint
static char yysccsid[] = "@(#)yaccpar	1.8 (Berkeley) 01/20/90";
#endif
#define YYBYACC 1
#line 2 "gramatica.y"

package dataModel;
import java.io.IOException;
import java.util.Vector;
import java.util.Stack;

#line 13 "y.tab.c"
#define IF 257
#define THEN 258
#define ELSE 259
#define PRINT 260
#define IDENTIFICADOR 261
#define VECTOR 262
#define CADENA 263
#define INT 264
#define FLOAT 265
#define FOR 266
#define ASIG 267
#define YYERRCODE 256
short yylhs[] = {                                        -1,
    0,    1,    1,    2,    2,    6,    2,    2,    2,    2,
    3,    3,    3,    3,   10,   10,    9,    9,    9,    4,
    4,   11,   11,   11,   12,   12,   13,   13,   13,   13,
   14,   14,   15,   15,   15,   15,   15,   15,   15,    5,
    5,    5,    5,    5,    5,   16,   16,    8,    8,    8,
    8,    7,
};
short yylen[] = {                                         2,
    1,    1,    2,    1,    2,    0,    2,    1,    1,    2,
    3,    3,    3,    3,    4,    1,    1,    3,    1,    3,
    6,    1,    1,    1,    1,    1,    3,    3,    3,    3,
    1,    4,    1,    1,    1,    1,    1,    1,    1,    8,
   12,    9,    8,    5,    1,    3,    1,    5,    5,    4,
    3,   14,
};
short yydefred[] = {                                      0,
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
short yydgoto[] = {                                       7,
    8,    9,   10,   11,   32,   12,   13,   14,   25,   21,
   39,   40,   41,   42,   62,   70,
};
short yysindex[] = {                                     22,
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
short yyrindex[] = {                                   -207,
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
short yygindex[] = {                                      0,
  -60,   17,    0,    0,    0,    0,    0,    0,    0,    0,
   19,   -4,    0,   -1,  -25,    0,
};
#define YYTABLESIZE 288
short yytable[] = {                                      31,
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
short yycheck[] = {                                      41,
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
#define YYFINAL 7
#ifndef YYDEBUG
#define YYDEBUG 0
#endif
#define YYMAXTOKEN 270
#if YYDEBUG
char *yyname[] = {
"end-of-file",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,"'('","')'",0,0,"','",0,0,0,0,0,0,0,0,0,0,0,0,0,0,"';'","'<'","'='",
"'>'",0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'['",0,"']'",0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,"'{'",0,"'}'",0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
0,0,0,0,0,"IF","THEN","ELSE","PRINT","IDENTIFICADOR","VECTOR","CADENA","INT",
"FLOAT","FOR","ASIG","\"<=\"","\">=\"","\"^=\"",
};
char *yyrule[] = {
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
#endif
#ifndef YYSTYPE
typedef int YYSTYPE;
#endif
#define yyclearin (yychar=(-1))
#define yyerrok (yyerrflag=0)
#ifdef YYSTACKSIZE
#ifndef YYMAXDEPTH
#define YYMAXDEPTH YYSTACKSIZE
#endif
#else
#ifdef YYMAXDEPTH
#define YYSTACKSIZE YYMAXDEPTH
#else
#define YYSTACKSIZE 500
#define YYMAXDEPTH 500
#endif
#endif
int yydebug;
int yynerrs;
int yyerrflag;
int yychar;
short *yyssp;
YYSTYPE *yyvsp;
YYSTYPE yyval;
YYSTYPE yylval;
short yyss[YYSTACKSIZE];
YYSTYPE yyvs[YYSTACKSIZE];
#define yystacksize YYSTACKSIZE
#line 100 "gramatica.y"
  private Logger logSintactico = new Logger("sintactico.log");
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
        lexico.getTabla().addSimbolo(s);
        
        Simbolo raya = new Simbolo(new StringBuffer("-"),"-");
        lexico.getTabla().eliminarSimbolo(raya);
        
        Simbolo elival = new Simbolo(new StringBuffer(valor),"NUMERO");
        lexico.getTabla().eliminarSimbolo(elival);
}
public void imprimirSintactico(){
    logSintactico.imprimir();
}
#line 293 "y.tab.c"
#define YYABORT goto yyabort
#define YYACCEPT goto yyaccept
#define YYERROR goto yyerrlab
int
yyparse()
{
    register int yym, yyn, yystate;
#if YYDEBUG
    register char *yys;
    extern char *getenv();

    if (yys = getenv("YYDEBUG"))
    {
        yyn = *yys;
        if (yyn >= '0' && yyn <= '9')
            yydebug = yyn - '0';
    }
#endif

    yynerrs = 0;
    yyerrflag = 0;
    yychar = (-1);

    yyssp = yyss;
    yyvsp = yyvs;
    *yyssp = yystate = 0;

yyloop:
    if (yyn = yydefred[yystate]) goto yyreduce;
    if (yychar < 0)
    {
        if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, reading %d (%s)\n", yystate,
                    yychar, yys);
        }
#endif
    }
    if ((yyn = yysindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: state %d, shifting to state %d (%s)\n",
                    yystate, yytable[yyn],yyrule[yyn]);
#endif
        if (yyssp >= yyss + yystacksize - 1)
        {
            goto yyoverflow;
        }
        *++yyssp = yystate = yytable[yyn];
        *++yyvsp = yylval;
        yychar = (-1);
        if (yyerrflag > 0)  --yyerrflag;
        goto yyloop;
    }
    if ((yyn = yyrindex[yystate]) && (yyn += yychar) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yychar)
    {
        yyn = yytable[yyn];
        goto yyreduce;
    }
    if (yyerrflag) goto yyinrecovery;
#ifdef lint
    goto yynewerror;
#endif
yynewerror:
    yyerror("syntax error");
#ifdef lint
    goto yyerrlab;
#endif
yyerrlab:
    ++yynerrs;
yyinrecovery:
    if (yyerrflag < 3)
    {
        yyerrflag = 3;
        for (;;)
        {
            if ((yyn = yysindex[*yyssp]) && (yyn += YYERRCODE) >= 0 &&
                    yyn <= YYTABLESIZE && yycheck[yyn] == YYERRCODE)
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: state %d, error recovery shifting\
 to state %d\n", *yyssp, yytable[yyn]);
#endif
                if (yyssp >= yyss + yystacksize - 1)
                {
                    goto yyoverflow;
                }
                *++yyssp = yystate = yytable[yyn];
                *++yyvsp = yylval;
                goto yyloop;
            }
            else
            {
#if YYDEBUG
                if (yydebug)
                    printf("yydebug: error recovery discarding state %d\n",
                            *yyssp);
#endif
                if (yyssp <= yyss) goto yyabort;
                --yyssp;
                --yyvsp;
            }
        }
    }
    else
    {
        if (yychar == 0) goto yyabort;
#if YYDEBUG
        if (yydebug)
        {
            yys = 0;
            if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
            if (!yys) yys = "illegal-symbol";
            printf("yydebug: state %d, error recovery discards token %d (%s)\n",
                    yystate, yychar, yys);
        }
#endif
        yychar = (-1);
        goto yyloop;
    }
yyreduce:
#if YYDEBUG
    if (yydebug)
        printf("yydebug: state %d, reducing by rule %d (%s)\n",
                yystate, yyn, yyrule[yyn]);
#endif
    yym = yylen[yyn];
    yyval = yyvsp[1-yym];
    switch (yyn)
    {
case 1:
#line 16 "gramatica.y"
{ logSintactico.addLogger("El programa finalizo correctamente"); }
break;
case 6:
#line 25 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": Seleccion");}
break;
case 10:
#line 28 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en linea "+lexico.getLineas()+": sentencia no permitida");}
break;
case 11:
#line 31 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": declaracion de un FLOAT");}
break;
case 12:
#line 32 "gramatica.y"
{logSintactico.addLogger("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 13:
#line 33 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": declaracion de un VECTOR");}
break;
case 14:
#line 34 "gramatica.y"
{logSintactico.addLogger("Error sintactico en la linea "+lexico.getLineas()+": declaracion de variables");}
break;
case 16:
#line 38 "gramatica.y"
{logSintactico.addLogger("ERROR sintactica en la linea "+lexico.getLineas()+": sintactico en el arreglo");}
break;
case 19:
#line 43 "gramatica.y"
{logSintactico.addLogger("ERROR sintactica en la linea"+lexico.getLineas()+": declaracion de variables");}
break;
case 20:
#line 46 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": asignacion");}
break;
case 21:
#line 47 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": asignacion");}
break;
case 22:
#line 50 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 23:
#line 51 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 24:
#line 52 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": se encontro una expresion");}
break;
case 39:
#line 75 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": no es posible resolver la comparacion");}
break;
case 41:
#line 80 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+": seleccion ifelse");}
break;
case 42:
#line 81 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 43:
#line 82 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion falta setencia THEN ");}
break;
case 44:
#line 83 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion faltan las LLAVES");}
break;
case 45:
#line 84 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": seleccion no valida");}
break;
case 47:
#line 88 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": condicion no valida");}
break;
case 48:
#line 91 "gramatica.y"
{logSintactico.addLogger("Linea "+lexico.getLineas()+":salida por pantalla");}
break;
case 49:
#line 92 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba un punto y coma");}
break;
case 50:
#line 93 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una cadena");}
break;
case 51:
#line 94 "gramatica.y"
{logSintactico.addLogger("ERROR sintactico en la linea "+lexico.getLineas()+": se esperaba una ('cadena')");}
break;
#line 533 "y.tab.c"
    }
    yyssp -= yym;
    yystate = *yyssp;
    yyvsp -= yym;
    yym = yylhs[yyn];
    if (yystate == 0 && yym == 0)
    {
#if YYDEBUG
        if (yydebug)
            printf("yydebug: after reduction, shifting from state 0 to\
 state %d\n", YYFINAL);
#endif
        yystate = YYFINAL;
        *++yyssp = YYFINAL;
        *++yyvsp = yyval;
        if (yychar < 0)
        {
            if ((yychar = yylex()) < 0) yychar = 0;
#if YYDEBUG
            if (yydebug)
            {
                yys = 0;
                if (yychar <= YYMAXTOKEN) yys = yyname[yychar];
                if (!yys) yys = "illegal-symbol";
                printf("yydebug: state %d, reading %d (%s)\n",
                        YYFINAL, yychar, yys);
            }
#endif
        }
        if (yychar == 0) goto yyaccept;
        goto yyloop;
    }
    if ((yyn = yygindex[yym]) && (yyn += yystate) >= 0 &&
            yyn <= YYTABLESIZE && yycheck[yyn] == yystate)
        yystate = yytable[yyn];
    else
        yystate = yydgoto[yym];
#if YYDEBUG
    if (yydebug)
        printf("yydebug: after reduction, shifting from state %d \
to state %d\n", *yyssp, yystate);
#endif
    if (yyssp >= yyss + yystacksize - 1)
    {
        goto yyoverflow;
    }
    *++yyssp = yystate;
    *++yyvsp = yyval;
    goto yyloop;
yyoverflow:
    yyerror("yacc stack overflow");
yyabort:
    return (1);
yyaccept:
    return (0);
}
