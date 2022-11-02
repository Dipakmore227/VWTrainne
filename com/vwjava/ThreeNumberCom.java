package com.vwjava;

import java.util.Scanner;

public class ThreeNumberCom {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	    
		String ans = a > b ? a > c ? a+" is greatest" : c+" is greatest" : b > c ? b+" is greatest" : c+" is greatest";
	    System.out.println(ans);
	    sc.close();
	}
}
