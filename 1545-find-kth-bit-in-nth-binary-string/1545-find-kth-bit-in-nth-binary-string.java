class Solution {
    public char findKthBit(int n, int k) {
        return helper(n).charAt(k-1);
    }
    
    String helper(int n){
        String Sn = "0";
        for (int i = 1; i < n; i++) {
            Sn += "1"+reverseInvert(Sn);
        }
        return Sn;
    }
    
    String reverseInvert(String str){
                str = new StringBuilder(str).reverse().toString();
        StringBuilder invert = new StringBuilder();
        for(char bit: str.toCharArray()) {
            invert.append(bit == '1' ? '0' : '1');
        }
        return invert.toString();
    }
}