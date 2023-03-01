package test;

import java.util.Arrays;

public class test2 {
	static int a[] = {3,7,5,4,2,8};

	public static void main(String[] args) throws Exception {

		heapsort();
		
		System.out.println(Arrays.toString(a));

	}

	public static void heapsort() {
		int size = a.length;
		
		// 예외처리
		if (size <2) {
			return;
		}
		
		// 마지막 인덱스  부모 구하기
		int p = getParent(size - 1);

		
		// 힙만들기
		for (int i = p; i >= 0; i--) {
			// 부모노드(i값)을 1씩 줄이면서 heap 조건을 만족시키도록 재구성한다.
			heapify( i, size - 1);
		}
		
		// 정렬하기
		for (int i = size -1; i >0; i--) {
			swap(0, i);
			heapify(0, i-1);
		}
		
		
	}
	
	private static int getParent(int child) {
	    return (child - 1) / 2;
	}

	private static void swap(int i ,int j ) {
		// 원소 교환 
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 힙만들기
	private static void heapify(int parentIdx, int lastIdx) {
		
		// 자식 노드 구하기
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		// 비교용 값 선언
		int largestIdx = parentIdx;
		
		// left child node와 비교
		if (leftChildIdx <= lastIdx && a[largestIdx]<a[leftChildIdx]) {
			largestIdx =leftChildIdx;
		}
		
		// left right node와 비교
		if(rightChildIdx <= lastIdx && a[largestIdx] < a[rightChildIdx]) {
			largestIdx = rightChildIdx;
		}
		
		
		if (largestIdx!=parentIdx) {
			swap(largestIdx, parentIdx);
			heapify(largestIdx, lastIdx);
		}
		
		
	}

}
