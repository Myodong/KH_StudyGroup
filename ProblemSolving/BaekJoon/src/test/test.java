package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class test {

	static int[][] points;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        points = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            points[i][0] = Integer.parseInt(line[0]);
            points[i][1] = Integer.parseInt(line[1]);
        }

        mergeSort(0, N - 1);

        for (int i = 0; i < N; i++) {
            System.out.println(points[i][0] + " " + points[i][1]);
        }
    }

    static void mergeSort(int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(start, mid);
        mergeSort(mid + 1, end);
        merge(start, mid, end);
    }

    static void merge(int start, int mid, int end) {
        int[][] temp = new int[end - start + 1][2];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (points[i][0] < points[j][0]) {
                temp[k++] = points[i++];
            } else if (points[i][0] == points[j][0]) {
                if (points[i][1] < points[j][1]) {
                    temp[k++] = points[i++];
                } else {
                    temp[k++] = points[j++];
                }
            } else {
                temp[k++] = points[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = points[i++];
        }

        while (j <= end) {
            temp[k++] = points[j++];
        }

        for (int l = 0; l < k; l++) {
            points[start + l] = temp[l];
        }
    }
}