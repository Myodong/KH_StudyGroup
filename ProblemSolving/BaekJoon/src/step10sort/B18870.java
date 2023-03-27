package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B18870 {
	
	// 입력배열
	static int coordinate[]; 
	static int original[]; 
	
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// 입력 받을 원소 갯수 인덱스 길이 N 입력 받기
		int inputN = Integer.parseInt(br.readLine());
		
		// 배열 크기할당
		coordinate = new int[inputN];
		original = new int[inputN];
				
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		// 원소 입력받기
		for(int i = 0; i < inputN; i++) {
			coordinate[i] =Integer.parseInt(st.nextToken());
			original[i]=coordinate[i];
		}
		System.out.println(Arrays.toString(original));

		// 큌정렬
		quickSort(coordinate);
		
		System.out.println(Arrays.toString(coordinate));
		
		// map 중복 제거 (key, value 이용 하기)
		Map<Integer,Integer> coordinateMap = new HashMap<Integer,Integer>();
		
		// map value 값 선언
		int value=0;
		
		for (int i = 0; i < coordinate.length; i++) {
	
			// 0번인덱스 이전 비교 할거 없으니 map에 값 넣기
			if (i==0) {
				coordinateMap.put(coordinate[i], value++);
			} else { // 이전 배열 값과 같지 않다면 map에 넣기
				if (coordinate[i]!=coordinate[i-1]) {
					coordinateMap.put(coordinate[i], value++);
				}
			}
			
			
			
//			if (coordinate[i]!=coordinate[i-1]) {
//				
//				for (int j = i+1; j < coordinate.length; j++) {
//					if (coordinate[i] !=coordinate[j]) {
//						value++;
//					}
//				}
//				coordinateMap.put(coordinate[i], value);
//				value=0;
//			}
			
			
		}
		
		
		
		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			
			bw.write(coordinateMap.get(original[i]) + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}


	/**
	 * 퀵정렬
	 */
	private static void quickSort(int[] arr) {
		leftQuick(arr, 0, arr.length - 1);
	}
	private static void leftQuick(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = partition(arr, lo, hi);
		leftQuick(arr, lo, pivot - 1);
		leftQuick(arr, pivot + 1, hi);

	}
	
	private static int partition(int[] arr, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = arr[left]; // 부분리스트의 왼쪽 요소를 피벗으로 설정

		// lo가 hi보다 작을 때 까지만 반복한다.
		while (lo < hi) {

			/*
			 * hi가 lo보다 크면서, hi의 요소가 pivot보다 큰 원소를 찾을 떄 까지 hi를 감소시킨다.
			 */
			while (arr[hi] > pivot && lo < hi) {
//			while (arr[hi] < pivot && lo < hi) {
				hi--;
			}

			/*
			 * hi가 lo보다 크면서, lo의 요소가 pivot보다 작거나 같은 원소를 찾을 떄 까지 lo를 증가시킨다.
			 */
			while (arr[lo] <= pivot && lo < hi) {
//			while (arr[lo] >= pivot && lo < hi) {
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
