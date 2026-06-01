class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums, target, 0, 0, result, new ArrayList<>());
        return result;
    }
    private void dfs(
        int[] nums, int target, int total, int i, List<List<Integer>> result, List<Integer> combination) {
        if (target == total) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (i >= nums.length || total > target) {
            return;
        }
        
        combination.add(nums[i]);
        dfs(nums, target, total + nums[i], i, result, combination);
        combination.remove(combination.size() - 1);
        
        dfs(nums, target, total, i + 1, result, combination);
    }
} 