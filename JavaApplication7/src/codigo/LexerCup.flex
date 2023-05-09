package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r, "EOF", "EOLN", ., \n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn,value);
    }

    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

%%

"programa" {return new Symbol(sym.Programa, yychar, yyline, yytext());}
"inicio" {return new Symbol(sym.Inicio, yychar, yyline, yytext());}
"fin" {return new Symbol(sym.Fin, yychar, yyline, yytext());}
"leer" {return new Symbol(sym.Leer, yychar, yyline, yytext());}
"escribir" {return new Symbol(sym.Escribir, yychar, yyline, yytext());}
"si" {return new Symbol(sym.Si, yychar, yyline, yytext());}
"sino" {return new Symbol(sym.Sino, yychar, yyline, yytext());}
"mientras" {return new Symbol(sym.Mientras, yychar, yyline, yytext());}
"repetir" {return new Symbol(sym.Repetir, yychar, yyline, yytext());}
"hasta" {return new Symbol(sym.Hasta, yychar, yyline, yytext());}
"entero" {return new Symbol(sym.Entero, yychar, yyline, yytext());}
"real" {return new Symbol(sym.Real, yychar, yyline, yytext());}
"cadena" {return new Symbol(sym.Cadena, yychar, yyline, yytext());}
"logico" {return new Symbol(sym.Logico, yychar, yyline, yytext());}
"variables" {return new Symbol(sym.Variables, yychar, yyline, yytext());}
"entonces" {return new Symbol(sym.Entonces, yychar, yyline, yytext());}
"hacer" {return new Symbol(sym.Hacer, yychar, yyline, yytext());}
"verdadero" {return new Symbol(sym.Verdadero, yychar, yyline, yytext());} 
"falso" {return new Symbol(sym.Falso, yychar, yyline, yytext());} 
")" {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}
"(" {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());} 
":" {return new Symbol(sym.DosPuntos, yychar, yyline, yytext());} 
"," {return new Symbol(sym.Coma, yychar, yyline, yytext());} 
";" {return new Symbol(sym.PuntoComa, yychar, yyline, yytext());} 
"==" {return new Symbol(sym.IgualIgual, yychar, yyline, yytext());} 
"!=" {return new Symbol(sym.Diferente, yychar, yyline, yytext());} 
">=" {return new Symbol(sym.MayorIgual, yychar, yyline, yytext());} 
"<=" {return new Symbol(sym.MenorIgual, yychar, yyline, yytext());}
">" {return new Symbol(sym.Mayor, yychar, yyline, yytext());}
"<" {return new Symbol(sym.Menor, yychar, yyline, yytext());}
"&" {return new Symbol(sym.And, yychar, yyline, yytext());}
"|" {return new Symbol(sym.Or, yychar, yyline, yytext());}
"!" {return new Symbol(sym.Not, yychar, yyline, yytext());}
"=" {return new Symbol(sym.Igual, yychar, yyline, yytext());}
"+" {return new Symbol(sym.Suma, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Resta, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
{espacio} {/*Ignore*/}
"//"[a-zA-Z0-9]+"//" {/*Ignore*/}
{L}({L}|{D}|"_")*"$" {return new Symbol(sym.Id_String, yychar, yyline, yytext());}
{L}({L}|{D}|"_")*"%" {return new Symbol(sym.Id_Reales, yychar, yyline, yytext());}
{L}({L}|{D}|"_")*"&" {return new Symbol(sym.Id_Entero, yychar, yyline, yytext());}
{L}({L}|{D}|"_")*"@" {return new Symbol(sym.Id_Logico, yychar, yyline, yytext());}
{L}({L}|{D}|"_")*"?" {return new Symbol(sym.Id_Programa, yychar, yyline, yytext());}
\"(\\.|[^\"])*\" {return new Symbol(sym.String, yychar, yyline, yytext());}
{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}
("-"{D}+"."{D}+)|{D}+"."{D}+ {return new Symbol(sym.Num_Real, yychar, yyline, yytext());}
[L] {return new Symbol(sym.Error, yychar, yyline, yytext());}