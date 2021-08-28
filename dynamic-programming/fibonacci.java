import java.util.HashMap;
import java.util.Map;

class fibonacci {
    public static void main(String[] args) {
        Map<Integer, Double> resultMap = new HashMap<Integer, Double>();
        System.out.println("Result: " + calculateFib(50, resultMap));
    }

    private static Double calculateFib(int n, Map<Integer, Double> resultMap) {
        if (n <= 2)
            return 1.0;
        if (resultMap.containsKey(n))
            return resultMap.get(n);
        else
            resultMap.put(n, calculateFib(n - 1, resultMap) + calculateFib(n - 2, resultMap));
        // return (calculateFib(n - 1, resultMap) + calculateFib(n - 2, resultMap));
        return resultMap.get(n);
    }
}