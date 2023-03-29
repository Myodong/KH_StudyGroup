package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class B10815_F {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		List<Integer>listN = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		// 원소 입력받기
		for (int i = 0; i < inputN; i++) {
			listN.add(Integer.parseInt(st.nextToken()));
		}
		
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputM = Integer.parseInt(br.readLine());
		
		Integer[] numM = new Integer[inputM];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");

		// 원소 입력받기
		for (int i = 0; i < inputM; i++) {
			numM[i]=Integer.parseInt(st1.nextToken());
		}
		
		// 배열 set 변경
        Set<Integer> common = new HashSet<Integer>(Arrays.asList(numM));
        Set<Integer> common1 = new HashSet<Integer>(Arrays.asList(numM));

        // 교집합 구하기
        common.retainAll(listN);

        
        // map 선언
        Map<Integer, Integer> map1 =new HashMap<Integer, Integer>();
        
        // 교집합 맵에 넣기
       for (Integer integer : common) {
   		map1.put(integer, 1);
	}
       
       // 차집합 구하기
       common1.removeAll(listN);
       for (Integer integer : common1) {
   		map1.put(integer, 0);
	}
       

		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputM; i++) {
			
			bw.write(map1.get(numM[i]) + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
		
	}

}
