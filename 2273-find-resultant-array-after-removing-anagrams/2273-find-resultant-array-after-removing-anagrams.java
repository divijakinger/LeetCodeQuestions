class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> wordslist = new ArrayList<String>();
        wordslist.addAll(Arrays.asList(words));


        
        int i =1;
        while(i<wordslist.size()){
            if (checkAna((String) wordslist.get(i), (String) wordslist.get(i-1))){
                wordslist.remove(i);
            } else {
                i++;
            }
        }
        return wordslist;
    }
    
    boolean checkAna(String a, String b){
        char[] a_list = a.toCharArray();
        char[] b_list = b.toCharArray();

        if (a_list.length != b_list.length){
            return false;
        }

        Arrays.sort(a_list);
        Arrays.sort(b_list);

        for (int i=0;i<a_list.length;i++){
            if (a_list[i]==b_list[i]){
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}