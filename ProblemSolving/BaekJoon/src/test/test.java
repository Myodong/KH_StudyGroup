package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test {
	

	   /* 안정 정렬 방법을 쓰면 될 듯??? 
	    *  안정 정렬 = 삽입, 병합, 버블
	    *  불안정 정렬 = 퀵, 선택
	    * */
	   
	   public static void insertSort(String[][] arr) {
	      
	      for(int i = 1 ; i < arr.length ; i++) {
	         String[] a = arr[i];
	         int now = Integer.parseInt(arr[i][0]);
	         int index = i-1;
	         
	         // index가 0이상이어야하는데 그건 안 써도 돼?
	         
	         //while(Integer.parseInt(arr[index][0]) > now && index >= 0) {
	         while(index >= 0 &&Integer.parseInt(arr[index][0]) > Integer.parseInt(a[0])) {
	            arr[index+1][0] = arr[index][0];
	            arr[index+1][1] = arr[index][1];
	            index--;
	         }
	         // while문을 나온 후에, 값 집어넣기
	         arr[index+1] = a;
	         
	         
	      }
	      
	   }
	   
	   public static void main(String[] args) throws Exception {

	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      
	      //map 길이
	      int length = Integer.parseInt(br.readLine());
	      
	      String[][] arr = new String[length][2];
	      
	      for(int i = 0; i < length ; i++) {
	         
	         //이러면 바로 0과 1로 나눠지나?
	         arr[i] = br.readLine().split(" ");
	         
	      }
	      
	      //삽입으로 풀어보자!
	      insertSort(arr);
	      
	      for(int i = 0; i < length ; i++) {
	         bw.write(arr[i][0]+" "+arr[i][1]+"\n");
	      }
	      bw.close();
	   }

}