import java.util.*;
%%
%class palavras
%standalone
%line
%column
Palavras = [A-ZÁÉÍÓÚ]?[a-zçáéíóúâêîôû]+

%{
 List<String> palavras = new ArrayList();
%}

%eof{
  System.out.print("Palavras: ");
  for(int i=0;i<palavras.size();i++){
    if(i==palavras.size()-1)
     System.out.println(palavras.get(i));
    else
     System.out.print(palavras.get(i)+", ");
  }
%eof}

%%
{Palavras} {palavras.add(yytext());}
\n {}
. {}

