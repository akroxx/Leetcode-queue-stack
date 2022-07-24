import java.util.List;

class MyQueue {
    // store elements
    private List<Integer> data;
    // a pointer to indicate queue start
    private int p_start;

    public MyQueue(){
        data = new ArrayList<Integer>();
        p_start = 0;
    }

    // Inserting element into queue
    // Return true if success
    public boolean enQueue(int x){
        data.add(x);
        return true;
    };

    // Deleting element from the queue.
    // Return true if success
    public boolean deQueue(){   //requires no parameters since deQueue is done from front of queue ==> FIFO
        if(isEmpty() == true){
            return false;
        }   //Since queue is empty, nothing to delete
        // Simply increase starting pointer of queue (index of array) by 1, hence not including first element initially in succeeding operations
        p_start++;
        return true;
    }

    // Get front item from queue
    public int Front(){
        return data.get(p_start);
    }

    // Function to check if queue is empty or not
    public boolean isEmpty(){
        return p_start >= data.size();
    }
};
// End of class MyQueue

public class Main{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);

        if(q.isEmpty() == false){
            System.out.println(q.Front());
        }

        q.deQueue();
        if(q.isEmpty() == false){
            System.out.println(q.Front());
        }

        q.deQueue();
        if(q.isEmpty() == false){
            System.out.println(q.Front());
        }
    }
}
