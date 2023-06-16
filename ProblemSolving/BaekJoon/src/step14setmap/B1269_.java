package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1269_ {

    public static void main(String[] arge) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        int inputA = Integer.parseInt(st.nextToken());
        int inputB = Integer.parseInt(st.nextToken());
        int count =0;

        st = new StringTokenizer(br.readLine(), " ");

        //  1. A에서 B와 중복인거 제거 남은 갯수
        List<String> listA = new ArrayList<>();
        // 입력 받기
        for (int i=0; i<inputA;i++){
            listA.add(st.nextToken());
        }

        System.out.println(listA);

        // 2. B에서 A와 중복인거 제거 남은 갯수
        bw.close();
        br.close();

    }
}
