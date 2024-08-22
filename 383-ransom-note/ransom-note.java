class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> m = new HashMap<>();
        for(int i =0;i<magazine.length();i++){
            
            char ch = magazine.charAt(i);
            m.put(ch , m.getOrDefault(ch, 0) + 1 );     //if the ch is already present then just increment
        }                                   //the counter otherwise add the char in the hashmap

        for(int i=0;i<ransomNote.length();i++){

            char ch1  = ransomNote.charAt(i);
            if(m.containsKey(ch1) && m.get(ch1) > 0){     //if the char of the s1 string is present in the
                m.put(ch1 , m.get(ch1) - 1);            //map then decrement the counter and if counter 
            }else{                                  //is "0" or negative return false
                return false;
            }
        }
        return true;
    }
}