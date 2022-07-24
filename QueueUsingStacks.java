class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        reverse(s1, s2);
        int toRet = s2.pop();
        reverse(s2, s1);
        return toRet;
    }
    
    public int peek() {
        reverse(s1, s2);
        int toRet = s2.peek();
        reverse(s2, s1);
        return toRet;
    }
    
    public boolean empty() {
        return s1.size() != 0 ? false : true;
    }

    public void reverse(Stack<Integer> s1, Stack<Integer> s2){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */