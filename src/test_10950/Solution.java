package test_10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int number = parseInt(bf.readLine());

        for (int i = 0; i < number; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = parseInt(st.nextToken());
            int b = parseInt(st.nextToken());

            System.out.println(a + b);
        }
    }
}

// bf랑 st를 사용하는것은 옳았으나
// bf 는 통로 즉 한번만 뚫어놓으면 계속 사용할수있어서 반복 생성시 효율이 떨어지고
// st 는 매번 입력받은값을 둘로 쪼개줘야하므로 반복문 안에 필수로!! 작성해야함

/*
 * [AI 문제 핵심 요약]
 * 1. 입력 효율성: Scanner보다 빠른 BufferedReader를 사용하여 대량의 입력에 대비함.
 * 2. 통로(bf)와 도구(st)의 분리:
 * - BufferedReader: 입력 스트림(통로)을 여는 작업은 비용이 크므로 반복문 밖에서 '딱 한 번'만 생성하여 재사용함.
 * - StringTokenizer: 매 바퀴(i)마다 '새로 읽어온 줄(readLine)'을 쪼개야 하므로 반복문 안에서 '매번' 생성함.
 * 3. 데이터 흐름: (입력 통로 bf) -> (한 줄 읽기 readLine) -> (쪼개기 도구 st) -> (숫자 변환 parseInt) -> (결과 출력)
 */