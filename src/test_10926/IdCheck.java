package test_10926;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdCheck {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String id = bf.readLine();

        System.out.println(id + "??!");
    }
}

// 이렇게 쉬워도 될까요...?
// 기존게 훨씬 어려운거 같은대