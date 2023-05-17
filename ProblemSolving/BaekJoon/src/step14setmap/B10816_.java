package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10816_ {

    public static void main (String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 가지고 있는 숫자 개수
        int inputN = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자
        int numN[]= new int[inputN];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력받은 N 숫자들 배열에 넣기
        for (int n= 0; n<numN.length;n++){
            numN[n]=Integer.parseInt(st.nextToken());
        }

        // 숫자카드 M 개수
        int inputM = Integer.parseInt(br.readLine());
        // 카드의 숫자들
        int numM[]= new int[inputM];

        st = new StringTokenizer(br.readLine(), " ");

        // 숫자 넣으면서 비교하고 출력 한방에 가능하지 않나?
        // 입력받은 M 숫자들 배열에 넣기
        for (int m= 0; m<numM.length;m++){
            numM[m]=Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(numN));
        System.out.println(Arrays.toString(numM));

        bw.close();
        br.close();
    }
}
