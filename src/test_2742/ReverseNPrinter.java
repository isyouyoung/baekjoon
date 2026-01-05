package test_2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNPrinter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int N = Integer.parseInt(line);

        for (int i=N; i >= 1; i--) {
            System.out.println(i);
        }

    }
}

// 2741번 문제의 변형문제임
// 반대로 입력값부터 줄어들어서 1까지 출력되야하므로
// 입력값 N 을 i 로 두고 1이 될때까지 1씩 빼면서 반복출력
