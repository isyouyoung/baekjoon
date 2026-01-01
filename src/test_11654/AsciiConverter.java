package test_11654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsciiConverter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        
        char c = line.charAt(0);
        // 첫번째 글짜를 char 타입으로 받기

        System.out.println( (int)c );
        // int로 형변환하여 출력 (이때 아스키 코드가 나옴)
    }
}

// 일단 되니까 제출

/*
 * AI 요약
 * 1. 방식: String 입력 -> char 추출 -> int 형변환.
 * 2. 장점: 다른 문제들과 입출력 형식을 통일할 수 있어 코드 관리가 편함.
 * 3. 핵심: (int) 캐스팅을 통해 문자의 내부 숫자값(ASCII)을 끄집어내는 것.
 */
