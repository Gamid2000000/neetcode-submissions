class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int c: nums){
            set.add(c);
        }

        int total = 0;

        for(int num: nums){
            if(!set.contains(num-1)){
                int length =1;
                while(set.contains(num + length)){
                    length++;
                }
                total = Math.max(total , length);
            }
        }
        return total;
        
    }
}
