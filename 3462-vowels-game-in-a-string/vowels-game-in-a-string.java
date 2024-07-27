class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int count=0;
        for (int i =0;i<n;i++) {
            switch(s.charAt(i)) {
                    case 'a':
                    case 'i':
                    case 'u':
                    case 'e':
                    case 'o':
                    return true;
                    }
            }   
        return false;
    }
}