package reverseStack;

import java.util.Stack;

/**
 * @author summer
 * @date 2019-06-03 20:54
 */
public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.peek());
        reverse(s);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
    public static int getAndRemoveLast(Stack<Integer> stack){
        int result = stack.pop();
        if(stack.isEmpty())
            return result;
        else{
            int last = getAndRemoveLast(stack);
            stack.push(result);
            return last;
        }
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int i = getAndRemoveLast(stack);
        reverse(stack);
        stack.push(i);
    }
}
