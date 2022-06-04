class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
       map.put('I', 1);
       map.put('V', 5);
       map.put('X', 10);
       map.put('L', 50);
       map.put('C', 100);
       map.put('D', 500);
       map.put('M', 1000);

        int n = s.length();
        int result = 0;

        for(int i = 0; i < n; i++){
            if(i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
                result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                i++; 
            }else{
               result += map.get(s.charAt(i)); 

            }
        }
      return result;  
    }
}