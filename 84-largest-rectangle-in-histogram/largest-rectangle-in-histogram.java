class Solution {
    public int largestRectangleArea(int[] heights) {
        int max_Area = 0;
        int n=heights.length;
        int [] nsl = new int[n]; //to store the indices of the next smaller left element
        int [] nsr = new int[n];  //to store the indices of the next smaller right element

        //for nsl
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsl[i]=-1;  //for left before starting
            }else{
                nsl[i]=st.peek();
            }
            st.push(i);
        }
        //for nsr
        st= new Stack<>();
        for(int i=n-1;i>=0;i--){    //we need to traverse from back 
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nsr[i]=n;  //"n" will be the nsr if element next to boundary is greater than the currrent
            }else{
                nsr[i]=st.peek();
            }
            st.push(i);
        }
        //find area
        for(int i=0;i<n;i++){
        int height=heights[i];
        int width= nsr[i]-nsl[i]-1;  //j-i-1 for 3rd bar the width will be 4-1-1=2(j,i is exclude)
        int area = height*width;
        max_Area = Math.max(max_Area,area); //for each index it is calculated
        }
        return max_Area;
    }
}