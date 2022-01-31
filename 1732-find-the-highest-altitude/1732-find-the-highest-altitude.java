class Solution {
    public int largestAltitude(int[] gain) {
        int prev = 0;
        int[] altitude_array = new int[gain.length + 1];
        altitude_array[0] = 0;
        
        for (int i = 0;i<gain.length;i++){
            altitude_array[i+1] = altitude_array[i]+gain[i];
        }
        
        return maxArray(altitude_array);
    }
    
    static int maxArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            // check for the element
            int element = arr[i];
            if (element > max){
                max = element;
            }
        }
        
        return max;

    }
}