class Solution {
    public String restoreString(String s, int[] indices) {
        char ans[] = new char[s.length()];
        for (int i = 0;i<s.length();i++){
            ans[indices[i]] = s.charAt(i);
        }
        String ans_str = new String(ans);
        return ans_str;
    }
}