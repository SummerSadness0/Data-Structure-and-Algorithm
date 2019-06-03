package getMin;

import java.util.Stack;

/**
 * @author summer
 * @date 2019-06-03 20:13
 */
public class getMin {
    public static void main(String[] args) {
        getMin s = new getMin();
        s.push(5);
        s.push(2);
        s.push(7);
        s.push(5);
        System.out.println(s.getmin());
    }
    private Stack<Integer> data;
    private Stack<Integer> min;
    public getMin(){
        data = new Stack<>();
        min = new Stack<>();
    }
    public void push(int x){
        data.push(x);
        if(min.isEmpty())
            min.push(x);
        else{
            if(x < min.peek())
                min.push(x);
            else
                min.push(min.peek());
        }
    }
    public void pop(){
        if(data.isEmpty())
            throw new RuntimeException("Your stack is Empty");
        data.pop();
        min.pop();
    }
    public int getmin(){
        if(data.isEmpty())
            throw new RuntimeException("Your stack is Empty");
        return min.peek();
    }
}
