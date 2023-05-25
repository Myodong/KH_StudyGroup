package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class B1764_S {

    public static void main (String[] arge) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //n 수 입력받기
        int n = Integer.parseInt(st.nextToken());
        //m 수 입력받기
        int m = Integer.parseInt(st.nextToken());


        Set<String> nName = new HashSet<String>(); // n이름 저장

        //n 이름 입력받기
        for (int i=0; i<n; i++){
            nName.add(br.readLine());
        }

        // 정렬할 List
        List<String> sortListName = new ArrayList<>();
        // 중복 인원 카운트
        int count = 0;

        //m 이름 입력받기
        for (int i =0; i<m;i++){
            String mName = br.readLine();
            if (nName.contains(mName)){ // nName에 m이름이 있는지 확인
                count++; // 중복 인원 증가
                sortListName.add(mName);//정렬할 List에 담기
            }
        }
        bw.write(count+""+"\n");

        // 문자열 사전순 정렬
        Collections.sort(sortListName);

        for (String i : sortListName){
            bw.write(i+"\n");
        }

        br.close();
        bw.close();

    }
}
