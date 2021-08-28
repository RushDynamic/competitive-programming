class fibonacci {
    public static void main(String[] args) {
        System.out.println("Result: " + calculateFib(50));
    }

    private static int calculateFib(int n) {
        if (n <= 2)
            return 1;
        return (calculateFib(n - 1) + calculateFib(n - 2));
    }
}