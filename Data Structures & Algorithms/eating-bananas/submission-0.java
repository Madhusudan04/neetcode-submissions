class Solution {
    public int minEatingSpeed(int[] piles, int hr) {
        int max = piles[0];
        for(int i = 1; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        int l = 1, h = max, ans = -1;
        while(l <= h){
            int mid = l + (h-l)/2;
            if(calculate(piles,mid,hr)){
                ans = mid;
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        } 
        return ans;
    }
    public boolean calculate(int[] nums, int mid, int h){
        int hr = 0;
        for(int i=0; i<nums.length; i++){
            hr += (nums[i] / mid);
            if(nums[i]% mid != 0){
                hr++;
            }
        }
        return hr <= h;
    }
}
