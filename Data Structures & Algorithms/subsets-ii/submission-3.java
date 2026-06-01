class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0, new ArrayList<>(), nums);
        return result;
    }
    private void backtrack(int i, List<Integer> subset, int[] nums) {
        result.add(new ArrayList<>(subset));
        for(int j = i; j<nums.length; j++){
            if(j > i && nums[j] == nums[j-1]) continue;
            subset.add(nums[j]);
            backtrack(j + 1, subset, nums);
            subset.remove(subset.size() - 1);
        }
    }
}
