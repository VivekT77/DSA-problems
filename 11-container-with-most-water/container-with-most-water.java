class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end =height.length-1;
        int max_water = 0;

        while(start<end){
            int length = Math.min(height[start], height[end]); //height of the container
            int width = end-start;                             
            int area = length * width;  // during process calculated water
 //calculate for all the possible start,end and compare it with the previous calculated water           
            max_water = Math.max(area, max_water);

            if(height[start]>height[end]){
                end--;
            }
            else if(height[start]<height[end]){
                start++;
            }
            else{
                start++;
                end--;
            }
        }
        return max_water;
    }
}