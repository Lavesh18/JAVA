package leetcode.string;

import java.util.Stack;

public class evalueReversePolishNotation_150 {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};

        Stack<Integer> st= new Stack<>();

        String op = "+-*/";
        for(String token:tokens)
        {
            int res = 0;
            if(op.indexOf(token)!=-1)
            {
                int d2 = st.pop();
                int d1 = st.pop();

                if(token.equals("+"))
                {
                    res = d1+d2;
                }
                else if(token.equals("-"))
                {
                    res = d1-d2;
                }
                else if(token.equals("*"))
                {
                    res = d1*d2;
                }
                else if(token.equals("/"))
                {
                    res = d1/d2;
                }

                st.push(res);
            }
            else
            st.push(Integer.parseInt(token));
        }

        System.out.println(st.peek());
    }
}
