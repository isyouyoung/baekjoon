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
