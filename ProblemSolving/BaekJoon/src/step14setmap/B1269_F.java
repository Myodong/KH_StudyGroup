package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1269_F {

    public static void main(String[] arge) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        // 변수 선언
        int inputA = Integer.parseInt(st.nextToken());
        int inputB = Integer.parseInt(st.nextToken());
        int count =0;

        st = new StringTokenizer(br.readLine(), " ");

        List<String> listA = new ArrayList<>();
        // A 값 입력 받아 List에 넣어주기
        for (int i=0; i<inputA;i++){
            listA.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        List<String> listB = new ArrayList<>();
        // B입력 받으면서 A에서 중복값 카운트
        for (int i=0; i<inputB;i++){
            String listb =st.nextToken();
            listB.add(listb);
            // listA에서 listB와 중복된 갯구 하기
            if (listA.contains(listb)){
                // 중복갯수 카운트
                count++;
            }
        }
        bw.write((inputA-count)+(inputB-count)+"");

        bw.close();
        br.close();

    }
}
