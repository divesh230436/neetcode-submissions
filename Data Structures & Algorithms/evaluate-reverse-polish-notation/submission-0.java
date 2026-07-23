class Solution {
    public int  evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            int a=0; int b=0;int r=0;

            switch (c){
                case "+":
                     b=st.pop();
                     a=st.pop();
                     r=a+b;
                    st.push(r);
                    break;
                case "-":
                     b=st.pop();
                     a=st.pop();
                     r=a-b;
                    st.push(r);
                    break;
                case "*":
                     b=st.pop();
                     a=st.pop();
                     r=a*b;
                    st.push(r);
                    break;
                case "/":
                     b=st.pop();
                     a=st.pop();
                     r=a/b;
                    st.push(r);
                    break;
                default:
                 int n=Integer.parseInt(tokens[i]);
                 st.push(n);
                 break;
            }
                
        }
        return (st.peek());               
    }
}
