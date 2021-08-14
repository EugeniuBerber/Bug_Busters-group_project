package Task;

public class task7 {
    public static void main(String[] args) {
        int[] array = {-10, -5, -200, -500};
        int largest = array[0];
        int least = array[1];
        for (int num = 0; num < array.length; num++) {
            if (array[num] > largest) {
                largest = array[num];
            } else if (array[num] < least)
                least = array[num];

        }
        System.out.println("Largest number is :" + largest);
        System.out.println("Least number is :" + least);
    }
}
