class Solution {
    public int[][] generateMatrix(int n) {
         int[][] matrix = new int[n][n];
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int count = 1;
        while (top <= bottom && left <= right) {

            // above row
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count;
                count++;
            }
            top++;

            // right row
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count;
                count++;
            }
            right--;

            // bottom row
            for (int i = right; i >= left && top <= bottom; i--) {
                matrix[bottom][i] = count;
                count++;
            }
            bottom--;
            // left row
            for (int i = bottom; i >= top && left <= right; i--) {
                matrix[i][left] = count;
                count++;
            }
            left++;
        }
        return matrix;
    }
}