package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int inputLength = 1;
		// 정규표현식 숫자만
		String num = "^[0-9]*$";

		do {
			System.out.println("N응시자 수, K상받을 사람 수");
			String input[] = bf.readLine().split(" ");

			// 첫번째 입력 길이 확인
			if (input.length == 2) {

				// 정규표현식
				boolean result1 = Pattern.matches(num, input[0]);
				boolean result2 = Pattern.matches(num, input[1]);
				int memberAll = 0;
				int memberAward = 0;

				// 정규표현식 검사
				if (result1 == true && result2 == true) {
					memberAll = Integer.parseInt(input[0]);
					memberAward = Integer.parseInt(input[1]);
					inputLength = 0;

					// 제한 조건
					if (1 <= memberAll && memberAll <= 1000 && 1 <= memberAward && memberAward <= memberAll) {

						// 전체인원 수 만큼 인덱스 길이 설정
						String scoreIdx[] = new String[memberAll];

						int check = 1;
						int check2 = 1;

						do {
							System.out.println("X점수를 입력하세요");
							scoreIdx = bf.readLine().split(" ");

							// 전체 인원 수만큼 점수 입력했는지 확인
							if (scoreIdx.length == memberAll) {

			                     //배열이 처음 생성될 때 초기값이 0이기 때문에.. 답을 제대로 내려면 if문 안에 들어가서 printLn을 써야 될 거 같음
			                     int[] score = new int[scoreIdx.length];
			                  
			                     //(1) 문자인지 숫자인지 여부 확인하기
			                     for(int i = 0 ; i < scoreIdx.length;i++) {
			                        //string배열에 담겨있는 애를 각각 검사해서 숫자일 경우 숫자 배열에 넣어준다.
			                        boolean resulti = Pattern.matches(num, scoreIdx[i]);
			                        
			                        if (resulti) {
			                           score[i] = Integer.parseInt(scoreIdx[i]);

			                           if(0<=score[i] && score[i]<=10000) {
			                              
			                              check=0;
			                              check2 = 0;
			                              
			                           } else {
			                              
			                              System.out.println("[!] 점수값이 잘못되었습니다.");
			                              check=1;
			                              check2 = 1;
			                              break;
			                           }
			                           
			                        } else {
			                           System.out.println("[!] 문자열을 입력했음.");
			                           check = 1;
			                           check2 = 1;
			                           break;
			                        }
			                        
			                     }//for문 끝
			                     
			                     if(check2 == 0) {
			                        // 내림차순
			                        Arrays.sort(score);
			                        
			                        // 출력
			                        System.out.println(score[memberAll-memberAward]);
			                     }
			                     
							} else {
								System.out.println("[!] 인원수에 맞게 점수를 입력해주세요");
								check = 1;
							}
						} while (check == 1);

					} else {
						System.out.println("[!] 숫자만 입력해주세요.");
					}
				} else { // 첫번째 입력 길이가 맞지 않다면
					inputLength = 1;
				}

			} else {
				inputLength = 1;
				System.out.println("[!] 값을 2개 작성해 주세요");
			}
		} while (inputLength == 1);

	}
}