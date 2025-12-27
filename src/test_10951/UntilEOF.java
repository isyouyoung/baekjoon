package test_10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UntilEOF {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = bf.readLine();
            if (line == null) { break; }
                StringTokenizer st = new StringTokenizer(line);
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                System.out.println(A+B);
        }

    }
}

// 이번에도 더하는 문제인대 문제는 끝?이 안보인다
// 즉 몇개가 들어올지 알수가 없다 이게 핵심인듯
// 그럼 for 문보다는 while문 => 조건을 모르므로 사용하면될듯하다
// 아무것도 안들어오면 (null)이면 종료 이런식으로?
