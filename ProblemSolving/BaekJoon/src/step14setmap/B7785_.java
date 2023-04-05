package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class B7785_ {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출입기록 수 N
		int N = Integer.parseInt(br.readLine());
		
		
		Map<String, String> logList = new HashMap<String, String>();
		
		// 출입 로그 입력 받기
		for (int i = 0; i < N; i++) {
		    String[] inputLog = br.readLine().split(" "); // 입력받은 값을 공백으로 분리하여 배열에 저장
		    logList.put(inputLog[0], inputLog[1]);  // Key , Value로 값을 저장
		}
		
		//정렬
		
		// leave 가 없는 사람은 현제 출근중이다. 
		
		
	}
}
