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
            if (line == null || line.isEmpty()) { break; }
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

// 조건이 없어서 while쓴거 좋았고 true로 반복하는대 만약 null (값이 없으면 ) break;
// 좋았고 근대 { break; } 하고 else { } 가 필요없다고 함 처음알았음 그래서 삭제했음
// 그리고 line이 널이여도 되지만 공백만 있는 빈줄이 올수도 있어
// if (line == null || line.isEmpty()) break; 이렇게 보강하기도 한다고!

//UntilEOF 핵심 요약
//문제 핵심: 테스트 케이스 개수가 주어지지 않는 EOF(End Of File) 처리 문제.
//
//제어 구조: 반복 횟수를 알 수 없으므로 for 대신 while(true) 무한 루프 사용.
//
//종료 조건: readLine()이 더 이상 읽을 데이터가 없으면 null을 반환하는 점을 이용해 if (line == null) break;로 안전하게 탈출.
//
//최적화: break는 즉시 루프를 종료하므로 else 생략이 가능하며, 예외 상황 방지를 위해 line.isEmpty() 조건을 추가하면 더 견고한 코드가 됨.
