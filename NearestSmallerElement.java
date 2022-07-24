public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {

        ArrayList<Integer> res = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < A.size(); i++){
            int x = -1;

            while( !stack.isEmpty() && A.get(i) <= stack.peek()){
                stack.pop();
            }

            if(!stack.isEmpty()){
                x = stack.peek();
            }

            res.add(i, x);
            stack.push(A.get(i));
        }

        return res;
    }
}
