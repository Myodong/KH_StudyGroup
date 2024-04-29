package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
		public static void main(String[] args)  {
			Scanner sc = new Scanner(System.in);

			System.out.print("정수 입력 : ");
			int input = sc.nextInt();

			for(int row = 1 ; row <= input ; row++ ) {

				// for문을 이용한 풀이
//			for(int i = input-row ; i >= 1 ; i--) {

			for(int i = input-1 ; i >= row ; i--) {
				System.out.print(" ");
			}

			for(int col = 1 ; col <= row * 2 - 1 ; col++) {
				System.out.print("*");
			}


				// if문을 이용한 풀이
//				for(int col = 1 ; col <= input * 2 - 1; col++) {
//
//					if( input-row>=col || input+row<=col) {
//						System.out.print(" ");
//
//					}else{
//						System.out.print("*");
//					}
//				}

				System.out.println(); // 줄바꿈
			}

		}
}