class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String s:patterns){
            if(word.contains(String.valueOf(s))) c++;
        }
        return c;

    }
}
