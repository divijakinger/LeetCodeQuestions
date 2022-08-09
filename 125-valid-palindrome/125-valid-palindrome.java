class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder("");
        
        for(int i = 0; i < s.length(); i++) 
            if(Character.isLetterOrDigit(s.charAt(i))) str.append((s.charAt(i) + "").toLowerCase());
    
        String newS = str.toString();
        int start = 0;
        int end = newS.length() - 1;
        
        while(start < end) 
            if(newS.charAt(start++) != newS.charAt(end--)) return false;
      
        
        return true;
        
    }
}