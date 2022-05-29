class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] first = new int[26];
        for (char c : s.toCharArray()) {
            first[c - 'a']++;
        }

        int[] second = new int[26];
        for (char c : target.toCharArray()) {
            second[c - 'a']++;
        }

        int result = s.length();
        for (int i = 0; i < 26; i++) {
            if (second[i] != 0) {
                result = Math.min(result, first[i] / second[i]);
            }
        }
    return result;
    }
}