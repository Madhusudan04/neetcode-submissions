class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,result,new ArrayList<>());
        return result;
    }
    private void backtrack(int[] nums, int idx, List<List<Integer>> result, List<Integer> temp){
        if(idx == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        backtrack(nums,idx+1,result,temp);
        temp.add(nums[idx]);
        backtrack(nums,idx+1,result,temp);
        temp.remove(temp.size()-1);
    }
}
