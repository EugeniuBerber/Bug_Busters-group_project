package Task;

public class task3 {
    public static void main(String[] args) {
        int oddSum = 0, evenSum = 0;
        int[][] myArr = {
                {1, 5, 7, 9},
                {2, 22, 52, 66},
                {4, 11, 32, 92}
        };
        for (int[] row : myArr) {
            for (int num : row) {
                if (num % 2 == 0)
                    evenSum += num;
                else if (num % 2 != 0)
                    oddSum += num;
            }
        }
        System.out.println("Sum of Odd numbers:" + oddSum);
        System.out.println("Sum of Odd numbers:" + evenSum);


    }
}
