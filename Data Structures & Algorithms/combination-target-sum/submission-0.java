class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>>ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(nums , target , 0 , new ArrayList<>()  , ans);
        return ans;
    }
    void backtrack(int[] nums , int target , int start , List<Integer>temp , List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0) return;
        for(int i = start; i < nums.length; i++){
            temp.add(nums[i]);
            backtrack(nums , target - nums[i] , i , temp , ans);
            temp.remove(temp.size()-1);
        }
    }
}
