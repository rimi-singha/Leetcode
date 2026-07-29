import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] present = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            present[nums[i]] = true;
        }
        List<Integer> ans = new ArrayList<>();
        // Find missing numbers
        for (int i = 1; i <= nums.length; i++) {
            if (!present[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}