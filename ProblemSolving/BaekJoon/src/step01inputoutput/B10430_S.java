package step01inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10430_S {

	public static void main(String[] args) throws Exception {


		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// A B C 배열 길이 선언
		int arr[] =new int[3];
		
		// 배열 집어넣기
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		bw.write((arr[0]+arr[1])%arr[2]+"\n"+((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]+"\n"+(arr[0]*arr[1])%arr[2]+"\n"+ ((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]);
		bw.close();
		br.close();
		
		}
}
