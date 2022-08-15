class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    
    void transpose(int[][] a){
        for (int r=0;r<a.length;r++){
            for (int c=r+1;c<a.length;c++){
                int temp = a[c][r];
                a[c][r]=a[r][c];
                a[r][c]= temp;
            }
        }
    }
    
    void reverse(int[][] a){
        for (int r=0;r<a.length;r++){
            for (int c=0;c<(a.length)/2;c++){
                int temp = a[r][c];
                a[r][c]=a[r][a.length-c-1];
                a[r][a.length-c-1]=temp;
            }
        }
    }
}