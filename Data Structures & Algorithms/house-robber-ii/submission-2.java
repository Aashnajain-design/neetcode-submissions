class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        int case1 = f(n-2 , 0 , nums , dp1);
        int case2 = f(n-1 , 1, nums , dp2);
        return Math.max(case1 , case2);
        
    }
    int f(int idx , int start , int[]nums , int[]dp){
        if(idx == start) return nums[start];
        if(idx < start) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = nums[idx] + f(idx - 2, start , nums , dp);
        int not = 0 + f(idx - 1, start , nums , dp);
        dp[idx] = Math.max(take , not);
        return dp[idx];
    }
}
