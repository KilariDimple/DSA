class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(String x:tokens){
            switch(x){
                case "+":
                    int a=st.pop();
                    int b=st.pop();
                    st.push(a+b);
                    break;
                case "-":
                    b=st.pop();
                    a=st.pop();
                    st.push(a-b);
                    break;
                case "*":
                    b=st.pop();
                    a=st.pop();
                    st.push(a*b);
                    break;
                case "/":
                    b=st.pop();
                    a=st.pop();
                    st.push(a/b);
                    break;
                default:
                    st.push(Integer.parseInt(x));
            }

        }
        return st.pop();

    }
}