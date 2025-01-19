class Solution {
    public boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
        //whole line containing the methods give return value as true or false
    }
}