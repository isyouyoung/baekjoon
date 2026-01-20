package test_2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumAB2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();

        int A = Integer.parseInt(line1);
        int B = Integer.parseInt(line2);

        System.out.println(A + B);

    }
}

//         String line1 = br.readLine();
//        String line2 = br.readLine(); 이렇게 붙여써도 전혀 상관없음 입력받은 첫번째 줄은 line1이 되는거고 두번째 줄은 line2가 되는것뿐

// System.out.println(Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine())); 고수들은 이렇게도 한다고함 한번에 출력

/*
 * [백준 2558번: A+B - 2 핵심 로직]
 * 1. br.readLine()은 호출될 때마다 한 줄씩 아래로 내려가며 데이터를 읽어온다.
 * 2. 따라서 두 줄을 각각 더하려면 readLine()을 두 번 실행하여 각각의 변수에 담아야 한다.
 * 3. 읽어온 값은 String이므로 연산을 위해 반드시 Integer.parseInt() 처리가 필요하다.
 */
