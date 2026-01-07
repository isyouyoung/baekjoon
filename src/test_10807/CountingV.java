package test_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingV {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int[] B = new int[N];
        String numbersLine = br.readLine();
        StringTokenizer st = new StringTokenizer(numbersLine);

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        String foundNumberLine = br.readLine();
        int foundNumber = Integer.parseInt(foundNumberLine);

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (B[i] == foundNumber) {
                count ++;
            }
        }

        System.out.println(count);
    }
}

// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

// 일단 정수의 개수가 주어지니까 N을 리드라인으로 받고
// 그 받은 수만큼 랜덤 숫자?를 생성해야할거같은대 조건이없다;;..
// 아마 3번째니까 스트링토크나이저로 A B C 라고한다면 C랑 같으면 이렇게 세야할거같은대
// 근대 사실 이것보단 배열을 만들어야?할거 같다는 생각이듬 배열의 3번째랑 같은거 찾기
// 확인해봐야할듯

// AI 확인결과 우리가 숫자를 만드는것이 아니고 채점 서버가 주는 숫자를 읽어야하는 뜻이라
// 랜덤은 필요없다고함 그리고 토큰으로 A B C로하기엔 11개나 되기에 숫자가 너무 많다고 ㅇㅋ
// 대신 배열만드는것은 맞고 리드라인과 스트링 토크나이저 맞다고함 한번 해보자

/*
 * [백준 10807번: 개수 세기 - 3줄 요약]
 * 1. 데이터 저장: N개의 정수를 담기 위해 'int[] B = new int[N]' 배열을 생성하여 보관한다.
 * 2. 문자열 분리: StringTokenizer와 st.nextToken()을 사용해 공백으로 구분된 숫자들을 하나씩 꺼낸다.
 * 3. 일치 검사: 두 번째 for문을 통해 배열 속 숫자와 찾을 숫자 v가 같은지(==) 비교하여 카운트한다.
 */

/*
 * [핵심 키워드 메모]
 * - BufferedReader: 빠른 입력을 위해 사용 (readLine())
 * - StringTokenizer: 공백 기준 문자열 분리 (nextToken())
 * - Integer.parseInt(): 문자열을 비교 가능한 정수형(int)으로 변환
 * - for-loop: 배열에 값을 채울 때 한 번, 값을 찾을 때 한 번 총 두 번 사용
 */