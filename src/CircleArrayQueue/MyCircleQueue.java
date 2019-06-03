package CircleArrayQueue;

/**
 * @author summer
 * @date 2019-06-03 19:50
 */
public class MyCircleQueue {
    public static void main(String[] args) {
        MyCircleQueue q = new MyCircleQueue(4);
        q.enQueue(4);
        System.out.println(q.front());
        q.enQueue(4);
        System.out.println(q.rear());
        q.enQueue(3);
        System.out.println(q.rear());
        q.enQueue(1);
        System.out.println(q.rear());
        q.deQueue();
        q.deQueue();
        System.out.println(q.rear());
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
    }
    private int[] data;
    private int head;
    private int tail;
    private int size;
    public MyCircleQueue(int k){
        data = new int[k];
        head = -1;
        tail = -1;
        size = k;
    }
    public boolean enQueue(int x){
        if(isFull())
            return false;
        if(isEmpty())
            head = 0;
        tail = (tail+1)%size;
        data[tail] = x;
        return true;
    }
    public boolean deQueue(){
        if(isEmpty())
            throw new RuntimeException("Your stack is empty");
        if(head == tail){
            head = -1;
            tail = -1;
            return true;
        }
        head = (head+1)%size;
        return true;
    }
    public int front(){
        if(isEmpty())
            throw new RuntimeException("Your stack is empty");
        return data[head];
    }
    public int rear(){
        if(isEmpty())
            throw new RuntimeException("Your stack is empty");
        return data[tail];
    }
    public boolean isEmpty(){
        return head == -1;
    }
    public boolean isFull(){
        return (tail+1)%size==head;
    }
}
