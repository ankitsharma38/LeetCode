class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
