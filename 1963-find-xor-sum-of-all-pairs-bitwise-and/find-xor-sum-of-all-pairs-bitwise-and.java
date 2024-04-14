class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int xor1 = 0;
        int xor2 = 0;
        int n1 =arr1.length;
        int n2 =arr2.length;
        for(int i= 0;i<n1;i++){
            xor1 ^=arr1[i];
        }
        for(int i= 0;i<n2;i++){
            xor2 ^=arr2[i];
        }
        return (xor1 & xor2);
    }
}