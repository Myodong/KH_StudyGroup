package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class B1269_S {

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

        Set<String> setA = new HashSet<>();
        // A 값 입력 받아 Set 넣어주기
        for (int i=0; i<inputA;i++){
            setA.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        Set<String> setB = new HashSet<>();
        // B입력 받으면서 A에서 중복값 카운트
        for (int i=0; i<inputB;i++){
            String listb =st.nextToken();
            setB.add(listb);
            // listA에서 listB와 중복된 갯구 하기
            if (setA.contains(listb)){
                // 중복갯수 카운트
                count++;
            }
        }

        bw.write((inputA-count)+(inputB-count)+"");

        bw.close();
        br.close();

    }
}
