class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] count = new int[128];
        for (char c : t.toCharArray()) {
            count[c]++;
        }
        int left = 0;
        int right = 0;
        int needed = t.length();
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (count[c] > 0) {
                needed--;
            }
            count[c]--;
            right++;
            while (needed == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                char ch = s.charAt(left);
                count[ch]++;
                if (count[ch] > 0) {
                    needed++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}