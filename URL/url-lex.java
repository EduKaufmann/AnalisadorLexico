import java.util.*;
%%
%class url
%standalone
%line
%column
Code = "http"[s]?":/""/www."[a-z0-9]+".com"[.]?[a-z0-9]*

%{
 List<String> code = new ArrayList();
%}

%eof{
  System.out.print("URLs: ");
  for(int i=0;i<code.size();i++){
    if(i==code.size()-1)
     System.out.println(code.get(i));
    else
     System.out.print(code.get(i)+", ");
  }
%eof}

%%
{Code} {code.add(yytext());}
\n {}
. {}

