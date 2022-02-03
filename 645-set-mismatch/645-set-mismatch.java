class Solution {
    public int[] findErrorNums(int[] arr) {
       int i = 0;
        int[] ans = new int[2];

        while (i < arr.length){
            int correct = arr[i]-1;
            if (arr[i] != arr[correct]){
                swapArray(arr,i,correct);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans[1] = index+1;
                ans[0] = arr[index];
            }
        }

        return ans;
    }
    
    void swapArray(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}