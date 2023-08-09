package step35tree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11725_ {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        //1. 첫재줄 노드의 개수 N 입력 받기
        int n = Integer.parseInt(br.readLine());

        //2. 트리 배열 길이
        Integer[] arr = new Integer[n+1];
//        int[] arr = {1,2,3,4,5,6,7};

        int indxNum = -1;

        int a = 0;
        int b = 0;


        for (int i= 0; i< arr.length;i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println("a= "+a);
            System.out.println("b= "+b);
            System.out.println(Arrays.toString(arr));

/*https://leejinseop.tistory.com/40*/
            /*문제점
            * 부모인덱스번호*2+1
            * 보모인덱스번호*2+2
            * (자식노드인덱스-1)/2
            * 위 법칙은 완전 이진트리에서만 사용됨
            * 해당 문제는 완전이진트리가 아니기 때문에 사용하면 out of index가 발생*/

            /*해결방법
            root를 0번인덱스가 아닌 1번인덱스부터 시작
            * 부모노드 인덱스 = i/2 (조건 i>1)
            * 왼쪽 자식노드 인덱스 = i*2 (조건 i*2 <= n)
            * 오른쪽 자식노드 인덱스 = i*2+1 (조건 i*2+1 <= n)
            * */

            if (a==1||b==1){ // a,b 둘중 하나라도 1이 맞다면
                System.out.println("a,b 둘중 하나라도 1이 맞다면");
                if (a==1){                                           // a가 1일때
                    arr[1]=a;                                        // 1인덱스에 a원소 1를 넣는다
//                    if (arr[1*2]==null && arr[1*2] <= n){            // 1인덱스 왼쪽 자식노드가 null 이라면
                    if (arr[1*2]==null){            // 1인덱스 왼쪽 자식노드가 null 이라면
                        arr[1*2]=b;                                  // 왼쪽 자식노드에 b 값을 넣는다
//                    }else if (arr[1*2+1]==null && arr[1*2+1] <= n){  // 1인덱스 왼쪽 자식노드가 null이 아니면
                    }else if (arr[1*2+1]==null){  // 1인덱스 왼쪽 자식노드가 null이 아니면
                        arr[1*2+1]=b;                                // 오른쪽 자식노드에 b값을 넣는다
                    }

                } else if (b==1) {                                  // b가 1일때
                    arr[1]=b;                                       // 1인덱스에 b원소 1를 넣는다
//                    if (arr[1*2]==null && arr[1*2] <= n){           // 1인덱스 왼쪽 자식노드가 null 이라면
                    if (arr[1*2]==null ){           // 1인덱스 왼쪽 자식노드가 null 이라면
                            arr[1*2]=a;                                 // 왼쪽 자식노드에 a 값을 넣는다
//                    }else if (arr[1*2+1]==null && arr[1*2+1] <= n){ // 1인덱스 왼쪽 자식노드가 null이 아니면
                    }else if (arr[1*2+1]==null){ // 1인덱스 왼쪽 자식노드가 null이 아니면
                        arr[1*2+1]=a;                               // 오른쪽 자식노드에 a값을 넣는다
                    }
                }
            }else { // a,b 둘중 하나라도 1이 아니면
                System.out.println("a,b 둘중 하나라도 1이 아니면");
                if (Arrays.asList(arr).contains(a)){                            //a가 배열에 이미 있다면
                    indxNum = Arrays.asList(arr).indexOf(a);                    //배열에 있는 a 인덱스 구하기
                    System.out.println("a인덱스번호=" +indxNum);
//                    if (arr[indxNum*2]==null && arr[indxNum*2] <= n){           // 1인덱스 왼쪽 자식노드가 null 이라면
                    if (arr[indxNum*2]==null) {           // 1인덱스 왼쪽 자식노드가 null 이라면
                            arr[indxNum*2]=b;                                       // 왼쪽 자식노드에 a 값을 넣는다
//                    }else if(arr[indxNum*2+1]==null && arr[indxNum*2+1] <= n){  // 1인덱스 왼쪽 자식노드가 null이 아니면
                    }else if(arr[indxNum*2+1]==null ){  // 1인덱스 왼쪽 자식노드가 null이 아니면
                        arr[indxNum*2+1]=b;                                     // 오른쪽 자식노드에 a값을 넣는다
                    }
                } else if (Arrays.asList(arr).contains(b)) {                    //b가 배열에 이미 있다면
                    indxNum = Arrays.asList(arr).indexOf(b);                    //배열에 있는 b 인덱스 구하기
                    System.out.println("b인덱스번호=" +indxNum);
//                    if (arr[indxNum*2]==null && arr[indxNum*2] <= n){           // 1인덱스 왼쪽 자식노드가 null 이라면
                    if (arr[indxNum*2]==null ){           // 1인덱스 왼쪽 자식노드가 null 이라면
                        arr[indxNum*2]=a;                                       // 왼쪽 자식노드에 a 값을 넣는다
//                    }else if(arr[indxNum*2+1]==null && arr[indxNum*2+1] <= n) { // 1인덱스 왼쪽 자식노드가 null이 아니면
                    }else if(arr[indxNum*2+1]==null) { // 1인덱스 왼쪽 자식노드가 null이 아니면
                        arr[indxNum*2+1]=a;                                     // 오른쪽 자식노드에 a값을 넣는다
                    }
                }
            }
            System.out.println(Arrays.toString(arr));

        }


        System.out.println(Arrays.asList(arr).indexOf(1));
        System.out.println(Arrays.asList(arr).indexOf(6));
        System.out.println(Arrays.asList(arr).indexOf(10));



    }
}
