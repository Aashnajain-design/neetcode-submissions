class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int far = 0;
      
        for(int i = 0;  i < nums.length; i++){
            if(i > far){
                break;
            }
            far = Math.max(far , i + nums[i]);
            if(i==n-1){
                return true;
            }
        }
        return false;
    }
}
