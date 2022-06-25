class Solution {
    public boolean isIsomorphic(String s, String t) {
        return toString(s).equals(toString(t));
    }
    
    String toString(String s){
        HashMap<Character,Integer> map_s = new HashMap<>();
        String str_s = "";

        for (int i = 0; i < s.length(); i++) {
            if (!map_s.containsKey(s.charAt(i))){
                map_s.put(s.charAt(i),i);
                str_s += String.valueOf(i);
            } else {
                str_s += String.valueOf(map_s.get(s.charAt(i)));
            }
            str_s+=" ";
        }
        return str_s;
    }
}