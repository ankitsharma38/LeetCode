import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        q2.add(x);  // Push to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());  // Move all elements from q1 to q2
        }
        // Swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }
    
    public int pop() {
        return q1.remove();  // Always remove from q1
    }
    
    public int top() {
        return q1.peek();  // Peek at the front of q1
    }
    
    public boolean empty() {
        return q1.isEmpty();  // Check if q1 is empty
    }
}
