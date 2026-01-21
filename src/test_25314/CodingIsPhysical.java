package test_25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingIsPhysical {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);
        int b = 4;
        int c = a / b;

        for (int i=0; i < c; i++) {
            System.out.print("long ");
        }
        System.out.print("int");


    }
}

/*
 * [백준 25314번: 코딩은 체육과목입니다 - 핵심 정리]
 * 1. 문제 분석: 4바이트마다 'long'이라는 단어가 추가되는 규칙 발견.
 * 2. 로직 설계: 입력받은 N을 4로 나누어 반복 횟수(c)를 구함.
 * 3. 반복 출력: for문을 이용해 "long "을 c번 출력하고, 반복문 종료 후 "int"를 붙여 마무리.
 * 4. 주의 사항: println이 아닌 print를 사용해야 단어들이 한 줄에 이어서 출력됨.
 */
