class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        ArrayList<Integer> l = new ArrayList<>();

        for(int num:nums1){
            s.add(num);
        }

        for(int i=0;i<nums2.length;i++){
            if(s.contains(nums2[i])){
                l.add(nums2[i]);
                s.remove(nums2[i]);
            }
        }

        int[] result = new int[l.size()];
        for(int i=0;i<l.size();i++){
            result[i] = l.get(i);
        }
        return result;
    }
}