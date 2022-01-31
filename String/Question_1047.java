class Solution {
    public String removeDuplicates(String s) {
        char[] ca = s.toCharArray();
        int top = -1;
        for (int i = 0; i < ca.length; i++) {
            if (top < 0 || ca[top] != ca[i]) {
                ca[++top] = ca[i];
            } else {
                top--;
            }
        }
        return String.valueOf(ca, 0, top + 1);
    }
}
