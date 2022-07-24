import java.util.Stack;

public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
        Stack<Integer> stack2 = new Stack<>();

        while(!stack.isEmpty()){
            int temp = stack.pop();
            while( !stack2.isEmpty() && temp > stack2.peek()){
                stack.push(stack2.pop());
            }
            stack2.push(temp);
        }

    //void Function
    }
}