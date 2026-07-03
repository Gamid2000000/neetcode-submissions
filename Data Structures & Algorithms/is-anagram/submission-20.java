class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
        return false;
      }
      HashMap<Character, Integer> l = new HashMap<>();
      HashMap<Character, Integer> r = new HashMap<>();

      for(int i = 0; i<s.length();i++){
        l.put(s.charAt(i), l.getOrDefault(s.charAt(i), 0) +1);
        r.put(t.charAt(i), r.getOrDefault(t.charAt(i), 0) +1);
      }
      return l.equals(r);
  }
}
