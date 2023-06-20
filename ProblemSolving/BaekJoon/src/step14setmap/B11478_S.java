package step14setmap;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class B11478_S {
    public static void main(String[] arge) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열 s 입력받기
        String s = br.readLine();

        // 중복 제거를 위한 set
        Set<String> set = new HashSet<>();

        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // set은 중복으로 값이 들어가지 않기때문에 바로 넣기
                    set.add(s.substring(i, j));
            }
        }

        bw.write(set.size()+"\n");
        bw.close();
        br.close();
    }
}