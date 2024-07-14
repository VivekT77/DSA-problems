class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        int n =asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            if(asteroids[i]>0 || st.isEmpty()){     //if +ve add in stack
                st.push(asteroids[i]);
            }else{          //if -ve see whether it gets cancel or not
                while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(asteroids[i])){
                    st.pop();           //math.abs is use to get the value of element not sign
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){     //refer eg:2
                    st.pop();
                }else{
                    if(st.isEmpty() || st.peek()<0){  //for eg=>{-2,-1,1,2} initially stack is empty
                        st.push(asteroids[i]);          //therefore add it in stack 
                    }
                }
            }
        }
        int[] ans = new int[st.size()]; //now add the stacks element in the reverse order in answer
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}