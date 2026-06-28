class Solution {
    public int maxArea(int[] h) {
      int left = 0;
      int right = h.length-1;
      int area = 0;

      while(left<right){
        area = Math.max(area, Math.min(h[left],h[right])*(right-left));

        if(h[left]<h[right]){
          left++;
        }
        else{
          right--;
        }
      }
      return area;
    }
}
