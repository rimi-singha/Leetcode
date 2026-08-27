class Solution {
    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0) return 0;

        int[] height = new int[matrix[0].length];
        int ans = 0;

        for (int i = 0; i < matrix.length; i++) {

            // Build histogram
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1')
                    height[j]++;
                else
                    height[j] = 0;
            }

            // Find largest rectangle in histogram
            ans = Math.max(ans, largestRectangle(height));
        }

        return ans;
    }

    public int largestRectangle(int[] h) {

        int max = 0;

        for (int i = 0; i < h.length; i++) {

            int left = i;
            int right = i;

            while (left > 0 && h[left - 1] >= h[i])
                left--;

            while (right < h.length - 1 && h[right + 1] >= h[i])
                right++;

            int area = h[i] * (right - left + 1);
            max = Math.max(max, area);
        }

        return max;
    }
}