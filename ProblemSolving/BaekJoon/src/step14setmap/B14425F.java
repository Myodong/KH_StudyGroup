package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B14425F {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// 문자열 갯수 N 과 M 
		int inputN =Integer.parseInt(st.nextToken());
		int inputM =Integer.parseInt(st.nextToken());
		
		// N배열 선언 
		String[] wordN = new String [inputN];
		
		// N배열에 단어 넣기
		for (int i = 0; i < inputN; i++) {
			wordN[i]= br.readLine();
		}
		
		
		// 맵 선언
		Map<String, String> mapWordM = new HashMap<>();
		
		// map에 M 단어 넣기
		for (int i = 0; i < inputM; i++) {
			String word = br.readLine();
			mapWordM.put(word, word);
		}
		
		int result = 0;
		
		// mapM 에서 N단어 몇개 같은지 찾기
		for(String key : wordN) {
			// containsKey = map에 key값이 있는지 없는지 확인 (true,false 반환)
			if(mapWordM.containsKey(key)) {
				result++;
			}
		}
		
        bw.write(result+"");
        bw.close();
        br.close();
		
	}

}
