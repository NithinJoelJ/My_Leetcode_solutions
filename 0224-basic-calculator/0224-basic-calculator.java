class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int total = 0;
        int num = 0;
        int sign = 1; //->positive
        
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                num = num *10+(s.charAt(i) -'0');
            }else if(s.charAt(i)=='+'){
                total += sign * num;
                num=0;
                sign = 1;
            }
            else if(s.charAt(i)=='-'){
                total += sign * num;
                num=0;
                sign=-1;
            }else if(s.charAt(i)=='('){
                stack.push(total);
                stack.push(sign);
                total=0;
                sign=1;
            }else if(s.charAt(i)==')'){
                total += sign*num;
                num=0;
                total *= stack.pop();
                total += stack.pop();
            }

        }
        total += sign * num;

        return total;
    }
}