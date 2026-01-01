package test_2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NPrinter {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();
        int N = Integer.parseInt(line);

        for (int i = 0; i < N; i++) {
            System.out.println(i+1);
        }
    }
    
}

// 별찍기 문제 생성
// 이리하면 되나? 일단 제출해보자

// 생각보다 어렵지 않았음 그냥 N이 주어졌고 (조건)
// 그 N만큼 1부터 더하는거니까 i = 0 으로 두었기 때문에
// 1부터 시작해야하니 i + 1 로 하였음 잘됨