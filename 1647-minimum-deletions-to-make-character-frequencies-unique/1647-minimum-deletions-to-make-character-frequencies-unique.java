class Solution {
    public int minDeletions(String s) {
        int a[] = new int[26];
        for(int i = 0 ; i < s.length() ; ++i){
            ++a[s.charAt(i) - 'a'];
        }
        Arrays.sort(a);
        int res= a[25];
        int count = 0;
        for(int i = 24 ; i >= 0 &&  a[i] != 0; --i){
            while(a[i] >= res && a[i] >0){
                --a[i];
                ++count;
            }
            res = a[i];
        }
        return count;
    }
}