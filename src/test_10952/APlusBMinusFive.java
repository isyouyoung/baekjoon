package test_10952;

import java.util.Scanner;

public class APlusBMinusFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A  = sc.nextInt();
            int B  = sc.nextInt();

            if (A == 0 && B == 0) break;

            int result = A + B;
            System.out.println(result);
        }

    }
}

// 풀어준것 내가 직접푼것 x