package test_1001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Minus {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int result;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String line = br.readLine();
//        String[] words = line.split(" ");
//        a = Integer.parseInt(words[0]);
//        b = Integer.parseInt(words[1]);
//        result = a - b;
//        System.out.println(result);

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        result = a - b;
        System.out.println(result);
    }
}
