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

// 이것도 같이 푼건대
// N과 X 가 처음에 주어질때 N개만큼 숫자가 주어짐
// 그렇기 때문에 N반큼 반복문을 돌리는것 그리고
// X보다 작으면 출력이기 때문에 반복문안에 IF문으로 쓴것
// 근대 오른쪽으로 출력되때문에 number + " " 이것도 포인트!
