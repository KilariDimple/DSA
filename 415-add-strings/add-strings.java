class Solution {
    public String addStrings(String num1, String num2) {

        int l = num1.length() - 1;
        int r = num2.length() - 1;

        int carry = 0;
        String res = "";

        while (l >= 0 || r >= 0 || carry > 0) {

            int d1 = 0;
            int d2 = 0;

            if (l >= 0) {
                d1 = num1.charAt(l) - '0';
            }

            if (r >= 0) {
                d2 = num2.charAt(r) - '0';
            }

            int total = d1 + d2 + carry;

            int digit = total % 10;
            carry = total / 10;

            res = digit + res;   // add digit at front

            l--;
            r--;
        }

        return res;
    }
}
