package step01inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B11382_E {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 변수 선언
        int sum = 0;

        // 입력받은값 Token짜르면서 sum 더하기
        for(int i=1; i<=3; i++) {
            sum+=Integer.parseInt(st.nextToken());
        }
        bw.write(sum+"");
        bw.close();
        br.close();
    }
}