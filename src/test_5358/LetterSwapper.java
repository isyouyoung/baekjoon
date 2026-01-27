package test_5358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterSwapper {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        StringBuilder sb = new StringBuilder();

        while ((line = br.readLine()) != null) {
            for (char ch : line.toCharArray()) {
                if (ch == 'i') {
                    ch = 'e';
                } else if ( ch == 'e') {
                    ch = 'i';
                } else if ( ch == 'I') {
                    ch = 'E';
                } else if ( ch == 'E') {
                    ch = 'I';
                }
                sb.append(ch);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}

// [문제 번역: PLU 축구팀의 명단 교정]
// PLU 축구팀 코치는 NCAA 디비전 II 챔피언십 경기에 출전할 모든 선수의 명단을 NCAA 관계자들에게 제출해야 합니다.
// 불행하게도 코치의 컴퓨터 키보드가 고장 나서 철자 'i'와 'e'가 서로 바뀌어 입력되었습니다.
// 당신의 임무는 모든 명단을 읽어 올바른 철자로 출력하는 프로그램을 작성하는 것입니다.
