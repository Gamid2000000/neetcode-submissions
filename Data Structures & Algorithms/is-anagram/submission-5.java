class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }
        char[] l = s.toCharArray();
        char[] r = t.toCharArray();

        Arrays.sort(l);
        Arrays.sort(r);

        return Arrays.equals(l,r);
    }
}
