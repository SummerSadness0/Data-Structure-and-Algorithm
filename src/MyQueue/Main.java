package MyQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * @author summer
 * @date 2019-06-02 20:55
 */
class MyQueue {
    private List<Integer> data;
    private  int p_start;
    public MyQueue(){
        data = new ArrayList<Integer>();
        p_start=0;
    }
    public boolean enQueue(int x){
        data.add(x);
        return true;
    }

    public boolean deQueue(){
        if(isEmpty())
            return false;
        p_start++;
        return true;
    }
    public int front(){
        if(isEmpty())
            return -1;
        return data.get(p_start);
    }
    public boolean isEmpty(){
        return p_start>=data.size();
    }
}
public class Main{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        System.out.println(q.front());
        q.deQueue();
        System.out.println(q.front());
        q.deQueue();
        System.out.println(q.front());
        System.out.println(q.isEmpty());
    }
}
