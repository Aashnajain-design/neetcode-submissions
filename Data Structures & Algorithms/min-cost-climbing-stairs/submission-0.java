class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
        return Math.min(f(n-1,cost,  dp) , f(n-2 ,cost ,  dp));
    }
    int f(int i ,int[] cost ,  int dp[]){
        if(i==0) return cost[0];
        if(i==1) return cost[1];

        if(dp[i]!=-1) return dp[i];
        int one = cost[i] + f(i-1 , cost , dp);
        int two = cost[i] + f(i-2 , cost , dp);
        dp[i] = Math.min(one , two);
        return dp[i];
    }
}
