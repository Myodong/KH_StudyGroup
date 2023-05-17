package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class B10816_F {

    public static void main (String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 상근이가 가지고 있는 숫자 개수
        int inputN = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자
        Integer numN[]= new Integer[inputN];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력받은 N 숫자들 배열에 넣기
        for (int n= 0; n<numN.length;n++){
            numN[n]=Integer.parseInt(st.nextToken());
        }

        // 숫자카드 M 개수
        int inputM = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        // Collections.frequency 사용하기 위해 배열N을 리스트에 넣어줌
        List<Integer> listN = Arrays.asList(numN);

        // 입력받은 M숫자들을 배열에 넣으면서 상근이가 가진 listN과 비교
        for (int i=0; i < inputM; i++){
            bw.write(Collections.frequency(listN,Integer.parseInt(st.nextToken()))+" ");
        }

        bw.close();
        br.close();
    }
}
