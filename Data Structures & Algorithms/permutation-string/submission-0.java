class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if(k > s2.length()){
          return false;
        }
        HashMap<Character , Integer>need = new HashMap<>();
        HashMap<Character , Integer>window = new HashMap<>();
        for(char ch : s1.toCharArray()){
          
          need.put(ch , need.getOrDefault(ch , 0) + 1);
        }
        int i = 0;
        int j = 0;
        while( j < s2.length()){
          char ch = s2.charAt(j);
          window.put(ch , window.getOrDefault(ch , 0) + 1);
          if(j - i + 1 < k) j++;
         else if(j - i + 1 == k){
            if(need.equals(window)){
              return true;
            }
            char left = s2.charAt(i);
            window.put(left , window.get(left) - 1);
            if(window.get(left) == 0){
              window.remove(left);
            }
              i++;
              j++;
            }
          }
          return false;
        }
    }

