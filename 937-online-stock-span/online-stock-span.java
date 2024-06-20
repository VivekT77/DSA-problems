class StockSpanner {
        List<Integer> list;
    public StockSpanner() {
         list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price); //added all the price in the list
        int span=0;
        for(int i=list.size()-1;i>=0;i--){ //started comparing from the back
            if(list.get(i)<=price){
                span++;
            }
            else{
                break;
        }
      }
          return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */