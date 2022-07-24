class MyCircularQueue {

    private int[] queue;    //Array to handle queue
    private int headIndex;  //Current head index for circular queue
    private int count;      //Current length of circular queue
    private int capacity;   //Maximum number of possible elements space in queue

    // Initialise queue here. Set size of queue ==> k
    public MyCircularQueue(int k) {
        this.capacity = k;
        this.queue = new int[k];
        this.headIndex = 0;
        this.count = 0;
    }
    
    // Insert element into circular queue.
    // Return true if operation is success
    public boolean enQueue(int value) {
        if (this.count == this.capacity)    //Queue is full!
            return false;
        this.queue[(this.headIndex + this.count) % this.capacity] = value;
        this.count+=1;
        return true;
    }
    
    // Delete element from circular queue.
    // Return true if success
    public boolean deQueue() {
        if(this.count == 0)     //Queue has no items
            return false;
        this.headIndex = (this.headIndex + 1) % this.capacity;
        this.count-=1;
        return true;
    }
    
    // Get front item from queue
    public int Front() {
        if (this.count == 0)    //Queue has no items
            return -1;
        return this.queue[this.headIndex];
    }
    
    // Get last item from queue
    public int Rear() {
        if (this.count == 0)    //Queue has no items
            return -1;
        int tailIndex = (this.headIndex + this.count -1) % this.capacity;
        return this.queue[tailIndex];
    }
    
    // Checks if circular queue is empty
    public boolean isEmpty() {
        return (this.count == 0);
    }
    
    // Checks if circular queue if at full capacity or not
    public boolean isFull() {
        return (this.count == this.capacity);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */