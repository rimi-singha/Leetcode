class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length - 1;
        int max=0;
        while(left<right){
                int h=Math.min(height[left],height[right]);
                int width=right-left;
                int water=h*width;
                if(max<water){
                    max=water;
                }
                if(height[left] < height[right]){
                    left++;
                }
                else 
                right--;
        }
    
    return max;
    }
}

         
/*class Solution {
    public int maxArea(int[] height) {
        int h=0;
        int max=0;
        int water=1;
        for(int i=0;i<height.length;i++){
            for(int j=height.length-1;j>0;j--){
                int dist=j-i;
                if(height[j]<height[i]){
                 h=height[j];
                }
                else
                h=height[i];
                water=h*dist;
                if(max<water){
                max=water;
                }
                
            }

        }
        return max;
        
    }
}*/
