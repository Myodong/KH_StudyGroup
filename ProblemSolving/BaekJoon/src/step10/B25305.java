package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class B25305 {

	public static void main(String[] args) throws IOException {

		/*
		 * 문제 2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 N명의 학생들이 응시했다. 이들 중 점수가 가장 높은 k명은 상을 받을 것이다. 이
		 * 때, 상을 받는 커트라인이 몇 점인지 구하라. 커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.
		 * 
		 * 
		 * 입력 
		 * 첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다. 
		 * 둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.
		 * 
		 * ex) 
		 * 5 2 
		 * 100 76 85 93 98
		 * 
		 * 
		 * 출력 
		 * 상을 받는 커트라인을 출력하라.

		 * ex) 
		 * 98
		 * 
		 * 
		 * 제한 
		 * 1 ≤ N ≤ 1,000 
		 * 1 ≤ k ≤ N 
		 * 0 ≤ x ≤ 10,000
		 */

		
		// 선언
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int inputLength=1;
		
		do {
			
			System.out.println("N응시자 수, K상받을 사람 수");
			String input[] = bf.readLine().split(" ");
			
			if (input.length ==2) {

				// 정규표현식 숫자만 
				String num = "^[0-9]*$";
				
				String data1 =  input[0];
				String data2 =  input[1];
				boolean result1 = Pattern.matches(num,data1);
				boolean result2 = Pattern.matches(num,data2);
				
				int memberAll=0;
				int memberAward=0;
				
				// 정규표현식 검사 
				if (result1== true && result2==true) {
					 memberAll = Integer.parseInt(input[0]);
					 memberAward = Integer.parseInt(input[1]);
					inputLength=0;

					
				}else {
					inputLength=1;
				}
				

				// 제한 조건
				if (1 <= memberAll && memberAll <= 1000 && 1<=memberAward && memberAward <= memberAll) {
					
					// 전체인원 수 만큼 인덱스 길이 설정
					String scoreIdx[] = new String[memberAll] ;
					
					int check=1;
					
					do {
						
						System.out.println("X점수를 입력하세요");
						scoreIdx = bf.readLine().split(" ");
						
						// string 를 int 변환
						int[] score = Stream.of(scoreIdx).mapToInt(Integer::parseInt).toArray();
						
						// 전체인원수 와 점수 수량이 맞는지 확인
						if (scoreIdx.length == memberAll) {
							
							// 값 하나하나 조건 확인
							for (int i = 0; i < score.length; i++) {
								
								if (0<=score[i] && score[i]<=10000) {
									
									check=0;
									
								} else {
									System.out.println("[!] 점수값이 잘못되었습니다.");
									check=1;
									break;
								}
							}
							
						}else {
							System.out.println("[!] 인원수에 맞게 점수를 입력해주세요");
							check=1;
						}
						
						// 내림차순
						Arrays.sort(score);
						
						// 출력
						System.out.println(score[memberAll-memberAward]);
						
					} while (check==1);
					
				} else {
					System.out.println("[!] 숫자만 입력해주세요.");
				}
				
			}else {
				inputLength=1;
				System.out.println("[!] 값을 2개 작성해 주세요");

			}
			
		} while (inputLength == 1);
		
		
		
		
		
		
		
		
		/* 제출용 코드 
		 * 
		 * 
		 * 
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * System.out.println("전체인원, 상인원 ="); String input[] = bf.readLine().split(" ");
		 * 
		 * 
		 * System.out.println("점수입력 = "); String[] score = bf.readLine().split(" ");
		 * 
		 * // Stream으로 String 배열을 int 배열로 변환 int[] intScore =
		 * Stream.of(score).mapToInt(Integer::parseInt).toArray(); // primitive Type을
		 * Wrapper클래스로 박싱해주어야 reverseOrder 사용가능. Integer[] tmp =
		 * Arrays.stream(intScore).boxed().toArray(Integer[]::new); Arrays.sort(tmp,
		 * Comparator.reverseOrder());
		 * System.out.println(tmp[Integer.parseInt(input[1])-1]);
		 * 
		 */
	}
}
