/*bool find132pattern(int* nums, int numsSize) {
        for(int i=0;i<numsSize;i++){
            for(int j=i+1;j<numsSize;j++){
                for(int k=j+1;k<numsSize;k++){
                if(nums[i]<nums[k]&&nums[k]<nums[j])
                return true;
            }
        } 
    }
    return false;
}*/
bool find132pattern(int* nums, int numsSize) {

    int stack[numsSize];
    int top = -1;
    int third = INT_MIN;
    for (int i = numsSize - 1; i >= 0; i--) {
        if (nums[i] < third)
            return true;
        while (top >= 0 && nums[i] > stack[top]) {
            third = stack[top];
            top--;
        }
        stack[++top] = nums[i];
    }
    return false;
}