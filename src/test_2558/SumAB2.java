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
