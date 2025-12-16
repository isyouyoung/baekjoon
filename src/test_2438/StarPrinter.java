package test_2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPrinter {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int N = Integer.parseInt(line);
        String star = "*";

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }
}