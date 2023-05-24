package step01inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2588_S {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자 입력 받기
        int num1 = Integer.parseInt(br.readLine());
        String num2 = br.readLine();

        String[] num2Seat = num2.split("");

        for (int i=2; i>=0;i--){
            bw.write((num1*(Integer.parseInt(num2Seat[i])))+""+"\n");
        }
        bw.write(num1*(Integer.parseInt(num2))+"");

        bw.close();
        br.close();

    }
}
