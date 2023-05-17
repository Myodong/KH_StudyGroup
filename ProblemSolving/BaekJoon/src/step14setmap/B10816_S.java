package step14setmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10816_S {

    public static void main (String[] args) throws Exception{

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 상근이가 가지고 있는 카드 개수
        int inputN = Integer.parseInt(br.readLine());
        // 상근이가 가지고 있는 숫자
        int numN[]= new int[inputN];

        st = new StringTokenizer(br.readLine(), " ");

        // 상근이 보유 숫자카드 입력받기
        for (int n= 0; n<numN.length;n++){
            numN[n]=Integer.parseInt(st.nextToken());
        }

        // 이분탐색을 위한 정렬
        Arrays.sort(numN);

        // 숫자카드 M 개수
        int inputM = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        // 입력받은 M숫자들을 상근이가 가진 listN과 비교
        for (int i=0; i < inputM; i++){
            int search = Integer.parseInt(st.nextToken());
            int rightSearch = rightSearch(numN, search);// 중복 값중 제일 큰 인덱스
            int leftSearch  = leftSearch(numN, search);// 중복 값중 제일 작은 인덱스
            int reslut = rightSearch-leftSearch; // 큰값 작은값의 차이가 중복 갯수
            bw.write(reslut+ " ");
        }

        bw.close();
        br.close();
    }
    public static int leftSearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2; // 중간 인덱스

            if (arr[mid] >= search) { // 찾으려는 값이 중간 값보다 작다
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return  left;
    }
    public static int rightSearch(int[] arr, int search) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = (left + right) / 2; // 중간 인덱스

            if (arr[mid] > search) { // 찾으려는 값이 중간 값보다 작다
                right = mid;

            } else {
                left = mid + 1;
            }
        }
        return  left;
    }


}
