class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int dp1[] = new int[n];
        int dp2[] = new int[n];
        Arrays.fill(dp1 , -1);
        Arrays.fill(dp2 , -1);
        int case1 = f(n-2 , 0 , dp1 , nums);
        int case2 = f(n-1 , 1 , dp2 , nums);
        return Math.max(case1 , case2);
    }
    int f(int idx , int s , int[]dp , int []nums){
        if(idx==s) return nums[s];
        if(idx < s) return 0;
        if(dp[idx] !=-1) return dp[idx];
        int take = nums[idx] + f(idx-2 , s , dp , nums);
        int not = 0 + f(idx-1 , s , dp , nums);
        dp[idx] = Math.max(take , not);
        return dp[idx];
    }
}
