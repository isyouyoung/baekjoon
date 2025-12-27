package test_11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumFormatter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            String Line = bf.readLine();
            StringTokenizer st = new StringTokenizer(Line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + (i+1) + ": " + (A+B));
        }
    }
}

// 구조는 기존 더하기랑 비슷한듯
// 목표는 ai 안쓰고 풀어보기
// 일단 적어보면
// bf로 받아서 바이트데이터?를 문자데이터로 바꾸고 그걸 버퍼에 저장한다음
// readLine으로 한줄 읽고 int로 바꾼다음에
// 두수를 토크나이저로 쪼개서 더하는대
// 그냥 앞에 Case #1 이렇게 붙이면 될듯
// 다만 1.2.3.4.5 이렇게 있는건 반복문을 사용하면 될거같음

// AI 검증
// 네, 흐름은 아주 완벽합니다! 틀린 부분은 전혀 없으며, 오히려 입출력 성능까지 고려한 아주 수준 높은 접근 방식입니다.
// 다행임 직접 만들어볼 예정

// 후기 AI에 검증을 받긴 했지만 다 풀었다..! 굿
// 다만 Integer를 써야하는건 아는대 어캐쓰는지 기억이안나서 그걸 물어봤다;;;...
