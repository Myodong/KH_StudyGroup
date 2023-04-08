package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Test4 {
		
	    int top;
	    int size;
	    int [] stack;

	    public void UserArrayStack(int size) {
	        this.size = size; //
	        stack = new int[size];
	        top = -1; // top 의 값 초기화
	    }

	    private void push(int item) {
	        stack[++top] = item;
	        System.out.println(stack[top] + " push!");
	    }

	    private void peek() {
	        System.out.println(stack[top] + " peek!");
	    }

	    private void pop() {
	        System.out.println(stack[top] + " pop!");
	        stack[top--] = 0;
	    }

	    private int search(int item) {
	        for (int i = 0; i <= top; i++) { // for 문은 top 만큼
	            if (stack[i] == item)
	                return (top - i) + 1; // top - 탐색한 배열의 인덱스, 배열 이므로 +1 추가
	        }
	        return -1;
	    }

	    private boolean empty() {
	        return size == 0;
	    }
	    
	    private boolean contains(int item) {
	        for(int s : stack) {
	            if(s == item) return true;
	        }
	        return false;
}
}