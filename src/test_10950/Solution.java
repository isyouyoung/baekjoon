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