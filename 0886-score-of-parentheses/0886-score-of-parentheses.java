class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int score = 0; 
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(0);
            }else{
                int value = stack.pop();
                score = Math.max(2*value,1);
                stack.push(score + stack.pop());
            }
        }
        return stack.pop();
    }
}