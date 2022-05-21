class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int[] max = new int[special.length+1];
        Arrays.sort(special);
        for (int i = 0;i<special.length;i++){
            if (i==0){
                max[i] = special[i]-bottom;
            }
            else {
                max[i] = special[i]-special[i-1]-1;
            }
        }
        max[special.length] = top - special[special.length-1];
        
        int maximum = max[0];
        for (int ele : max){
            if (ele >  maximum){
                maximum = ele;
            }
        }
        
        if (maximum==1){
            return 0;
        } else {
            return maximum;
        }
    }
}