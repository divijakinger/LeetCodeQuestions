class Solution {
    public boolean isIsomorphic(String s, String t) {
        return changetoString(s).equals(changetoString(t));
    }
    
    String changetoString(String s){
        HashMap<Character,Integer> map_s = new HashMap<>();
        StringBuilder str_s = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!map_s.containsKey(s.charAt(i))){
                map_s.put(s.charAt(i),i);
                str_s.append(String.valueOf(i));
            } else {
                str_s.append(String.valueOf(map_s.get(s.charAt(i))));
            }
            str_s.append(" ");
        }
        return str_s.toString();
    }
}