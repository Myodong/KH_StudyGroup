package step02condition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2753_S {

    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        if (input%4==0 && input%100!=0|| input%400==0){
            bw.write(1+"");
        }else {
            bw.write(0+"");
        }
        bw.close();
        br.close();

    }

}
