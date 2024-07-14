class Solution {
    public String getSmallestString(String s) {
        char[] str = s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            int D1 = str[i] -'0';    //to convert the char values into int
            int D2 = str[i+1] -'0';
            if((D1%2==0 && D2%2==0) || (D1%2!=0 && D2%2!=0)){  //if both are even or both are 
                if(D1>D2){                                  // odd (same parity) then swap
                char temp = str[i];                    
                str[i]=str[i+1];
                str[i+1]=temp;
                break;
                }
            }
        }
        return new String(str);
    }
}