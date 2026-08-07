class Solution {
    public int majorityElement(int[] nums) {
        int candidate=0;                       //current candidate
        int count=0;                          //vote count of candidate
        for(int i=0;i<nums.length;i++){
            if(count==0){                    //if vote count 0,choose new candidate
                candidate=nums[i];           
            }
            if(nums[i]==candidate){         //same candidate->count++
                count++;       
            }
            else                           //diff candidate->count--
            count--;
        }
        return candidate;
    }
}

        /*for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
            if(nums[i]==nums[j]){
                count++;
            }
        }
            if(count >nums.length/2){   
            return nums[i];
        }
    }
        return -1;
}
/*/

           