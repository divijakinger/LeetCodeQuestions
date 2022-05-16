class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int k = 1;
        for (int a : arr){
            k = Math.max(k,a);
        }

        int right = 0;
        int left = k;

        while(right<left){
            int sum = 0;
            int mid = (right + (left-right)/2);

            for (int i=0;i<arr.length;i++){
                sum +=  Math.ceil((double) arr[i] / mid);
            }

            if (sum <= h){
                left = mid;
            } else {
                right = mid+1;
            }
        }
      return left;  
    }
}   