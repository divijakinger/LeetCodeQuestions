class Solution {
    List<String> al = new ArrayList<>();
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if (isPalindrome(s,i,j)){
                    count++;
                }
            }
        } 
        return count;
    }   
    
    boolean isPalindrome(String s, int l, int r){
        while(l < r){
            if(s.charAt(l++) != s.charAt(r--))  return false;
        }
        return true;
    }
    

}