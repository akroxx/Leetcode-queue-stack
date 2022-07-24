class Solution {
    public boolean isValid(String s) {
        Stack<Character> ip = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                ip.push(c);
            }
            else if(c == ']' && !ip.isEmpty() && ip.peek() == '['){
                ip.pop();
            }
            else if(c == '}' && !ip.isEmpty() && ip.peek() == '{'){
                ip.pop();
            }
            else if(c == ')' && !ip.isEmpty() && ip.peek() == '('){
                ip.pop();
            }
            else{
                return false;
            }
        }

        return (ip.empty());
    }
}