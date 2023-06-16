package step02condition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B9498_S {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num >= 90){
            bw.write("A");
        } else if (79 < num && num < 90) {
            bw.write("B");
        } else if (69 < num && num < 80) {
            bw.write("C");
        }else if (59 < num && num < 70) {
            bw.write("D");
        }else {
            bw.write("F");
        }
        bw.close();
        br.close();
    }
}
