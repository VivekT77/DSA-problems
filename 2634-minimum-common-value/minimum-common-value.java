//logic=>for eg1 first it will go in elseif i.e 1<2 therefor i++ ,now 2==2 which is (if condition) same way proceed forward 
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0,j=0;
         while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if (nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }  
        }   
        return -1;
    }
}