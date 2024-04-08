class Solution {
    public String reverseVowels(String s) {
        char [] str = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !isVowel(str[i])){
            i++;
        }
        while(i<j && !isVowel(str[j])){
            j--;
        }
        if(i<j){
            char temp = str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        }
        return new String(str);
    }

    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || 
        c == 'I' || c == 'O' || c == 'U';
    }
}