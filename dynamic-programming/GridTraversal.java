class GridTraversal {
    public static void main(String[] args) {
        System.out.println("Result: " + traverse(18, 18));
    }

    private static int traverse(int rows, int cols) {
        if (rows == 0 || cols == 0)
            return 0;
        if (rows == 1 && cols == 1)
            return 1;
        return (traverse(rows - 1, cols) + traverse(rows, cols - 1));
    }
}