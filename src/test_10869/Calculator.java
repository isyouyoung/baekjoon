package test_10869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        plus(a,b);
        minus(a,b);
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );
    }

    public static void plus(int a, int b) {
        System.out.println( a + b );
    }

    public static void minus(int a, int b) {
        System.out.println( a - b );
    }

}
