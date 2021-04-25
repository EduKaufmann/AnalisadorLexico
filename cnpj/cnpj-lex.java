import java.util.*;
%%
%class cnpj
%standalone
%line
%column
CNPJ = [0-9]{2}[\.][0-9]{3}[\.][0-9]{3}"/"[0-9]{4}[\-][0-9]{2}

%{
 List<String> cnpj = new ArrayList();
%}

%eof{
  System.out.println("CNPJ: ");
  for(int i=0;i<cnpj.size();i++){
    if(i==cnpj.size()-1)
     System.out.println(cnpj.get(i));
    else
     System.out.println(cnpj.get(i)+", ");
  }
%eof}

%%
{CNPJ} {cnpj.add(yytext());}
\n {}
. {}
