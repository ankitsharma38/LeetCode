class Solution {
    public int numDecodings(String digits) {
        if (digits == null || digits.length() == 0 || digits.charAt(0) == '0') 
            return 0;

        int n = digits.length();
        int prev2 = 1, prev1 = digits.charAt(0) != '0' ? 1 : 0, current = 0;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(digits.substring(i - 1, i));
            int twoDigits = Integer.parseInt(digits.substring(i - 2, i));
            
            current = 0; // Reset current count

            if (oneDigit >= 1) 
                current += prev1;
            
            if (twoDigits >= 10 && twoDigits <= 26) 
                current += prev2;
            
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}