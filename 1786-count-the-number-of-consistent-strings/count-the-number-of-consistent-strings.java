class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> s = new HashSet<>();     //add all the characters of the allowed in the set
        for(int i=0;i<allowed.length();i++){
            s.add(allowed.charAt(i));
        }

        int count=0;
        for(String str : words){    //now iterate over the particular word in the words array and maintain
            int is_consistent = 1;      //the isconsistent flag  to take care ,whether the words are 
            for(int i=0;i<str.length();i++){       //consistent or not , if consistent then break otherwise
                if(!s.contains(str.charAt(i))){         //count the no .of times the flag not became "0"
                    is_consistent = 0;
                    break;
                }
            }
        count += is_consistent;
        }
        return count;
    }
}