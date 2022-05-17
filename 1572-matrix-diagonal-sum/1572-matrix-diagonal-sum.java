class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int start = 0, end = mat.length - 1 ; start < mat.length ; start++, end--){
            sum += mat[start][start];
            
            if (end != start){
                sum += mat[start][end];    
            } 
        }
        return sum;
    }
}