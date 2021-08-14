package Task;

public class task2 {
    public static void main(String[] args) {
        int[][] myArr = {
                {1, 5, 7, 9},
                {2, 22, 52, 66},
                {4, 11, 32, 92}
        };
        for (int[] row : myArr) {
            for (int num : row) {
                if (num % 2 == 0)
                    System.out.println("Even number:" + num);
            }
        }

    }

}
