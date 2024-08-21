import java.util.Stack;

class ReverseWordsOfString{
    public String reverseWords(String s) {
        Stack<StringBuilder> stk = new Stack<>();
        StringBuilder s2 = new StringBuilder();

        char[] ca = s.toCharArray();
        for(int i=0; i<ca.length; i++){
            if(ca[i]==' '&&s2.length()==0){

            }
            else if(ca[i]==' '){
                stk.push(s2);
                s2=new StringBuilder();
            }else
                s2.append(ca[i]);
        }
        if(s2.length()>0)
            stk.push(s2);
        s2=new StringBuilder();

        while(!stk.isEmpty()){

            s2.append(stk.pop());
            if(!stk.isEmpty())
                s2.append(" ");
        }

        return s2.toString();
    }
}