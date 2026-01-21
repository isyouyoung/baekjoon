package test_27866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIndex {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 키보드로 받은 데이터를 문자열로 바꿔서 버퍼 안에 넣음
        String line1 = br.readLine();
        // 한줄을 읽고 line1로 저장
        String line2 = br.readLine();
        // 그 다음 한줄을 일고 line2로 저장
        int i = Integer.parseInt(line2);
        // 라인2에서 들어온 단어(숫자)를 실제 숫자로 바꿈
        char s = line1.charAt(i - 1);
        // 0부터 시작이므로 (charAT) i-1로 그 자리의 숫자를 추출

        System.out.println(s);
        // 출력

    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        // 1. 입력을 위한 바구니(br) 준비
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 2. 첫 번째 줄(단어) 읽어서 저장
//        String line1 = br.readLine();
//
//        // 3. 두 번째 줄(숫자) 읽어서 숫자로 변환
//        // line2라는 변수를 거치지 않고 바로 변환해도 무방합니다!
//        int i = Integer.parseInt(br.readLine());
//
//        // 4. charAt을 사용하여 i-1번째 문자 추출
//        // 컴퓨터는 0부터 세기 때문에 '사람의 순서 - 1'을 해주는 것이 핵심!
//        char s = line1.charAt(i - 1);
//
//        // 5. 결과 출력
//        System.out.println(s);
//    }
//}