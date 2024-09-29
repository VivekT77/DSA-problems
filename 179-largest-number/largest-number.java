class Solution {
    public String largestNumber(int[] nums) {
        String[] arr  = new String[nums.length];//first convert the elements of array in array of string
        for(int i=0;i<nums.length;i++){
            arr[i] = String.valueOf(nums[i]);   //used function to get the same value as string
        }

        Arrays.sort(arr, (a,b)-> (b+a).compareTo(a+b));     //compare the string array in descending order
        if(arr[0].equals("0")){                         //and sort it 
            return "0";
        }

        StringBuilder sb = new StringBuilder(); //at last append the elements in the stringbuilder from
        for(int i=0;i<arr.length;i++){          //from the array
            sb.append(arr[i]);
        }
        return sb.toString();
    }    
}