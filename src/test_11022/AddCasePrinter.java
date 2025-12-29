package test_11022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AddCasePrinter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int T = Integer.parseInt(line);

        for (int i = 0; i < T; i++) {
            String a = bf.readLine();
            StringTokenizer st = new StringTokenizer(a);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A+B));
        }

    }
}

// 두정수 입력받는건 쉬운대
// 처음에 테스트 케이스의 개수 T가 주어지므로
// 맨 처음 받는 T만큼 반복문 돌려서
// 그다음 받는 두 수를 토크나이저로 나눈후 더하기 해야할듯
