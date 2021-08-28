import java.util.HashMap;
import java.util.Map;

class GridTraversal {
    public static void main(String[] args) {
        Map<String, Double> resultSet = new HashMap<String, Double>();
        System.out.println("Result: " + traverse(18, 18, resultSet));
    }

    private static Double traverse(int rows, int cols, Map<String, Double> resultSet) {
        if (rows == 0 || cols == 0)
            return Double.valueOf(0);
        if (rows == 1 && cols == 1)
            return Double.valueOf(1);
        if (resultSet.containsKey(rows + "," + cols)) {
            // System.out.println("Already memoized");
            return resultSet.get(rows + "," + cols);
        }
        // System.out.println("Not memoized");
        resultSet.put(rows + "," + cols, traverse(rows - 1, cols, resultSet) + traverse(rows, cols - 1, resultSet));
        return resultSet.get(rows + "," + cols);
    }
}