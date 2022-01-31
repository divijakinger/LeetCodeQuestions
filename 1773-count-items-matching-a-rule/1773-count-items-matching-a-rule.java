class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column = 0;
        int ans = 0;
        if (ruleKey.equals("color")) {
            column = 1;
        } else if (ruleKey.equals("name")){
            column = 2;
        } else {
            column = 0;
        }
        
        for (int row=0;row<items.size();row++){
            if (items.get(row).get(column).equals(ruleValue)){
                ans++;
            }
        }
        return ans;
    }
}