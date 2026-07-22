class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] arr = new int[total];

        int k = 0;
        //copy nums1
        for (int i = 0; i < nums1.length; i++) {
            arr[k++] = nums1[i];
        }
        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            arr[k++] = nums2[i];
        }
        // Bubble Sort
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Find Median
        if (total % 2 == 0) {
            return (arr[total / 2] + arr[total / 2 - 1]) / 2.0;
        } else {
            return arr[total / 2];
        }
    }
} 
