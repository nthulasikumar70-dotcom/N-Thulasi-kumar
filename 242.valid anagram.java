class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        // Increment for characters in s, decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // If all counts are zero, t is an anagram of s
        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
