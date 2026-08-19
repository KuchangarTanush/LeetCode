class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int ans = 0;
        while (a >= b) {
            long value = b;
            int count = 1;
            while (a >= value + value) {
                value = value + value;
                count = count + count;
            }
            a = a - value;
            ans = ans + count;
        }
        return negative ? -ans : ans;
    }
}