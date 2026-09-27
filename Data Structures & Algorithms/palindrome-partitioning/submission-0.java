class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans = new ArrayList<>();
        backtrack(s , 0  , new ArrayList<>(), ans);
        return ans;
    }
    void backtrack(String s , int start , List<String>temp , List<List<String>>ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(pal(s, start , i)){
                temp.add(s.substring(start , i+1));
                backtrack(s , i + 1, temp , ans);
                temp.remove(temp.size()-1);
            }
        }
    }
    boolean pal(String s , int l , int r){
        while(l <= r){
        if(s.charAt(l++) != s.charAt(r--)){
            return false;

        }


        }
        return true;
        }
    }

