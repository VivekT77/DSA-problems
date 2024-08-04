class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }

        HashMap<Character, Integer> m = new HashMap<>();    //ch and frequency of the particular ch is stored
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            m.put(ch , m.getOrDefault(ch,0) + 1);
        }
        
        for(int i=0;i<t.length();i++){
           char ch = t.charAt(i);
           if(m.get(ch)!=null){         //if the freq in the map is not null  then start the operation of 
                if(m.get(ch)==1){       // reducing the freq of the character
                    m.remove(ch);       // if one remove the ch
                }else{
                    m.put(ch , m.get(ch) - 1);    //if more than one then reduce the freq of particular ch 
                }
           }else{
            return false;
           } 
        }
        return m.isEmpty();
    }
}