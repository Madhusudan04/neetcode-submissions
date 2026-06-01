class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
      Set<List<Integer>> result = new HashSet<>();
        backtrack(nums,0,result,new ArrayList<>());
        return new ArrayList<>(result);
    }
    private void backtrack(int[] nums, int idx, Set<List<Integer>> result, List<Integer> temp){
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