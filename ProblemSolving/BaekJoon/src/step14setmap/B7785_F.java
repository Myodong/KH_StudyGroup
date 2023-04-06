package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class B7785_F {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출입기록 수 N
		int N = Integer.parseInt(br.readLine());
		
		
		Map<String, String> logList = new HashMap<String, String>();
		
		// 출입 로그 입력 받기
		for (int i = 0; i < N; i++) {
		    String[] inputLog = br.readLine().split(" "); // 입력받은 값을 공백으로 분리하여 배열에 저장
		    
		    if (!logList.containsKey(inputLog[0])) { // logList(Map)에 해당 key가 없다면
		    	logList.put(inputLog[0], inputLog[1]);  // Key , Value로 값을 저장
		    	
			}else {
				logList.remove(inputLog[0]);// logList(Map)에 해당 key가 있다면 기존 키 제거(출근 후 퇴근 했기때문)
			}
		}
		
        // 퇴근안한 사람 출력
		// keySet() 을 이용 하여 Map에서 전체 출력하지만 key값만 출력
		for (String key : logList.keySet()) {
		    bw.write(key + "\n");
		}
	    bw.close();
	    br.close();
		
	}
}
