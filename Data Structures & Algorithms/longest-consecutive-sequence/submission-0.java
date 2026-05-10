class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int maxSeq = 0;

        for(int num : nums){
            set.add(num);
        } 

        for(int num : nums){
            if(!set.contains(num - 1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                maxSeq = Math.max(maxSeq,length);
            }
        }
        return maxSeq;
    }
}
