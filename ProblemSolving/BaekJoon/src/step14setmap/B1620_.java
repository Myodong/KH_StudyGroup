package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620_ {

	public static void main(String[] arge) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 첫째 줄
		// 도감에 수록된 포켓몬 개수N
		// 내가 맞춰야 하는 문제의 개수 M
		// 1 < M <= N <=100,000

		// StringTokenizer 이용하여 포켓못 이름 개수 N , 문제 개수 M 입력 받기
		int nameN = Integer.parseInt(st.nextToken());
		int problemM = Integer.parseInt(st.nextToken());

		// 둘째 줄
		// N개의 포켓몬 번호만큼 포켓몬 한줄씩 입력 (첫 단어만 대문자)
		// 이름 (최대 20, 최소2)

		// M 개의 문제 입력 포켓몬 이름 일시 번호출력
		// 번호일 시 이름 출력
		
		Map<String, Integer> nameMap = new HashMap<>();
	
		// 포켓몬 번호 
		int num = 1;
		// 포켓몬 이름 Key, 번호 value 입력받기
		for (int i = 0; i < nameN; i++) {
			nameMap.put(br.readLine(), num++);
		}
		
		
		// 문제 입력 및 답출력
		for (String key : nameMap.keySet()) {
			
			if (nameMap.get(key).equals(br.readLine())) {
				System.out.println(nameMap.get(key));
			
			
		}
		

	}
}
