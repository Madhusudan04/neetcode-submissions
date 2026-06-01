class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(candidates,target,0,result,new ArrayList<>());
        return result;
    }
    private void dfs(int[] candidates, int target, int idx, List<List<Integer>> result, List<Integer> temp){
        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i<candidates.length; i++){
            if(i != idx && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) return;

            temp.add(candidates[i]);
            dfs(candidates,target-candidates[i],i+1,result,temp);
            temp.remove(temp.size()-1);
        }
    }
}
