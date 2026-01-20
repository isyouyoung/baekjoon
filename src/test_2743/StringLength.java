package test_2743;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line.length());
    }
}

/*
 * [백준 2743번: 단어 길이 재기 요약]
 * 1. 핵심: 입력받은 문자열의 길이를 계산하여 출력하기.
 * 2. 메서드: String 클래스의 .length() 메서드를 활용.
 * 3. 주의: 배열의 길이는 array.length(괄호 없음)이지만, 문자열의 길이는 string.length()(괄호 있음)임.
 * 4. 제출: 클래스명은 Main, 패키지 선언 삭제 필수.
 */

// 추가 공부한것
/*
 * [readLine()에 괄호가 붙는 이유]
 * 1. readLine은 단순한 '값'이 아니라, 입력을 읽어오는 '동작(메서드)'이다.
 * 2. 자바에서 메서드를 호출(실행)할 때는 반드시 이름 뒤에 ()를 붙여야 한다.
 * 3. 괄호가 없으면 자바는 이를 '변수'로 착각하여 컴파일 에러를 발생시킨다.
 */

