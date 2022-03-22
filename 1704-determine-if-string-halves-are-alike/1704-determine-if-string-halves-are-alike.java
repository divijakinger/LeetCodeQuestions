class Solution {
    public boolean halvesAreAlike(String s) {
       int mid = (s.length()/2);
        int vow_1 = 0;
        int vow_2 = 0;
        for (int i =0;i<mid;i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='i' || ch=='u' || ch=='o' || ch=='e' || ch=='A' || ch=='E' ||  ch=='I' || ch=='O' || ch=='U' ){
                vow_1 += 1;
            }
        }
        for (int i =mid;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch=='a' || ch=='i' || ch=='u' || ch=='o' || ch=='e' || ch=='A' || ch=='E' ||  ch=='I' || ch=='O' || ch=='U' ){
                vow_2 += 1;
            }
        }
        
        if (vow_1 == vow_2){
            return true;
        }
        return false;
    }
}