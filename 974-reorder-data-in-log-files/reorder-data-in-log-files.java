class Solution {
    public String[] reorderLogFiles(String[] logs) {

        int n = logs.length;
         List<String> result = new ArrayList<>();
         List<String> digit_logs = new ArrayList<>();
         List<String[]> letter_logs = new ArrayList<>();

        for(String s :logs){
            int i = s.indexOf(" ");
            if(Character.isDigit(s.charAt(i+1))){
                digit_logs.add(s);
            }else{
                letter_logs.add(new String[]{s.substring(0,i),s.substring(i+1)});
            }
        }

        Collections.sort(letter_logs, Comparator.comparing((String[] letter_log) -> letter_log[1]).thenComparing((String[] letter_log) -> letter_log[0]));

        for(String[] letter_log : letter_logs){
            result.add(letter_log[0] + " " + letter_log[1]);
        }

        for(String digit : digit_logs){
            result.add(digit);
        }
        return result.toArray(new String[n]);
    }
}