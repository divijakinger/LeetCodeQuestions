class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        int lower = 0;
        for (int i = 0; i < n; ++i) {
            if (reachable[i]) {
                int upper = Math.min(i + maxJump, n - 1);
                for (int j = Math.max(lower, i + minJump); j <= upper; ++j) {
                    if (s.charAt(j) == '0') {
                        reachable[j] = true;
                    }
                }
                lower = upper + 1;
            }
        }
        return reachable[n - 1];
    }
}