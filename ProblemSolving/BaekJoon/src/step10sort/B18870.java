package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B18870 {
	
	static int coordinate[];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 카운트
		int count = 0;
		// 출력배열
		int arr[];
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		// 배열 크기할당
		coordinate = new int[inputN];
		arr= new int [inputN];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		
		for(int i = 0; i < inputN; i++) {
			// 원소 입력받기
			coordinate[i] =Integer.parseInt(st.nextToken());
		}
		
		// 비교할 원소
		for (int i = 0; i < inputN; i++) {
			
			//원소 비교
			for (int j = 0; j < inputN; j++) {
				
				if (coordinate[i]>=coordinate[j]&&coordinate[i]!=coordinate[j]) {
					count++;
				}
			}
			arr[i]=count;
			count=0;
		}
		
//		System.out.println(Arrays.toString(coordinate));
//		System.out.println(Arrays.toString(arr));
		
		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(arr[i] + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
		
	}

}
