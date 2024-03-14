//logic=> first make one hashset where store no. of nums1 in it and now check if the no.s of set is present in nums2 if there then add the no. in new arraylist and remove the particular no.s from the hashset now initialize new array where the the common elements from the arraylist will be displayed
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
         int[] ans = new int[result.size()];
          for(int i=0;i<result.size();i++){
            ans[i] =result.get(i);
          } 
          return ans; 
    }
}