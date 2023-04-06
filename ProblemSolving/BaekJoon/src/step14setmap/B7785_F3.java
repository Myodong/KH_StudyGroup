package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B7785_F3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine()); // 출입 기록 수

		List<String> listLog = new ArrayList<String>(); // 출입 기록 저장용 List

		// 출입 로그 입력 받기
		for (int i = 0; i < n; i++) {
			String[] inputLog = br.readLine().split(" ");

			if (inputLog[1].equals("enter")) {
				listLog.add(inputLog[0]); // 출근 기록이면 List에 추가
			} else {
				listLog.remove(inputLog[0]); // 퇴근 기록이면 List에서 제거
			}
		}
		// 문자열 사전 역순으로 정렬
		Collections.sort(listLog, Collections.reverseOrder()); 

        // 퇴근안한 사람 사전 역순 출력
		for (String name : listLog) {
			bw.write(name + "\n");
		}

		br.close();
		bw.close();
	}
}
