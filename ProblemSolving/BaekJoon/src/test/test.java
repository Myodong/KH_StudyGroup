package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		
		// 누적값 선언
		int sum =0;

		// 인덱스 값 누적
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		
		System.out.println("---");
		
		System.out.println(sum);
		System.out.println(input.length);
		System.out.println("합1"+(sum/input.length));
        bw.write("합2"+(sum/input.length));
//		System.out.println((5+1+3+8+-2+2)/6);
		bw.flush();
		bw.close();
	}
}