package test_2742;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNPrinter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int N = Integer.parseInt(line);

        for (int i=N; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
