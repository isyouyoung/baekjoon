package test_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class SumUpToN {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int n = parseInt(line);
        int hap = 0;

        for (int i = 1; i <= n; i++) {
            hap = hap + i;
        }
        System.out.println(hap);

//        hap = n * (n + 1 ) / 2;
//        System.out.println(hap);
    }
}

// AI가 추천해준 공식
// 가우스가 발견한 등차수열의 합 공식이라고한다
// ㅋㅋ 이게 된다고?
// ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;