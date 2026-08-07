class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multi=1;
        int []arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
             arr[i]=multi;
             multi=multi*nums[i];
            }
            multi=1;
        for(int i=nums.length-1;i>=0;i--){
                arr[i]=arr[i]*multi;
                multi=multi*nums[i];
            }
        return arr;
    }
}
        