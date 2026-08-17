        class Solution {
        public int pivotIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        // Find total sum
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }
        //   Check every possible pivot
        for (int i = 0; i < nums.length; i++) {
            int rightsum = totalsum - leftsum - nums[i];
            if (leftsum == rightsum) {
                return i;         //return pivot index
            }
            leftsum += nums[i];
        }
        return -1;
    }
}