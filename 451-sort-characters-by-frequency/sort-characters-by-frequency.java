class Solution {
    public String frequencySort(String s) {

    HashMap<Character,Integer> m = new HashMap<>();     //to store the key and its frequency in map
    char [] str = s.toCharArray();          //convert string to char array to maintain the count
    for(char ch : str){ 
        m.put(ch,m.getOrDefault(ch,0) + 1);     //if the key is present then update otherwise put new  
    }

    StringBuilder sb = new StringBuilder();         //to return the string
    while(!m.isEmpty()){            //while the map is empty make set to iterate over the map and iterate 
        int count = 0;              //over each entry in the hashset 
        char max_char = 'a';

        Set<Map.Entry<Character,Integer>> set = m.entrySet();      
        for(Map.Entry<Character,Integer> e : set){
            if(e.getValue() > count){       // if the key value is greater then the previous update the 
                count = e.getValue();       //count and its value
                max_char = e.getKey();          
            }
        }

        for(int i=0;i<count;i++){           //append the chars in the string builder and remove the 
            sb.append(max_char);            //particular entry from the map and return the string
        }
        m.remove(max_char);
    }
    return sb.toString();
    }
}