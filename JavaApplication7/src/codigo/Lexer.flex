package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r, "EOF", "EOLN", ., \n]+
%{
    public static final int PROGRAMA = -1;
    public static final int INICIO = -2;
    public static final int FIN = -3;
    public static final int LEER = -4;
    public static final int ESCRIBIR = -5;
    public static final int SI = -6;
    public static final int SINO = -7;
    public static final int MIENTRAS = -8;
    public static final int REPETIR = -9;
    public static final int HASTA = -10;
    public static final int ENTERO = -11;
    public static final int REAL = -12;
    public static final int CADENA = -13;
    public static final int LOGICO = -14;
    public static final int VARIABLES = -15;
    public static final int ENTONCES= -16;
    public static final int HACER= -17;
    public static final int MULTIPLICACION = -21;
    public static final int DIVISION = -22;
    public static final int SUMA = -24;
    public static final int RESTA = -25;
    public static final int IGUAL = -26;
    public static final int MENOR = -31;
    public static final int MENOR_IGUAL = -32;
    public static final int MAYOR = -33;
    public static final int MAYOR_IGUAL = -34;
    public static final int IGUAL_IGUAL = -35;
    public static final int DIFERENTE = -36;
    public static final int AND = -41;
    public static final int OR = -42;
    public static final int NOT = -43;
    public static final int ID_ENTERO = -51;
    public static final int ID_REALES = -52;
    public static final int ID_STRING = -53;
    public static final int ID_LOGICO = -54;
    public static final int ID_PROGRAMA = -55;
    public static final int NUMERO = -61;
    public static final int NUM_REAL = -62;
    public static final int STRING = -63;
    public static final int VERDADERO = -64;
    public static final int FALSO = -65;
    public static final int PARENTESIS_ABRE = -73;
    public static final int PARENTESIS_CIERRA = -74;
    public static final int PUNTO_COMA = -75;
    public static final int COMA = -76;
    public static final int DOS_PUNTOS = -77;
    public static final int ERROR = -150;

    public String lexeme;
%}



%%
"programa" {return PROGRAMA;}
"inicio" {return INICIO;}
"fin" {return FIN;}
"leer" {return LEER;}
"escribir" {return ESCRIBIR;}
"si" {return SI;}
"sino" {return SINO;}
"mientras" {return MIENTRAS;}
"repetir" {return REPETIR;}
"hasta" {return HASTA;}
"entero" {return ENTERO;}
"real" {return REAL;}
"cadena" {return CADENA;}
"logico" {return LOGICO;}
"variables" {return VARIABLES;}
"entonces" {return ENTONCES;}
"hacer" {return HACER;} 
"verdadero" {return VERDADERO;} 
"falso" {return FALSO;} 
")" {return PARENTESIS_ABRE;} 
"(" {return PARENTESIS_CIERRA;} 
":" {return DOS_PUNTOS;} 
"," {return COMA;} 
";" {return PUNTO_COMA;} 
"==" {return IGUAL_IGUAL;} 
"!=" {return DIFERENTE;} 
">=" {return MAYOR_IGUAL;} 
"<=" {return MENOR_IGUAL;} 
">" {return MAYOR;}
"<" {return MENOR;}
"&" {return AND;}
"|" {return OR;}
"!" {return NOT;}
"=" {return IGUAL;}
"+" {return SUMA;}
"-" {return RESTA;}
"*" {return MULTIPLICACION;}
"/" {return DIVISION;}
{espacio} {/*Ignore*/}
"//"[a-zA-Z0-9]+"//" {/*Ignore*/}
{L}({L}|{D}|"_")*"$" {lexeme=yytext(); return ID_STRING;}
{L}({L}|{D}|"_")*"%" {lexeme=yytext(); return ID_REALES;}
{L}({L}|{D}|"_")*"&" {lexeme=yytext(); return ID_ENTERO;}
{L}({L}|{D}|"_")*"@" {lexeme=yytext(); return ID_LOGICO;}
{L}({L}|{D}|"_")*"?" {lexeme=yytext(); return ID_PROGRAMA;}
\"(\\.|[^\"])*\" {lexeme=yytext(); return STRING;}
{D}+ {lexeme=yytext(); return NUMERO;}
("-"{D}+"."{D}+)|{D}+"."{D}+ {lexeme=yytext(); return NUM_REAL;}
[^a-zA-Z0-9\\s] {return ERROR;}
[L]+ {return ERROR;}