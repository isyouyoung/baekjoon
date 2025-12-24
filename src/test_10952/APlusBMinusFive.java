package test_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APlusBMinusFive {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) break;
            System.out.println(A + B);
        }
    }
}

// 내가 실수한것 => readLine을 while(반복문) 밖에 둬서
// 무한으로 2만 출력되었었음
// 한줄씩 계속 읽어서 나눠서 계산하기 위해선 반드시 한줄씩
// 계속 읽어야하므로 반복문 안에 있어야함!!

// AI 요약
// br.readLine()은 반드시 반복문 안에 넣어야 매번 다음 줄(새로운 숫자들)을 읽어올 수 있습니다.
//
//StringTokenizer 객체도 루프 안에서 매번 새로 생성해야 새 줄을 숫자로 쪼갤 수 있습니다.
//
//탈출 조건(if)은 출력문(println)보다 먼저 나와야 마지막 입력값(0 0)이 결과에 포함되지 않습니다.
//
//BufferedReader와 StringTokenizer 조합은 자바에서 가장 빠르고 효율적인 입력 방식이므로 한 세트로 외우는 것이 좋습니다.