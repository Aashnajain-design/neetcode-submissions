class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>>ans = new ArrayList<>();
        for ( int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int target = nums[i] * -1;
            int left = i + 1;
            int right = n - 1;
            while( left < right){
                int s = nums[left] + nums[right];
                if(s == target){
                    List<Integer>temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                
                while(left < right && nums[left] == nums[left-1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
            }
           else  if(s < target) left++;
            else right--;
        }
        }
        return ans;
    }
}
