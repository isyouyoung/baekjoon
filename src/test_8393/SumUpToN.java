package test_8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class SumUpToN {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int n = parseInt(line);
        int hap = 0;

        for (int i = 1; i <= n; i++) {
            hap = hap + i;
        }
        System.out.println(hap);
    }
}