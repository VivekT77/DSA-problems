class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String result = s + s;//to get the all possible roations of the string just add the string with itself
        return result.contains(goal);
    }
}