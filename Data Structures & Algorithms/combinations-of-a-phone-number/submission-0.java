class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String> result = new ArrayList<>();
        backtrack(digits,0,result,map, new StringBuilder());
        return result;
    }
    private void backtrack(String digits, int idx, List<String> result, Map<Character,String> map, StringBuilder sb){
        if(idx == digits.length()){
            result.add(sb.toString());
            return;
        }
        String current = map.get(digits.charAt(idx));
        for(int i = 0; i < current.length(); i++){
            sb.append(current.charAt(i));
            backtrack(digits,idx+1,result,map,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}