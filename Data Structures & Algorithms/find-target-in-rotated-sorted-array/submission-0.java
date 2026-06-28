class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;  // нашли целевой элемент
            }

            // Проверяем, какая половина отсортирована
            if (nums[left] <= nums[mid]) {  // левая половина отсортирована
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // ищем в левой половине
                } else {
                    left = mid + 1;   // идём в правую половину
                }
            } else {  // правая половина отсортирована
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // ищем в правой половине
                } else {
                    right = mid - 1;  // идём в левую половину
                }
            }
        }
        return -1; 
        
    }
}
