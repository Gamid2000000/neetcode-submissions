class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int length = 0;
        int total = 0;
        for(int num: set){
            if(!set.contains(num -1)){
                length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                total = Math.max(total,length);
            }
        }
        return total;
    }
}
