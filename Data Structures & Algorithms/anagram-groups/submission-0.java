class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();

            for(String s: strs){
                char[] charSort = s.toCharArray();
                Arrays.sort(charSort);
                String sorted = new String(charSort);
                res.putIfAbsent(sorted,new ArrayList<>());
                res.get(sorted).add(s);
            }
        return new ArrayList<>(res.values());    
    }
}
