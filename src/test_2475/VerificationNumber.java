package test_2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VerificationNumber {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a = bf.readLine();

        StringTokenizer st = new StringTokenizer(a);
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int third = Integer.parseInt(st.nextToken());
        int fourth = Integer.parseInt(st.nextToken());
        int fifth = Integer.parseInt(st.nextToken());
        int verificationNum;

        verificationNum = ((first * first) + (second * second) + (third * third)
                + (fourth * fourth) + (fifth * fifth)) % 10;

        System.out.println(verificationNum);
    }
}