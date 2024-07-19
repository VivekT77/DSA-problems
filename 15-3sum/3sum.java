class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> L = new ArrayList<>(); 
        // Set<List<Integer>> s = new HashSet<>();
        // int n= nums.length;
        //     for(int i =0;i<n-2;i++){
        //         for(int j =i+1;j<n-1;j++){
        //             for(int k=j+1;k<n; k++){
        //                 if(nums[i]+nums[j]+nums[k]==0){
        //                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //            }
        //         }
        //     }
        // }
        // L.addAll(s);
        // return L;

        List<List<Integer>> L = new ArrayList<>(); 
        Set<List<Integer>> s = new HashSet<>();  //to store the lists as triplets & add in ans 
        int n= nums.length;
        Arrays.sort(nums); //to make the searching fast ,do sort
        for(int i=0;i<n;i++){
            // now use the two sum or two pointer approach
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum =nums[i]+nums[j]+nums[k];
                if(sum==0){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));   //we need to store the
                    j++;        //possibilities of the nums in list format ,so Arrays.asList()
                    k--;        //makes a new list into it to store the possibilities
                }else if(sum>0){
                    k--;
                }else{
                    j++;
                }
            } 
        }
        L.addAll(s);
        return L;
    }
}