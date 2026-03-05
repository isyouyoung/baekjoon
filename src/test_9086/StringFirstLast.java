package test_9086;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFirstLast {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i=0; i < a; i++) {
            String word = br.readLine();
            System.out.print(word.charAt(0));
            int length = word.length();
            System.out.print(word.charAt(length-1));
        }
    }
}

// 먼저 테스트 개수 받기
// 그 수를 변수 a 로 만들어서 반복문 돌리면 될듯
// 그담 문자열 저장한다음에 맨 앞 맨 뒤 글자를 출력

/*
 * [문제: 문자열의 첫 글자와 마지막 글자 출력하기]
 * * 1. 입력 효율화: BufferedReader를 사용하여 많은 양의 데이터를 빠르게 읽어옴.
 * 2. 타입 변환: br.readLine()으로 읽은 문자열 "3"을 Integer.parseInt()로 숫자 3으로 변환.
 * 3. 반복 처리: 입력받은 테스트 케이스 개수(a)만큼 for문을 돌려 각 문자열을 처리.
 * 4. 인덱스 규칙:
 * - 첫 번째 글자: word.charAt(0) -> 자바의 시작 번호는 항상 0부터.
 * - 마지막 글자: word.charAt(word.length() - 1) -> 전체 길이에서 1을 빼야 마지막 방 번호가 됨.
 * 5. 출력 주의: System.out.print()로 붙여 출력하고, 마지막에 줄바꿈으로 케이스 구분.
 */