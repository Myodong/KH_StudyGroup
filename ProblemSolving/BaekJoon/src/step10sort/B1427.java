package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class B1427 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 문자열 배열로 받기
		String[] inputN = br.readLine().split("");

		// Stream으로 String 배열을 int 배열로 변환
		int[] intArr = Stream.of(inputN).mapToInt(Integer::parseInt).toArray();


		// 큌정렬 내림차순 호출
		quickSort(intArr);

		// 정렬된 배열값 BufferedWriter 넣기
		for (int i = 0; i < intArr.length; i++) {
			// int를 string으로 변환후 넣기
			bw.write(String.valueOf(intArr[i]));
		}

		// 정렬된 배열 값 출력 및 스트림 닫기
		bw.close();
	}

	/**
	 * arr = 정렬할 배열 0 = 시작 레프트 arr.length - 1 = 배열 마지막 인덱스
	 */
	private static void quickSort(int[] arr) {
		leftQuick(arr, 0, arr.length - 1);
	}

	/**
	 * 왼쪽 피벗 선택 방식
	 * 
	 * @param arr 정렬할 배열
	 * @param lo  현재 부분배열의 왼쪽
	 * @param hi  현재 부분배열의 오른쪽
	 */
	private static void leftQuick(int[] arr, int lo, int hi) {

		if (lo >= hi) {
			return;
		}

		int pivot = partition(arr, lo, hi);
		leftQuick(arr, lo, pivot - 1);
		leftQuick(arr, pivot + 1, hi);

	}

	/**
	 * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
	 * 
	 * @param arr   정렬 할 배열
	 * @param left  현재 배열의 가장 왼쪽 부분
	 * @param right 현재 배열의 가장 오른쪽 부분
	 * @return 최종적으로 위치한 피벗의 위치(lo)를 반환
	 */
	private static int partition(int[] arr, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = arr[left]; // 부분리스트의 왼쪽 요소를 피벗으로 설정

		// lo가 hi보다 작을 때 까지만 반복한다.
		while (lo < hi) {

			/*
			 * hi가 lo보다 크면서, hi의 요소가 pivot보다 큰 원소를 찾을 떄 까지 hi를 감소시킨다.
			 */
//			while (arr[hi] > pivot && lo < hi) {
			while (arr[hi] < pivot && lo < hi) {
				hi--;
			}

			/*
			 * hi가 lo보다 크면서, lo의 요소가 pivot보다 작거나 같은 원소를 찾을 떄 까지 lo를 증가시킨다.
			 */
//			while (arr[lo] <= pivot && lo < hi) {
			while (arr[lo] >= pivot && lo < hi) {
				lo++;
			}

			// 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
			swap(arr, lo, hi);
		}
		/*
		 * 마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와 lo가 가리키는 원소를 바꾼다.
		 */
		swap(arr, left, lo);

		// 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환한다.
		return lo;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
