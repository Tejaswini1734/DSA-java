class Solution {
    public double myPow(double x, int n) {
        return binaryExpo(x, (long) n);

    }

    private double binaryExpo(double x, long n) {
        if (n == 0) {
            return 1;

        }
        if (n < 0) {
            return 1.0 / binaryExpo(x, -n);
        }
        if (n % 2 == 1) {
            return x * binaryExpo(x * x, (n - 1) / 2);
        } else {
            return binaryExpo(x * x, n / 2);
        }
    }
}
