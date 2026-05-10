class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        List<Integer>[] bucket = new List[n+1];
        int[] ans = new int[k];
        for(int i=0; i<=n; i++){
            bucket[i] = new ArrayList<>();
        }
        for(int num : nums){
            freqMap.put(num,freqMap.getOrDefault(num,0) + 1);
        }
        for(int key : freqMap.keySet()){
            int idx = freqMap.get(key);
            bucket[idx].add(key);
        }
        int idx = 0;
        for(int i=n; i>=0 && idx < k; i--){
            List<Integer> mostFreqElements = bucket[i];
            for(int mostFreqElement : mostFreqElements){
                ans[idx++] = mostFreqElement;
                if(idx == ans.length) break;
            }
        }
        return ans;
    }
}
