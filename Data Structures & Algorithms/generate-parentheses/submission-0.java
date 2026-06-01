class Solution {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n,n, new StringBuilder());
        return result;    
    }
    private void dfs(int open, int close, StringBuilder sb){
        if(close == 0){
            result.add(sb.toString());
            return;
        }
        if(open > 0){
            sb.append('(');
            dfs(open-1,close,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(open < close){
            sb.append(')');
            dfs(open,close-1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
