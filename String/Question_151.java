class Solution {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left++;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right--;
        }
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);
            if (c != ' ') {
                sb.append(c);
            } else if (c == ' ' && sb.length() != 0) {
                deque.offerFirst(sb.toString());
                sb.setLength(0);
            }
            left++;
        }
        deque.offerFirst(sb.toString());
        return String.join(" ", deque);
    }
}
