import java.util.Stack;

class ReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")){
                int A = stk.pop();
                int B = stk.pop();
                int c = 0;
                if(s.equals("+")) c = B+A;
                else if(s.equals("-")) c = B-A;
                else if(s.equals("*")) c = B*A;
                else c = B/A;
                stk.push(c);
            }
            else{

                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}