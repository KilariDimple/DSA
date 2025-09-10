class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1
                return digits; // no carry needed
            }
            digits[i] = 0; // digit was 9, becomes 0, carry continues
        }
        
        // If we reach here, all digits were 9 (e.g., 999 → 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1; // first digit is 1, rest are 0
        return result;
    }
}
