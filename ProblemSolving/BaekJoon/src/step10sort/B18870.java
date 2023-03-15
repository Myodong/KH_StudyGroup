package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B18870 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력배열
		int coordinate[];
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		// 배열 크기할당
		coordinate = new int[inputN];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 원소 입력받기
		for(int i = 0; i < inputN; i++) {
			coordinate[i] =Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(coordinate[i] + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
		
	}

}
