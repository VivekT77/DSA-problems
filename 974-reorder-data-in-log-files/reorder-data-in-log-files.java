class Solution {
    public String[] reorderLogFiles(String[] logs) {

        List<String> ans = new ArrayList<>();
        List<String> digit_logs = new ArrayList<>();
        List<String[]> letter_logs = new ArrayList<>();

        for(String s: logs){
            int i = s.indexOf(" ");
            if(Character.isDigit(s.charAt(i +1))){
                digit_logs.add(s);
            }
            else{
                letter_logs.add(new String[] {s.substring(0,i),s.substring(i+1)});
            }
        }

        Collections.sort(letter_logs , Comparator.comparing((String[] letterlog ) -> letterlog[1]).thenComparing((String[] letterlog) -> letterlog[0]));

        for(String[] letterlog: letter_logs){
            ans.add(letterlog[0] + " " + letterlog[1]);
        }

        for(String digitlog: digit_logs){
            ans.add(digitlog);
        }

        return ans.toArray(new String[0]);
    }
}