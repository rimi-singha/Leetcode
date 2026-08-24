/*class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int[] arr = new int[nums.length - k + 1];

        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];

            for (int j = i; j < i + k; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            arr[i] = max;
        }
        return arr;
    }
}*/

import java.util.*;
class Solution{
     public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];{

        Deque<Integer>q=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++){
             
              // 1. Remove index outside the window
        if(!q.isEmpty() && q.peek()< i-k+1){
            q.poll();
        }
             // 2. Remove smaller elements from the back
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            // 3. Add current index
            q.add(i);

            // 4. Store maximum
            if (i >= k - 1) {
                arr[i - k + 1] = nums[q.peek()];
            }
        }
        return arr;
    }
     }
}



