class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans= new ArrayList<>();
        backtrack(nums , new boolean[nums.length] , new ArrayList<>() , ans);
        return ans;
    }
    void backtrack(int[] nums , boolean[]used  , List<Integer>temp , List<List<Integer>>ans){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            temp.add(nums[i]);
            used[i] = true;
            backtrack(nums , used , temp , ans);
            temp.remove(temp.size()-1);
            used[i] = false;
        }
    }
}
