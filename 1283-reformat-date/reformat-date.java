class Solution {
    public String reformatDate(String date) {

        HashMap<String,String> m = new HashMap<>();
        m.put("Jan","01");
        m.put("Feb","02");
        m.put("Mar","03");
        m.put("Apr","04");
        m.put("May","05");
        m.put("Jun","06");
        m.put("Jul","07");
        m.put("Aug","08");
        m.put("Sep","09");
        m.put("Oct","10");
        m.put("Nov","11");
        m.put("Dec","12");

        String[] parts = date.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(parts[2] + "-");
        sb.append(m.get(parts[1]) + "-");

        String day = "";
        if(parts[0].contains("st")){
            day = parts[0].replace("st","");
        }
        else if(parts[0].contains("nd")){
            day = parts[0].replace("nd","");
        }
        else if(parts[0].contains("rd")){
            day = parts[0].replace("rd","");
        }
        else{
            day = parts[0].replace("th","");
        }


        if(day.length() == 1){
            day = "0" + day;
        }

        sb.append(day);
        return sb.toString();









        // String[] parts = date.split(" ");
        // String day = parts[0];
        // String month = parts[1];
        // String year = parts[2];

        // day = day.substring(0,day.length()-2);
        // if(day.length()<2){
        //     day = "0" + day;
        // }

        // HashMap<String,String> m = new HashMap<>();
        // m.put("Jan","01");
        // m.put("Feb","02");
        // m.put("Mar","03");
        // m.put("Apr","04");
        // m.put("May","05");
        // m.put("Jun","06");
        // m.put("Jul","07");
        // m.put("Aug","08");
        // m.put("Sep","09");
        // m.put("Oct","10");
        // m.put("Nov","11");
        // m.put("Dec","12");

        // month = m.get(month);

        // return year + "-" + month + "-" + day;
    }
}