import java.util.*;
%%
%class matricula
%standalone
%line
%column
Numero = [0-9]{1}[\ ][0-9]{9}[\-][0-9]{1}

%{
 List<String> numero = new ArrayList();
%}

%eof{
  System.out.print("Matriculas: ");
  for(int i=0;i<numero.size();i++){
    if(i==numero.size()-1)
     System.out.println(numero.get(i));
    else
     System.out.print(numero.get(i)+", ");
  }
%eof}

%%
{Numero} {numero.add(yytext());}
\n {}
. {}
