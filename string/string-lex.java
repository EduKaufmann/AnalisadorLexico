import java.util.*;
%%
%class string
%standalone
%line
%column
St = 

%{
 List<String> st = new ArrayList();
%}

%eof{
  System.out.print("Strings: ");
  for(int i=0;i<st.size();i++){
    if(i==st.size()-1)
     System.out.println(st.get(i));
    else
     System.out.print(st.get(i)+", ");
  }
%eof}

%%
{St} {st.add(yytext());}
\n {}
. {}

