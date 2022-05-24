class Solution {
    public String reverseWords(String s) {
        String[] arrOfStr = s.split(" ");
        String[] ans = new String[arrOfStr.length];


        for (int i = 0; i < arrOfStr.length; i++) {
            ans[i] = reverse(arrOfStr[i]);
        }

        String joinedString = String.join(" ", ans);
        
        return joinedString;
    }
    
    String reverse(String a){
        String na="";
        char ch;
        for (int i=0; i<a.length(); i++)
        {
            ch= a.charAt(i); 
            na= ch+na; 
        }
        return na;
    }
}