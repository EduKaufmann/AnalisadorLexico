import java.util.*;
%%
%class placas
%standalone
%line
%column
Placas = [A-Z]{3}[\-][0-9]{4}

%{
 List<String> placas = new ArrayList();
%}

%eof{
  System.out.println("Placas: ");
  for(int i=0;i<placas.size();i++){
    if(i==placas.size()-1)
     System.out.println(placas.get(i));
    else
     System.out.println(placas.get(i)+", ");
  }
%eof}

%%
{Placas} {placas.add(yytext());}
\n {}
. {}
