class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        backtrack(n , 0 , 0 , "" , ans);
        return ans;
    }
    void backtrack(int n , int open , int close , String temp , List<String>ans){
        if(open==n && close==n){
            ans.add(temp);
            return;
        }
        if(open < n){
            backtrack(n , open + 1 , close , temp + '(' , ans);
        }
        if(close < open){
            backtrack(n , open , close+1 , temp + ')' , ans);
        }
    }
}
