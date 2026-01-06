package test_11382;
// 꼬마 정민

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BigSum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;

        while (st.hasMoreTokens()) {
            result += Long.parseLong(st.nextToken());
        }

        System.out.println(result);
    }
}