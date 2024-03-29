class Solution {
    public int[] decode(int[] encoded, int first) {
        int nums[]=new int[encoded.length+1];
        nums[0]=first;
        int index=0;
        for(int i=0;i<encoded.length;i++){
            int ans=nums[index++]^encoded[i];
            nums[index]=ans;
        }
        return nums;
    }
}