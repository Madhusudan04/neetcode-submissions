class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(String s : operations){
            if(!s.equals("+") && !s.equals("C") && !s.equals("D")){
                st.push(Integer.parseInt(s));
            }else if(s.equals("+")){
                int a = st.pop();
                int num = a + st.peek();
                st.push(a);
                st.push(num);
            }else if(s.equals("C")){
                st.pop();
            }else if(s.equals("D")){
                st.push(2*st.peek());
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}