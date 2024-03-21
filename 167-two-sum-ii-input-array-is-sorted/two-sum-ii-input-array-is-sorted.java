class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int start=0,end=numbers.length-1;
         while(start<end){
            int sum = numbers[start] + numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1}; //bcoz it's 1-indexed array therefore add +1 to both
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
         }
         return new int[]{-1,-1};
    }
}