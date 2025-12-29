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

// * [백준 11022번 요약]
// * 1. 핵심: 테스트 케이스 T만큼 "Case #x: A + B = C" 형식으로 합계 출력.
// * 2. 입력: BufferedReader로 한 줄씩 읽고, StringTokenizer로 A와 B를 분리.
// * 3. 주의: 출력 시 'Case #', ':', '+', '=' 앞뒤의 공백을 예제와 똑같이 맞춰야 함.
// * 4. 특징: void 메서드는 sout 안에 넣을 수 없으며, static(main)에서 인스턴스 메서드 호출 시 객체 생성 필수.
// * 5. 제출: 클래스명은 'Main'으로 변경, 'package' 선언은 반드시 삭제.