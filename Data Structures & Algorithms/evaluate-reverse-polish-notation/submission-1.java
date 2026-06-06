class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            if("+".equals(tokens[i])){
                int a = s.pop();
                int b = s.pop();
                s.push(a + b);
            }else if("-".equals(tokens[i])){
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            }else if("*".equals(tokens[i])){
                int a = s.pop();
                int b = s.pop();
                s.push(a * b);
            }else if("/".equals(tokens[i])){
                int a = s.pop();
                int b = s.pop();
                s.push(b / a);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
