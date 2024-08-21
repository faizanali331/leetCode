import java.util.Stack;

class ValicParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ca = s.toCharArray();
        for(char c: ca){

            if(c=='('||c=='{'||c=='[')
                stk.push(c);
            else if(stk.isEmpty()) return false;
            else{
                if(c==')'){
                    if(stk.peek()=='(')
                        stk.pop();
                    else return false;
                }else if(c=='}'){
                    if(stk.peek()=='{')
                        stk.pop();
                    else return false;
                }else{
                    if(stk.peek()=='[')
                        stk.pop();
                    else return false;
                }
            }
        }
        if(!stk.isEmpty()) return false;
        return true;
    }
}