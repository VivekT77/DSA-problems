class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    //2ND APPROACH
    
    int [] freq1 = new int[26];
    int [] freq2 = new int[26];

    for(int i=0;i<ransomNote.length();i++){
        char ch1 = ransomNote.charAt(i);
        freq1[ch1 - 'a']++;
    }
    
    for(int i=0;i<magazine.length();i++){
        char ch2 = magazine.charAt(i);
        freq2[ch2 - 'a']++;
    }

    for(int i=0;i<26;i++){
        if(freq1[i]>freq2[i]){
            return false;
        }
    }
    return true;


        // HashMap<Character,Integer> m = new HashMap<>();
        // for(int i =0;i<magazine.length();i++){
            
        //     char ch = magazine.charAt(i);
        //     m.put(ch , m.getOrDefault(ch, 0) + 1 );     //if the ch is already present then just increment
        // }                                   //the counter otherwise add the char in the hashmap

        // for(int i=0;i<ransomNote.length();i++){

        //     char ch1  = ransomNote.charAt(i);
        //     if(m.containsKey(ch1) && m.get(ch1) > 0){     //if the char of the s1 string is present in the
        //         m.put(ch1 , m.get(ch1) - 1);            //map then decrement the counter and if counter 
        //     }else{                                  //is "0" or negative return false
        //         return false;
        //     }
        // }
        // return true;
    }
}