package test;



public class Test {


	    public static void main(String[] args) {
	    	for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 7; j++) {
	                if (i == 0) {
	                    if (j == 0 || j == 6) {
	                        System.out.print("\\");
	                    } else {
	                        System.out.print(" ");
	                    }
	                } else if (i == 1) {
	                    if (j == 0 || j == 6) {
	                        System.out.print("'");
	                    } else {
	                        System.out.print(" ");
	                    }
	                } else if (i == 2) {
	                    if (j == 0) {
	                        System.out.print("(");
	                    } else if (j == 6) {
	                        System.out.print(")");
	                    } else {
	                        System.out.print(" ");
	                    }
	                } else if (i == 3) {
	                    if (j == 2) {
	                        System.out.print("/");
	                    } else if (j == 4) {
	                        System.out.print("|");
	                    } else {
	                        System.out.print(" ");
	                    }
	                }
	            }
	            System.out.println();
	        }
	    }




}