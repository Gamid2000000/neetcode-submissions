class Solution {
    public boolean hasDuplicate(int[] nums) {
        long uniqueCount = Arrays.stream(nums)
                            .distinct()
                            .count();
        return uniqueCount != nums.length;
    }
}