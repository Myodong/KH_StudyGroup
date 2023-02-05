package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		

	        String[] arr = new String[] {"10", "15", "30", "55"};

	        Integer[] newArr = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

	        // output
	        System.out.println(Arrays.asList(newArr));
	}
}
