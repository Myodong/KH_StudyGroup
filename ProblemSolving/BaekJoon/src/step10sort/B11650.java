package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B11650 {
	
	// 멤버 변수 선언
	public static int[][] coordinate; 
	public static int[][] temp; 

	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력 받을 값 갯수 인덱스 길이 값 입력 받기
		int inputN = Integer.parseInt(br.readLine());

		// 2차원 배열 입력받은 인덱스 길이로 초기화 
		coordinate = new int[inputN][2];
		
		// 2차원 배열에 입력받은 좌표 값 넣기
		for (int i = 0; i < inputN; i++) {
			String[] xyNum = br.readLine().split(" ");
			coordinate[i][0] = Integer.parseInt(xyNum[0]);
			coordinate[i][1] = Integer.parseInt(xyNum[1]);
		}

		// 정렬
		// Top-Down 방식 구현
		// 오버로딩
		mergeSort();
		
		// BufferedWriter에 출력 문 담기
        for (int i = 0; i < inputN; i++) {
            bw.write(coordinate[i][0] + " " + coordinate[i][1]+"\n");
        }
        // 출력 후 스트림 닫기
		bw.close();
	}
}
