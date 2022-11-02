package com.vwjava;

import java.util.Scanner;

public class AdditionEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eSum=0 ,oSum=0;
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				eSum +=i;
			}
			else {
				oSum +=i;
			}
		}
		System.out.println("1st Five Even number Sum:- "+eSum);
		System.out.println("1st Five Odd number Sum:- "+oSum);

	}
}
