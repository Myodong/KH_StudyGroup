package step10sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
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

		
        Arrays.sort(intArr);
		
        System.out.println("입력받은 값= "+Arrays.toString(inputN));
		System.out.println("정렬된 값  =  "+Arrays.toString(intArr));
		
		// 정렬된 배열값 출력하기
		for (int i = 0; i < intArr.length; i++) {
//			bw.write(String.valueOf(intArr[i]));
			//둘중 뭐가더 빠를까???
			bw.write(intArr[i]+"");
		}
		
		long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
		long secDiffTime = (afterTime - beforeTime)/1000; //두 시간에 차 계산
		System.out.println("시간차이(m) : "+secDiffTime);
		bw.flush();
		bw.close();
	}

}
