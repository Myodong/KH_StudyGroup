package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 인덱스 길이 입력 받기
		int input=Integer.parseInt(bf.readLine());
		int arr[] = new int[input];
		// 정렬될 결과값을 가지고 있는 배열 인덱스 길이 설정
		int result[] = new int[input];

		// 인덱스 길이 많큼 인덱스에 값 받아 넣기
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}

		// arr 배열에서 제일 큰 값 구하기
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// 제일 큰 값 카운트 인덱스 길이 넣어주기
		int[] counting = new int[max+1];
		
		// 임시
		System.out.println("arr배열길이"+Arrays.toString(arr));
		System.out.println("result배열길이"+Arrays.toString(result));
		System.out.println("counting배열길이"+Arrays.toString(counting));
		
		// 카운트 정렬
		
		// arr값이 counting의 인덱스 번호
		// counting배열 값 1증가 
		for (int i = 0; i < arr.length; i++) {
			counting[arr[i]]++;
			//확인용
			System.out.println(Arrays.toString(counting));
			System.out.println("counting["+i+"]= "+counting[i]);
		}
		
		// 배열 하나씩 올라가면서 counting배열 누적 합 해주기
		for (int i = 1; i < counting.length; i++) {
			counting[i]+= counting[i-1];
		}
		System.out.println("배열누적"+Arrays.toString(counting));
		
		// 
		// 1뺀 값이 result배열의 인덱스
		for (int i = arr.length-1; i >= 0; i--) {
			counting[arr[i]]--;
			result[counting[arr[i]]]=arr[i];
			
		}
		System.out.println(Arrays.toString(result));
		
		// 출력
		for (int x = 0; x < arr.length; x++) {
			bw.write(String.valueOf(result[x]) + "\n");
		}
		bw.flush();
		bw.close();
	}

}