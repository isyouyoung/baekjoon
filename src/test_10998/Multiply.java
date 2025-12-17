package test_10998;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiply {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int result;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] numbers = line.split(" ");
        a = Integer.parseInt(numbers[0]);
        b = Integer.parseInt(numbers[1]);
        result = a * b;
        System.out.println(result);

    }
}
