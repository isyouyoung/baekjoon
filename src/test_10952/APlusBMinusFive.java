package test_10952;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class APlusBMinusFive {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = bf.readLine();

        StringTokenizer st =  new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        String readLine = bf.readLine();
        StringTokenizer number =  new StringTokenizer(readLine);

        for (int i = 0; i < N; i++) {
            int c = Integer.parseInt(number.nextToken());
            if ( c < X ) {
                System.out.print(c + " ");
            }
        }
    }
}
