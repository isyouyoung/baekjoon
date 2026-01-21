package test_25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingIsPhysical {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a = Integer.parseInt(line);
        int b = 4;
        int c = a / b;

        for (int i=0; i < c; i++) {
            System.out.print("long ");
        }
        System.out.print("int");


    }
}
