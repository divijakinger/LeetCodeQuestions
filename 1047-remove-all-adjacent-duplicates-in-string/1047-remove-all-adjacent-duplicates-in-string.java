class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)){
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty()){
                    stack.pop();
                }
            }
        }

        for (int j = 0; j < stack.size(); j++) {
            ans.append(stack.get(j));
        }

        return ans.toString();
    }
}