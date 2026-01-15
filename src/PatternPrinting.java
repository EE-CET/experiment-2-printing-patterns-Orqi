import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // horizontal stars
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // vertical stars
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        sc.close();
    }
}