package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B18870 {
	
	// 입력배열
	static int coordinate[]; 
	// 카운팅 누적 배열
	static int counting[]; 
	// 정렬된 배열
	static int result[];
	
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		// 배열 크기할당
		coordinate = new int[inputN];
				
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 원소 입력받기
		for(int i = 0; i < inputN; i++) {
			coordinate[i] =Integer.parseInt(st.nextToken());
		}
		
		// 카운팅 배열 크기 구하기
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < coordinate.length; i++) {
			if (coordinate[i] > max) {
				max = coordinate[i];
			}
		}
		// 카운팅 배열 크기 할당
		counting = new int[max+1];
		

		// 정렬된 배열 크기 할당
		result = new int[inputN];

		
		// 카운팅정렬
		countingSort();
		
		// map 중복 제거 (key, value 이용 하기)
		
		
		
		
		
		
		
		
		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(result[i] + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
		
	}

	
	
	/**
	 * 카운팅 정렬
	 */
	private static void countingSort() {
		
		for (int i = 0; i < coordinate.length; i++) {
			counting[coordinate[i]]++;
		}
		
		// 누적 합
		for (int i = 1; i < counting.length; i++) {
			counting[i] += counting[i-1];
		}
		
		for (int i = coordinate.length - 1; i >= 0; i--) {
			int value = coordinate[i];
			counting[value]--;
			result[counting[value]] = value;
		}
		
		
	}

}
