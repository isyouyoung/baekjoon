package test_2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckLeapYear {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // br이 while 밖에 있는 이유는 객체를 만드는것이므로 계속 만들 필요없이 한번만 만들면 되기 떄문임

        while (true) {
            try {
                System.out.println("연도를 입력하세요 (숫자만): ");
                String input = br.readLine();
                int year = Integer.parseInt(input);

                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("결과: 1 (윤년입니다)");
                } else {
                    System.out.println("결과: 0 (윤년이 아닙니다)");
                }

                break;

            } catch (NumberFormatException e) {
                System.out.println("에러: '" + e.getMessage() + "'는 숫자가 아닙니다. 다시 입력해주세요.");
                System.out.println();
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}

// 윤년 구하는 문제
//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//
//예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
//
//입력
//첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//출력
//첫째 줄에 윤년이면 1, 아니면 0을 출력한다.

//일단 입력을 받기위해 버퍼 br 만들었고
// readLine으로 받았음 문제는 무조건 String 타입이기 때문에 그것을 int로 바꾸려고 했음
// int로 바로 바꿀꺼기 때문에 처음에 br.readLine은 input으로 임시로 받았고 바로 input을 
// parseInt로 int타입으로 바꿔주었음 입력을 숫자로 받을꺼기 때문에
// 그리고 조건문과 and 문 or 문 사용하여 문제를 풀었음

// AI 핵심 요약
// BufferedReader: 입력을 모았다가 한꺼번에 전달해서 속도가 빠름
// Integer.parseInt: "2024" 문자열을 산술 연산이 가능한 2024 숫자로 변환
// try-catch: 예외(Error)가 발생해도 프로그램이 튕기지 않게 방어함