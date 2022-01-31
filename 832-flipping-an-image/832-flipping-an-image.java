class Solution {
    public int[] reverse(int[] a) {
        int i = 0, j = a.length-1;
        while(i<j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;j--;
        }
        
        return a;
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int i,j;
        for(i=0;i<m;i++) {
            image[i] = reverse(image[i]);
            for(j=0;j<n;j++) {
                if(image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

}