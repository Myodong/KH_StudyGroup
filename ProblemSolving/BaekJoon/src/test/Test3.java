package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test3 {


	public static void main (String[] areg) {
		
		//배열 선언 및 초기화
		int arr[] = { 2, 5, 1, 3, 0, 4 };

		int indexMin, temp;
		
		for (int i = 0; i < arr.length - 1; i++) { // 1.
			indexMin = i;
			for (int j = i + 1; j < arr.length; j++) { // 2.
				if (arr[j] < arr[indexMin]) { // 3.
					indexMin = j;
				}
			}
			// 4. swap(arr[indexMin], arr[i])
			// 찾은 값 임시저장 변수 넣어주기
			temp = arr[indexMin];
			// 처음 선택된 위치 값 위치 변경
			arr[indexMin] = arr[i];
			// 임시저장 변수에 넣은 값 위치 변경
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}