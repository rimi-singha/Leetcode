/*class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
             totalsum=totalsum+nums[i];
        }
         for(int i=1;i<nums.length;i++){
            int leftsum=sum+nums[i-1];
             int rightsum = totalSum - leftsum - nums[i];
         }
         if(leftsum==rightsum){
                     return i;
                }
            }
    }*/
          class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;
        int leftsum = 0;

        // Find total sum
        for (int i = 0; i < nums.length; i++) {
            totalsum += nums[i];
        }

        // Check every possible pivot
        for (int i = 0; i < nums.length; i++) {

            int rightsum = totalsum - leftsum - nums[i];

            if (leftsum == rightsum) {
                return i;
            }

            leftsum += nums[i];
        }

        return -1;
    }
}