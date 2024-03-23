class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>(); 
        for(int i=0;i<words.length;i++){ //to iterate over the array "words"
            for(int j=0;j<words[i].length();j++){ //to iterate over the particular word in the array
                if(words[i].charAt(j)==x){ 
                    ans.add(i);
                    break; //otherwise it will return all the indexes of similar letters instead of one 
                }
            }
        }
        return ans;

        // List<Integer> ans = new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     if(words[i].indexOf(x)!=-1){ //if it is found then add the index at which the element lies
        //         ans.add(i);
        //     }
        // }
        // return ans;
    }
}