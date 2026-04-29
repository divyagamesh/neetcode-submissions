class Solution {
    public boolean isValid(String s) {
        Stack<Character> bracket = new Stack<>();
        
        Map<Character,Character> mapper = new HashMap<>();
        mapper.put(')','(');
        mapper.put(']','[');
        mapper.put('}','{');
        for(char ch : s.toCharArray()){
            if(mapper.containsKey(ch) && !bracket.isEmpty()){
                Character peekch = bracket.peek();
                if(peekch == mapper.get(ch)){
                    bracket.pop();
                }else{
                    return false;
                }
            }else{
                bracket.add(ch);

            }
        }
        if(bracket.isEmpty()){
            return true;
        }
        return false;
    }
}
