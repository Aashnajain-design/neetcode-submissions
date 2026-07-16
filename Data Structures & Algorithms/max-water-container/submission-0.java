class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n - 1;
        int min = Integer.MAX_VALUE;
        int water = 0;
        while(i < j){
            min = Math.min(heights[i] , heights[j]);
            int w = j - i ;
            water = Math.max(water  , min * w);
           if(heights[i] < heights[j]) i++;
            else j--;
        }
        return water;
    }
}
