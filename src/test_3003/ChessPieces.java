package test_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChessPieces {
    public static void main(String[] args) throws IOException {

        int[] origin = {1, 1, 2, 2, 2, 8};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        System.out.print((origin[0] - king) + " ");
        System.out.print((origin[1] - queen) + " ");
        System.out.print((origin[2] - rook) + " ");
        System.out.print((origin[3] - bishop) + " ");
        System.out.print((origin[4] - knight) + " ");
        System.out.print((origin[5] - pawn));
    }
}

// 보고 공부할것 for문 사용
// int[] mine = new int[6];
//for (int i = 0; i < 6; i++) {
//    mine[i] = Integer.parseInt(st.nextToken());
//    // 계산과 출력을 동시에!
//    System.out.print((origin[i] - mine[i]) + " ");
//}
