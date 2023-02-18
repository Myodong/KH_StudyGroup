package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class B1427 {

	public static void main(String[] args) throws Exception {
		
		long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 문자열 배열로 받기
		String[] inputN = br.readLine().split("");
		
		// Stream으로 String 배열을 int 배열로 변환
        int[] intArr = Stream.of(inputN).mapToInt(Integer::parseInt).toArray();

		// 큌정렬 내림차순

        
        
        
        
		
        System.out.println("입력 값 = "+Arrays.toString(inputN));
		System.out.println("정렬 값 = "+Arrays.toString(intArr));
		
		// 정렬된 배열값 BufferedWriter 넣기 
		for (int i = 0; i < intArr.length; i++) {
			bw.write(String.valueOf(intArr[i]));
		}
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
		System.out.println("시간차이(ms) : "+secDiffTime);
		
		// 정렬된 배열 값 출력 및 스트림 닫기
		bw.close();
	}

}
