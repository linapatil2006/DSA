class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxlen = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < n; r++) {
            while (set.contains(s.charAt(r))) { 
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(r));
            maxlen = Math.max(maxlen, r - left + 1);
        }
        return maxlen;
    }
}