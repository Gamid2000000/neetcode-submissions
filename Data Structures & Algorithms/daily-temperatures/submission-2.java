class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int[] result = new int[temp.length];

        for(int i = 0;i<temp.length; i++){
            while(!stack.isEmpty() && temp[stack.peek()] < temp[i]){
                result[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return result;
    }
}
