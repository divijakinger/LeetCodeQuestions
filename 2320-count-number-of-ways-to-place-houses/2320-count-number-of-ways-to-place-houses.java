class Solution {
    public int countHousePlacements(int n) {
        long f0 = 1;
        long f1 = 2;
        for (int i = 2; i <= n; i++) {
            long f2 = (f0 + f1) % (long) (Math.pow(10, 9) + 7);
            f0 = f1;
            f1 = f2;
        }
        return (int) ((f1 * f1) % (long) (Math.pow(10, 9) + 7));
    }
}