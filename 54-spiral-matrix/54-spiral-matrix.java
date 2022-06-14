class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> solution = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // above row
            for (int i = left; i <= right; i++) {
                solution.add(matrix[top][i]);
            }
            top++;

            // right row
            for (int i = top; i <= bottom; i++) {
                solution.add(matrix[i][right]);
            }
            right--;

            // bottom row
            for (int i = right; i >= left && top <= bottom; i--) {
                solution.add(matrix[bottom][i]);
            }
            bottom--;
            // left row
            for (int i = bottom; i >= top && left <= right; i--) {
                solution.add(matrix[i][left]);
            }
            left++;
        }
        return solution;
    }
}