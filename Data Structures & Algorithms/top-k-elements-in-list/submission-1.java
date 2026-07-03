class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] list = new ArrayList[nums.length + 1];

        for(int i=0;i<list.length;i++){
          list[i] = new ArrayList<>();
        }

        for(int num:nums){
          map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
          list[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int count = 0;

        for(int i = list.length-1;i>=0 && count < k;i--){
          for(int n: list[i]){
            res[count++] = n;
            if(count == k){
              return res;
            }
          }
        }
        return res;
    }
}
