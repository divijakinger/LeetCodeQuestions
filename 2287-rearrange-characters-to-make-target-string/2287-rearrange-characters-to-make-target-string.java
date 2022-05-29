class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] from = new int[26];
        for (char c : s.toCharArray()) {
            from[c - 'a']++;
        }

        int[] to = new int[26];
        for (char c : target.toCharArray()) {
            to[c - 'a']++;
        }

        int result = s.length();
        for (int i = 0; i < 26; i++) {
            if (to[i] != 0) {
                result = Math.min(result, from[i] / to[i]);
            }
        }
    return result;
    }
}