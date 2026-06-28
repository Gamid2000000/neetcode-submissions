class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
       }

       int[] ss = new int[26];
       for(int i=0; i<s.length();i++){
        ss[s.charAt(i) - 'a']++;
        ss[t.charAt(i) - 'a']--;
       }
       for(int value: ss){
        if(value != 0){
            return false;
        }
       }
        return true;
    }
}
