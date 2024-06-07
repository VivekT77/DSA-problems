class Solution {
    public int appendCharacters(String s, String t) {
        int si = 0, ti = 0, sl=s.length(), tl =t.length();
        while(si<sl && ti<tl){
            if(s.charAt(si)==t.charAt(ti)){ //calculate the prefix of the "t" which is present in "s"
                ti++;                       // after that return the non-present part 
            }
            si++;
        }
        return tl-ti; //remaining part
    }
}