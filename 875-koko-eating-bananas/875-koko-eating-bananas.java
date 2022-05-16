class Solution {
    public int minEatingSpeed(int[] arr, int h) {
        int k = 1;
        for (int a : arr){
            k = Math.max(k,a);
        }

        int start = 0;
        int end = k;

        while(start<end){
            int sum = 0;
            int mid = (start + (end-start)/2);

            for (int i=0;i<arr.length;i++){
                sum +=  Math.ceil((double) arr[i] / mid);
            }

            if (sum <= h){
                end = mid;
            } else {
                start = mid+1;
            }
        }
      return start;  
    }
}   