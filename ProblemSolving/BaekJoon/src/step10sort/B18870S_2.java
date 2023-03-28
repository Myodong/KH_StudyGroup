package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B18870S_2 {
	
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
			original[i] = coordinate[i] = Integer.parseInt(st.nextToken());
		}

		// 힙정렬 코드
		heapsort();
		
		// map 선언 (key, value 이용 하기)
		Map<Integer,Integer> coordinateMap = new HashMap<Integer,Integer>();
		
		int value = 0;
		// map 값 넣기
		for(int key : coordinate) {
			// containsKey = map에 key값이 있는지 없는지 확인 (true,false 반환)
			if(!coordinateMap.containsKey(key)) {
				coordinateMap.put(key, value++);
			}
		}
		
		// BufferedWriter에 출력 문 담기
		for (int i = 0; i < inputN; i++) {
			bw.write(coordinateMap.get(original[i]) + " ");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}


	/** 힙 정렬
	 * 
	 */
	public static void heapsort() {
		
		int size =coordinate.length;
		
		// 예외처리
		if (size <2) {
			return;
		}
		
		// 마지막 인덱스 부모 구하기
		int parentIdx = ((size-1)-1)/2;
		
		// 힙만들기
		for (int i = parentIdx; i >=0; i--) {
			// 부모노드(i)를 1씩 줄이면서 힙조건 만족되도록 구성하기
			heapify(i, size-1);
		}
		
		// 힙정렬하기
		for (int i = size -1; i >0; i--) {
			swap(0, i);
			heapify(0, i-1);
		}
	}

	/** 힙 만들기
	 * @param parentIdx
	 * @param lastIdx
	 */
	private static void heapify(int parentIdx, int lastIdx) {
		// 자식 노드 구하기
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		// 비교용 값 선언
		int largestIdx = parentIdx;
		
		// leftChild노드 와 비교
		if(leftChildIdx <= lastIdx && coordinate[largestIdx] < coordinate[leftChildIdx]) {
			largestIdx = leftChildIdx;
		}
		
		// rightChild노드 와 비교
		if(rightChildIdx <= lastIdx && coordinate[largestIdx] < coordinate[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		// largestIdx 원소가 변경 됬다면 스위치 
		if(parentIdx != largestIdx) {
			swap(largestIdx, parentIdx);
			heapify(largestIdx, lastIdx);
		}
	}

	/** 인덱스 원소 바꾸기
	 * @param largestIdx
	 * @param parentIdx
	 */
	private static void swap(int i, int j) {
		int temp = coordinate[i];
		coordinate[i] = coordinate[j];
		coordinate[j] = temp;
	} 

}
