class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0,left = 0,right = 0;
        HashSet<Character> set = new HashSet<>();

            while(right < s.length()){
                char c = s.charAt(right);
                    if(!set.contains(c)){
                        set.add(c);
                        answer = Math.max(answer,right - left +1);
                        right++;
                    }
                    else{
                        while(set.contains(c)){
                            set.remove(s.charAt(left));
                            left++;
                        }
                    }
            }
        return answer;
    }
}
