package test_1000;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        int a;
        int b;
        int result;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        result = a + b;

        System.out.println(result);

    }
}