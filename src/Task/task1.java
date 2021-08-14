package Task;

public class task1 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] myArr = {
                {1, 4, 5},
                {3, 67, 7},
                {23, 43, 53}

        };

        for (int[] row : myArr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}