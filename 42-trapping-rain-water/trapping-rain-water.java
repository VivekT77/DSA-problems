class Solution {
    public int trap(int[] height) {
        int water_trapped = 0;
        int left_i = 0;
        int right_i = height.length-1;
        int left_max = 0;
        int right_max = 0;

        while(left_i < right_i){
            if(height[left_i] <= height[right_i]){
                left_max = Math.max(left_max , height[left_i]);
                water_trapped += Math.max(0 , left_max - height[left_i]);
                left_i++;
            }
            else{
                right_max = Math.max(right_max , height[right_i]);
                water_trapped += Math.max(0 , right_max - height[right_i]);
                right_i--;
            }
        }
        return water_trapped;
    }
}