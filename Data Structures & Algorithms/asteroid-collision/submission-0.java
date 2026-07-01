class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        for(int num : asteroids){
            if(num > 0){
                s.push(num);
            }else{
                while(!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(num)){
                    s.pop();
                }
                if(s.isEmpty() || s.peek() < 0){
                    s.push(num);
                }else if(!s.isEmpty() && s.peek() == Math.abs(num)){
                    s.pop();
                }
            }
        }
        int[] ans = new int[s.size()];
        int i = ans.length-1;
        while(!s.isEmpty()){
            ans[i--] = s.pop();
        }
        return ans;
    }
}