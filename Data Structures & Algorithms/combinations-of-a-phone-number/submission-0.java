class Solution {
      String[]map = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"

        };
    public List<String> letterCombinations(String digits) {
      List<String>ans = new ArrayList<>();
       if(digits.length()==0){
            return ans;
        }
      backtrack(digits , 0 , new StringBuilder() , ans);
      return ans;

    }
    void backtrack(String digits , int index , StringBuilder curr , List<String>ans){
       if(index == digits.length()){
            ans.add(curr.toString());
             return;
        }
        String helper = map[digits.charAt(index)-'0'];
        for(int i = 0; i < helper.length(); i++){
          curr.append(helper.charAt(i));
          backtrack(digits , index+1 , curr , ans);
          curr.deleteCharAt(curr.length()-1);
        }

    }
}
