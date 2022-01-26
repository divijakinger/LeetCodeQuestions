class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if (len<26) {
            return false;
        } else {
            ArrayList<Character> list = new ArrayList<>();
            for (char ch : sentence.toCharArray()) {  
                list.add(ch);
            }
            Set<Character> set = list.stream().collect(Collectors.toSet());
            if (set.size()==26){
                return true;
            } else {
                return false;
            }

        }
    }
}