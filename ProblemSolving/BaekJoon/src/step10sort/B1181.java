package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1181 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int inputN = Integer.parseInt(br.readLine());

		// 중복 된 값 넣는 배열 선언
		String arr1[] = new String[inputN];

		// 중복여부 
		boolean duplicate = false;
		// 중복 갯수 카운트
		int count = 0;
		// 배열길이 구하는용도
		int indexN = 0;

		
		// 배열의 길이만큼 값 넣어주기
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = br.readLine();
			
			// 배열에 값 넣을때 중복 값 갯수 구하기
			for (int j = 0; j < i; j++) {
				
				//중복일시 카운트 증가
				if (arr1[i] .equals(arr1[j])) {
					count++;
					break;
				}
			}
		}
		
		// 중복 제거된 배열 선언
		String arr2[] = new String[inputN-count];

		// 중복 제거 
		for (int x = 0; x < arr1.length; x++) {

			// 0번 인덱스 비교할 값이 없으므로 0번 인덱스 아닐때 조건 추가
			if (x!=0) {
				
				for (int j = 0; j < x; j++) {
					
					// 중복일때
					if (arr1[x].equals(arr1[j])) {
						duplicate = true;
						indexN--;
						break;
						
					} else { // 중복이 아닐때
						duplicate = false;
					}
				}
				indexN++;
			}
			if (duplicate == false) {
				arr2[indexN] = arr1[x];
			}
		}
		
		
		// 힙정렬 코드
		// 아스키코드 이용하여 비교
		
		
		
		
		
System.out.println("---------");
		
		// 출력문
		for (int i = 0; i < arr2.length; i++) {
			bw.write(arr2[i]+"\n");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}
}
