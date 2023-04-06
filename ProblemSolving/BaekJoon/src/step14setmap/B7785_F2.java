package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class B7785_F2 {

	public static void main(String[] args) throws Exception {


	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	    // 출입기록 수 N
	    int N = Integer.parseInt(br.readLine());

	    Set<String> setLog = new HashSet<String>();

	    // 출입 로그 입력 받기
	    for (int i = 0; i < N; i++) {
	        String[] inputLog = br.readLine().split(" "); // 입력받은 값을 공백으로 분리하여 배열에 저장

	        if (inputLog[1].equals("enter")) { // 입력받은 배열 inputLog[1] 값이 출근 "enter" 같다면 
	        	setLog.add(inputLog[0]); //출근 "enter"이면 set에 추가
	            
	        } else { // 퇴근 "leave"이면 set에서 제거
	        	setLog.remove(inputLog[0]);
	        }
	    }

        // 퇴근안한 사람 출력
	    for (String name : setLog) {
	        bw.write(name + "\n");
	    }

	    bw.close();
	    br.close();
	}
}
