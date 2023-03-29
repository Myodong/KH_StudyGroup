package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class B14425_S {

	static int result = 0;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 문자열 갯수 N 과 M
		int inputN = Integer.parseInt(st.nextToken());
		int inputM = Integer.parseInt(st.nextToken());

		// N배열 선언
		String[] wordN = new String[inputN];

		// N배열에 단어 넣기
		for (int i = 0; i < inputN; i++) {
			wordN[i] = br.readLine();
		}

		// SetM에서 N단어 몇개 같은지 찾기
		for (int i = 0; i < inputM; i++) {
			String search = br.readLine();
			binarySearch(wordN, inputN, search);
		}

		bw.write(result + "");
		bw.close();
		br.close();

	}

	// 이분 탐색
	public static int binarySearch(String[] wordN, int inputN, String search ) {
		String mid = null;
		int left = 0;
		int right = inputN - 1;
				
		while (left<=right) {
			mid= (left+right)/2;
			
			if (mid==search) {
				return ++result;
			}
			
		}
		
		
		return inputN;
	}

}
