class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            int currentLength = words[i].length() - 1;
            int index = Character.getNumericValue(words[i].charAt(currentLength)) - 1;
            String word = words[i].substring(0, currentLength);
            result[index] = word;
        }

        return String.join(" ", result);
    }
}