import java.util.*;
%%
%class html
%standalone
%line
%column
Code = <[a-zA-Z]+>(<"/"[a-zA-Z]+>)*

%{
 List<String> code = new ArrayList();
%}

%eof{
  System.out.print("Tags de HTML: ");
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

