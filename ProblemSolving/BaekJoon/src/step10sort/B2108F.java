package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2108F {
	public static void main(String[] args) throws Exception {

		// 선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 입력받을 갯수 
		int inputN = Integer.parseInt(bf.readLine());
		
		// 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.
		// -4000 ~ 4000 0포함하여 8001
		int arr[] = new int[8001];
		
		// 누적값 
		double sum =0;
		// 최댓값 
		// -2147483648
		int max = Integer.MIN_VALUE;
		// 최솟값 
		// 2147483647
		int min = Integer.MAX_VALUE; 
		
		//-4000~4000 을 제외한 수로 초기화
		// 최빈값
		int mode = 5000;
		// 중앙 값
		int median= 5000;

		// 입력받은 inputN 값 만큼 for문 돌리기
		for (int i = 0; i < inputN; i++) {
			// 값 입력 받기 
			int value = Integer.parseInt(bf.readLine());
			// 누적값 구하기
			sum +=value;
			// 카운팅
			arr[value+4000]++;
			
			// 최소/최대 값 구하기
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		// 인덱스 값 오름차순 정렬
		Arrays.sort(input);
		
		
		
		
        bw.write("1번 산술평균="+Math.round((double)sum/inputN)+"\n");
        bw.write("2번 중앙값  ="+input[(int) (length/2)]+"\n");
        bw.write("3번 최빈값  ="+"\n");
        bw.write("4번 범위    ="+(max-min));
//		System.out.println((5+1+3+8+-2+2)/6);
		bw.flush();
		bw.close();
	}
}
