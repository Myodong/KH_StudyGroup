package test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] arge) {

		// 배열 선언 및 초기화
		int arr[] = { 2, 5, 1, 3, 0, 4 };

		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int prev = i - 1;

			while (prev >= 0 && arr[prev] > temp) {
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;
		}
		System.out.println(Arrays.toString(arr));

	}

}
