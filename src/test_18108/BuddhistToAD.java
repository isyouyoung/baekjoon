package test_18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuddhistToAD {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int y = Integer.parseInt(line);
        System.out.println(y-543);
    }
}

// y가 입력되면 (주어지면)
// 그걸 불기를 서기년도로 바꿔서 출력만하면 되는 간단한 문제같음
// 다만 내가 어떻게 불기를 서기년도로 바꾸는지 모르기 때문에 그것만 물어봐야할듯

// 맞다고함 AI 검증결과
// 태국에서는 불기 연도에서 543을 빼면 서기가 된다고 함
// 그럼 그대로 543을 빼는걸로 제작

// AI 요약
// 핵심 공식: 불기 연도에서 543을 빼면 서기 연도가 된다. ($y - 543$)
// 입력 처리: BufferedReader로 읽은 문자열을 Integer.parseInt()로 정수로 바꾸는 것이 포인트.
// 학습 의도: 기본적인 사칙연산과 자바의 입출력(I/O) 방식을 익히는 입문용 문제.
