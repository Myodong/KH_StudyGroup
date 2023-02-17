package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test {

	// 답 4개 넣을 배열 인덱스 길이 선언
	public static int[] result = new int[4];
	
	public static void resultArray(int[] arr) {	
		
		// 입력받은 값 정렬 
		Arrays.sort(arr);
		
		//  인덱스 1 중앙값 출력
		result[1] = arr[(int)(arr.length/2)];
		// 인덱스 3 범위 (최소 최대 차이 값)
		result[3] = arr[arr.length-1]-arr[0];
		
		// 카운팅배열 인덱스 길이 설정
		// 예시
		// arr[5]
		// 배열에 값이 {1,3,8,-2,2} 일때
		// 정렬을 미리 했기에  배열 값은 {-2, 1, 2, 3, 8}이다
		// [arr.length-1] arr의 길이가 5 이므로 5-1하면 [4]이기에 값은 8 이다
		// 그럼 다시 정리하면
		// int[arr[4]-arr[0]+1];
		//int[8 - -2 + 1] 이기에 - -는 연산하면 + 이므로 = 8+2+1 이다
		// 그러므로 counting 의 길이는 [11] 이다
		int[] counting = new int[arr[arr.length-1]-arr[0]+1];
		
		// ?????????????
		boolean flag = true;
		
		
		for(int i=0;i<arr.length;i++ ) {
			result[0]+=arr[i];
			// 개수 카운팅
			counting[arr[i]-arr[0]]+=1;
		}
		if(result[0] >=0) {
			result[0]= Math.round(result[0]/(float)arr.length);
		}else {
			result[0]= -Math.round(Math.abs(result[0]/(float)arr.length));
		}
		
		int max =0;
		// arr 길이가 5라 가정하자
		int[] index = new int[arr.length+1];
		int c = 0;
		for(int i=0;i<counting.length;i++ ) { 
			// 카운팅한 배열에서 제일 큰 요소를 찾아준다 
			// 큰 요소를 max라고 하고 같은 값의 요소가 있을 때 그 같은 값이 몇개있는 지 c라는 변수에 카운팅
			// index[1]부터 가장 큰 요소(최빈값)이 여러개 있을 시 넘어줌
			if(i == 0) {
				max = counting[i];
				c = 1;
				index[c] = i+arr[0];
			}else {
				if(max < counting[i]) {
					max = counting[i];
					c= 1;
					index[c] = i+arr[0];
				}else {
					if(max == counting[i]) {
						c++;
						index[c] = i+arr[0];
					}
				}
				
			}
		}
		
		if(c == 1) {// 최빈값이 하나일때
			result[2] = index[1];
		}else {// 최빈값이 여러개 일때 두번째로 작은 요소
			result[2] = index[2];
		}
		
	}
	public static void main(String[] args) throws Exception{
		BufferedReader SB = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter SW = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력받기 
		int count = Integer.parseInt(SB.readLine());
		
		//선언 및 인덱스 길이 
		int[] output = new int[count];
		
		// 입력 값 만큼 값 배열에 넣기
		for(int i =0; i<count;i++) {
			output[i] = Integer.parseInt(SB.readLine());
		}
		// 메서드 호출
		resultArray(output);
		
		for(int j : result) {
			SW.write(j+"\n");
		}
		SW.close();
	}
}