package TwoStackQueue;

import java.util.Stack;

/**
 * @author summer
 * @date 2019-06-03 20:25
 */
public class TwoStackQueue {
    public static void main(String[] args) {
        TwoStackQueue q = new TwoStackQueue();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        q.poll();
        q.poll();
        System.out.println(q.peek());
    }
    Stack<Integer> s1;
    Stack<Integer> s2;
    public TwoStackQueue(){
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    public boolean isEmpty(){
        return s1.isEmpty()&&s2.isEmpty();
    }
    public boolean offer(int x){
        while(!s2.isEmpty())
            s1.push(s2.pop());
        s1.push(x);
        return true;
    }
    public int poll(){
        while(!s1.isEmpty())
            s2.push(s1.pop());
        if(s2.isEmpty())
            throw new RuntimeException("Your stack is empty");
        return s2.pop();
    }
    public int peek(){
        while(!s1.isEmpty())
            s2.push(s1.pop());
        if(s2.isEmpty())
            throw new RuntimeException("Your stack is empty");
        return s2.peek();
    }
}
