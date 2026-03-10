package test_2420;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PopularityDiff {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();

        StringTokenizer st = new StringTokenizer(a);
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long d = Math.abs(b - c);
        System.out.println(d);

        // Math.abs 는
        // 절대값을 구하는 도구이다

//        혹은 if문으로
//          if (diff < 0) {
//        diff = -diff;
//        }
//        System.out.println(diff);

    }
}