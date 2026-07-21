class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set  = new HashSet<>();
        int max = 0;  int i = 0; int j = 0;
        while(j < s.length()){
            char  ch = s.charAt(j);
            if(!set.contains(ch)){
                max = Math.max(max , j - i + 1);
                set.add(ch);
                j++;
            } else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}
