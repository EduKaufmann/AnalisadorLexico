import java.util.*;
%%
%class cpf
%standalone
%line
%column
CPF = [0-9]{3,3}[\.][0-9]{3}[\.][0-9]{3}[\.][0-9]{2,2}

%{
 List<String> cpf = new ArrayList();
%}

%eof{
  System.out.println("CPF: ");
  for(int i=0;i<cpf.size();i++){
    if(i==cpf.size()-1)
     System.out.println(cpf.get(i));
    else
     System.out.println(cpf.get(i)+", ");
  }
%eof}

%%
{CPF} {cpf.add(yytext());}
\n {}
. {}
