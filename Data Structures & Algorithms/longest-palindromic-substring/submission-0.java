class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        Boolean dp[][] = new Boolean[n][n];
        int max = 1;
        int start = 0;
        for(int i = 0; i <n; i++){
            for(int j = i; j < n; j++){
                if(f(i , j , s , dp)){
                    int len = j - i + 1;

                    if(max < len){
                       max = len;
                       start = i;
                    }
                }

            }
        }
        return s.substring(start , start + max);
    }
    boolean f(int i , int j , String s , Boolean[][]dp){
        if(i >= j) return true;
        if(dp[i][j] != null) return dp[i][j];
        if(s.charAt(i) != s.charAt(j)){
            return dp[i][j] = false;
        }
    
    return dp[i][j] = f(i + 1 , j - 1 , s , dp);
    }
}
