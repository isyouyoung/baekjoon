package test_10871;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int number = sc.nextInt();
            if (number < X) {
                System.out.print(number + " ");
            }
        }

    }
}
