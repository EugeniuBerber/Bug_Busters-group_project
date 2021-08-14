package Task;

public class task6 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;
        int fNext;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        for (int i = 1; i <= 8; i++) {
            fNext = f1 + f2;
            System.out.print(fNext + " ");
            f1 = f2;
            f2 = fNext;
        }

    }
}
