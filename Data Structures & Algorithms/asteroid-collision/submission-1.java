class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int j = -1;
        for(int i=0; i<n; i++){
            int num = asteroids[i];
            if(num > 0){
                asteroids[++j] = num;
            }else{
                while(j != -1 && asteroids[j] > 0 && asteroids[j] < Math.abs(num)){
                    j--;
                }
                if(j == -1 || asteroids[j] < 0){
                    asteroids[++j] = num;
                }else if(asteroids[j] == Math.abs(num)){
                    j--;
                }
            }
        }
        return Arrays.copyOfRange(asteroids,0,j+1);
    }
}