class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str =  s.split(" ");

        if(str.length != pattern.length()) {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            for(int j=i+1;j<pattern.length();j++){

                if(pattern.charAt(i)!=pattern.charAt(j) && str[i].equals(str[j])){      //eg:2
                    return false;
                }
                if(pattern.charAt(i)==pattern.charAt(j) && !str[i].equals(str[j])){     //eg:3
                    return false;
                }
            }
        }
        return true;
    }
}