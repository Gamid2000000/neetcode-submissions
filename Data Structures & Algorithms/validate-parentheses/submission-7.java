class Solution {
    public boolean isValid(String s)  {
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.add(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if(stack.isEmpty()){
                        return false;
                    }
                    char lost = stack.pop();
                    if(!isLost(lost, c)){
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        public boolean isLost(char open, char close){
            return (open == '(' && close == ')') 
                    || (open == '{' && close == '}') 
                    || (open == '[' && close == ']');
        }
    }
