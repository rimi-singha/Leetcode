double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int total=nums1Size+nums2Size;
    int arr[total];
    int k=0;
    for(int i=0;i<nums1Size;i++){
        arr[k++]=nums1[i];
    }
         for(int i=0;i<nums2Size;i++){
        arr[k++]=nums2[i];
         }
        for(int i=0;i<total-1;i++){    //bubble sort
        for(int j=0;j<total-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        }
        }
        if (total%2==0)
        return(arr[total/2]+arr[total/2-1])/2.0;
        else
        return arr[total/2];
    }
