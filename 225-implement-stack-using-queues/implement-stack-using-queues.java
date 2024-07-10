import java.util.*;

class MyStack {
    
    Queue<Integer> q1= new LinkedList<>();
    Queue<Integer> q2= new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){     //which ever queue is empty simply add in it
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int top=-1;

        if(!q1.isEmpty()){    //till q1 gets empty remove the elements and add in q2 and return the top
            while(!q1.isEmpty()){       //eg:1,2,3 and here top=3 
                top = q1.remove();
                if(q1.isEmpty()){   //if gets empty break the loop
                    break;
                }
                q2.add(top);
            }
        }else{          //till q2 gets empty remove the elements and add in q1 and return the top
            while(!q2.isEmpty()){      //eg:1,2 and here top=2
                top=q2.remove();        //so queue will return 3,2,1 like stack 
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }
    
    public int top() {       //same operation like pop function
        if(empty()){
            return -1;
        }
        int top=-1;

        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top = q1.remove();
                q2.add(top);
            }
        }else{
            while(!q2.isEmpty()){
                top=q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */