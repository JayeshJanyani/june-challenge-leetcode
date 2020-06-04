import java.util.Arrays;

public class June03 {
    public static void main(String args[]) {
        int a[][] = new int[][] { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
        int ret = twoCitySchedCost(a);
        System.out.println(ret);
    }

    public static int twoCitySchedCost(int[][] costs) {
        int sum = 0;
        Arrays.sort(costs, (a, b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]));
        int countA = 0;
        int countB = 0;
        int n = costs.length;
        for (int i = 0; i < n; i++) {
            if (costs[i][0] < costs[i][1]) {
                if (countA != n / 2) {
                    countA++;
                    sum += costs[i][0];
                } else {
                    countB++;
                    sum += costs[i][1];
                }
            } else {
                if (countB != n / 2) {
                    countB++;
                    sum += costs[i][1];
                } else {
                    countA++;
                    sum += costs[i][0];
                }
            }

            System.out.println(costs[i][0] + "-" + costs[i][1]);
        }

        return sum;
    }
}
