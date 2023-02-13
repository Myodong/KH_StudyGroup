package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test {

	public static void main(String[] args) throws Exception {

		// 선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 인덱스 길이 입력
		int input[] = new int[Integer.parseInt(bf.readLine())];
		
		
		// 인덱스 길이에 값 입력
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(bf.readLine());
		}
		// 인덱스 값 오름차순 정렬
		Arrays.sort(input);
		
		// 배열의 길이
		double length = input.length;
		
		// 누적값 선언
        double sum =0;

		// 인덱스 값 누적
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		
		
		System.out.println("---");
		System.out.println("sum="+sum);
		System.out.println("length="+length);
        bw.write("1번="+Math.round(sum/length)+"\n");
        bw.write("2번="+input[(int) (length/2)]+"\n");
        bw.write("3번="+"\n");
//		System.out.println((5+1+3+8+-2+2)/6);
		bw.flush();
		bw.close();
	}
}