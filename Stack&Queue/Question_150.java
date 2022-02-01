class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String tmp = tokens[i];
            if (isNumber(tmp)) {
                stack.push(Integer.parseInt(tmp));
            } else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (tmp) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String s) {
        return !(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
    }
}
