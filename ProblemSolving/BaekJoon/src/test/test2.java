package test;

import java.util.Arrays;

public class test2 {
	static int a[] = {3,7,5,4,2,8};

	public static void main(String[] args) throws Exception {

		//배열 선언 및 초기화
				int arr[] = { 2, 5, 1, 3, 0, 4 };

				for (int i = 1; i < arr.length; i++) { // 1.
					// 임시 인덱스 값 저장
					int temp = arr[i];
					// 이전 인덱스 저장
					int prev = i - 1;
					while ((prev >= 0) && (arr[prev] > temp)) {      // 2.
						// 기존 값들 뒤로 밀기
						arr[prev + 1] = arr[prev];
						prev--;
					}
					// 해당 본인 자리에 값 넣기
					arr[prev + 1] = temp;                            // 3.
				}
				System.out.println(Arrays.toString(arr));
		
	}

}
