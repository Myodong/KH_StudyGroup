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
		int max = 0;
		// 최솟값 
		int min = 0; 
		// 최빈값
		int mode = 0;

		
		for (int i = 0; i < inputN; i++) {
			// 값 입력 받기 
			int value = Integer.parseInt(bf.readLine());
			// 누적값 구하기
			sum +=value;
			// 
			arr[value+4000]++;
		}
		
		// 인덱스 값 오름차순 정렬
		Arrays.sort(input);
		
		// 배열의 길이
		double length = input.length;
		

		
		// 최빈값??
		
		// 최댓값 구하기
		for(int i=1; i<input.length; i++) { 
			if(max < input[i]) max = input[i]; 
		}
		
		// 최솟값 구하기
		for(int i=1; i<input.length; i++) {
			if(min > input[i]) min = input[i]; 
		}
		
		
		System.out.println("---");
		System.out.println("sum="+sum);
		System.out.println("length="+length);
		
		
        bw.write("1번="+Math.round(sum/length)+"\n");
        bw.write("2번="+input[(int) (length/2)]+"\n");
        bw.write("3번="+"\n");
        bw.write("4번="+(max-min)+"\n");
//		System.out.println((5+1+3+8+-2+2)/6);
		bw.flush();
		bw.close();
	}
}
