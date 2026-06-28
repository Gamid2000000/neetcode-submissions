class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

          for(int var: nums){
            if(set.contains(var)){
              return true;
            }
            set.add(var);
          }
        return false;  
    }
}