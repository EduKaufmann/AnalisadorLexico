import java.util.*;
%%
%class telefone
%standalone
%line
%column
Telefones = \+[0-9]{2}[\ ][0-9]{2}[\ ][9][0-9]{9}

%{
 List<String> telefones = new ArrayList();
%}

%eof{
  System.out.println("Telefones: ");
  for(int i=0;i<telefones.size();i++){
    if(i==telefones.size()-1)
     System.out.println(telefones.get(i));
    else
     System.out.println(telefones.get(i)+", ");
  }
%eof}

%%
{Telefones} {telefones.add(yytext());}
\n {}
. {}
