class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word_1 = "";
        String word_2 = "";
        for (String j : word1){
            word_1 += j;
        }
        for (String i : word2){
            word_2 += i;
        }
        
        if (word_1.equals(word_2)){
            return true;
        }
        return false;
    }
}