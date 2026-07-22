class Solution {
    public int[] runningSum(int[] nums) {
        int []arr=new int [nums.length];
         arr[0] = nums[0];
        for(int i=0;i<nums.length-1;i++){
            arr[i+1]=nums[i+1]+arr[i];
        }
        return arr;
    }
}
