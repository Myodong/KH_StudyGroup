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
		int nNum[] = new int[Integer.parseInt(bf.readLine())];
		
		// 인덱스 길이 많큼 인덱스에 값 받아 넣기
		for (int i = 0; i < nNum.length; i++) {
			nNum[i] = Integer.parseInt(bf.readLine());
		}

		// 카운트 정렬
		merge_sort(nNum);

		bw.write("\n");//줄바꿈
		for (int x = 0; x < nNum.length; x++) {
            bw.write(String.valueOf(nNum[x])+"\n");
		}
		bw.flush();
		bw.close();
	}

}