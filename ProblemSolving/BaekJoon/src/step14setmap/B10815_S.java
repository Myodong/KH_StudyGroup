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

public class B10815_S {

	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		// map 선언
        Map<Integer, Integer> map1 =new HashMap<Integer, Integer>();
        
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		List<Integer>listN = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		// 원소 입력받기 ,map에 넣기 
		for (int i = 0; i < inputN; i++) {
			int input =Integer.parseInt(st.nextToken());
			listN.add(input);
			map1.put(input, 1);
		}
		
///////////////////////////////////////////////////////////////////////////////		
		
		// 입력 받을 원소 갯수 인덱스 길이 M 입력 받기
		int inputM = Integer.parseInt(br.readLine());
		
		Integer[] numM = new Integer[inputM];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()," ");

		// 원소 입력 받고 BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputM; i++) {
			numM[i]=Integer.parseInt(st1.nextToken());
			//getOrDefault 키가 없으면 디폴트 출력됨 
			bw.write(map1.getOrDefault(numM[i],0) + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}


}
