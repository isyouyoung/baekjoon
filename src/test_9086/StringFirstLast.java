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
