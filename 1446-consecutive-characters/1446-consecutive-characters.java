class Solution {
    public int maxPower(String s) {
        if (s == null || s.length() == 0) return 0;

        int i =0;
        int count =1;
        int max =1;
        while (i<s.length()-1){
            
            if (s.charAt(i)==s.charAt(i+1)){
                count++;
                i++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
                i++;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}