class Solution {
    public String interpret(String command) {
        String part_1 = command.replace("()","o");
        String part_2 = part_1.replace("(al)","al");
        return part_2;
    }
}