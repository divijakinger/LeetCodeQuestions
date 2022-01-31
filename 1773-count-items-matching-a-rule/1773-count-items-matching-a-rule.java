class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column = 0;
        int ans = 0;
        if (ruleKey.equals("type")) column = 0;
        else if (ruleKey.equals("color")) column = 1;
        else column = 2;

        for (List<String> item : items) {
            if (ruleValue.equals(item.get(column))) ans++;
        }
        return ans;
    }
}