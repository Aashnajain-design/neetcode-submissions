class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0; int j = 0; int max = 0;
        int freq[] = new int[26];
        int maxf = Integer.MIN_VALUE;
        while( j < s.length()){
            freq[s.charAt(j)-'A']++;
            maxf = Math.max(maxf , freq[s.charAt(j)-'A']);
            if(j - i + 1 - maxf <= k){
                max = Math.max(max , j - i + 1);
                j++;
            }
            else{
                freq[s.charAt(i)-'A']--;
                i++;
                j++;
            }
        }
        return max;
    }
}
