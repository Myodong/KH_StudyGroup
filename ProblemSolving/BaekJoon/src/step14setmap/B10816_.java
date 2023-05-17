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
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 상근이가 가지고 있는 숫자 개수
        int inputN = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자
        int numN[]= new int[inputN];


        for (int i= 0; i<numN.length;i++){
//            System.out.println(i);
            numN[i]=Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(numN));
    }
}
