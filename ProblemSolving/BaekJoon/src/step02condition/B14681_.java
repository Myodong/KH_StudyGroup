package step02condition;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B14681_ {
    public static void main(String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());


        if (x > 0 && y > 0){ // 1
            bw.write(1+"");

        } else if (x < 0 && y > 0) { // 2
            bw.write(2+"");

        } else if (x < 0 && y < 0) {
            bw.write(3+"");
        }else {
            bw.write(4+"");
        }

        bw.close();
        br.close();

    }
}
