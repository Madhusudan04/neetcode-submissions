class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> s = new Stack<>();
        int[] res = new int[n];
        s.push(n-1);
        for(int i = n-2; i>=0; i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            res[i] = s.isEmpty() ? 0 : s.peek() - i;
            s.push(i);
        }
        return res;
    }
}
