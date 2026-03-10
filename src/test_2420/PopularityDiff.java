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
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d =  Math.abs(b - c);
        System.out.println(d);
    }
}