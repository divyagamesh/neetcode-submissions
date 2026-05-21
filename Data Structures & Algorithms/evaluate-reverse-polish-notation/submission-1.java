class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        List<String> operators = Arrays.asList("+","-","*","/");
        int result = 0;
        for(String token : tokens){
            if(!operators.contains(token)){
                stack.push(Integer.valueOf(token));
            }else{
                int right = stack.pop();
                int left = stack.pop();
                if(token.equals("+")){
                    stack.push(left+right);
                } else if(token.equals("-")){
                    stack.push(left - right);
                } else if(token.equals("*")){
                    stack.push(left * right);
                }else if(token.equals("/")){
                    stack.push(left / right);
                }
            }
        }
        return stack.peek();
    }
}
