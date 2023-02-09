package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) throws IOException {

		//배열 선언 및 초기화
				int arr[] = { 2, 5, 1, 3, 0, 4 };

				for (int index = 1; index < arr.length; index++) { // 1.
					// 임시 인덱스 값 저장
					int temp = arr[index];
					// 이전 인덱스 저장
					int prev = index - 1;
					while ((prev >= 0) && (arr[prev] > temp)) {      // 2.
						// 앞인덱스로 위치 변경
						arr[prev + 1] = arr[prev];
						prev--;
					}
					// 기존 앞인덱스 뒤로 밀기
					arr[prev + 1] = temp;                            // 3.
				}
				System.out.println(Arrays.toString(arr));

/////////////////////////////////////////////////////////////////////////////////////		
	}
}