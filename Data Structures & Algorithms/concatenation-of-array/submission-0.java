class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            list.add(num);
        }
        list.addAll(list);
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        return arr;
    }
}