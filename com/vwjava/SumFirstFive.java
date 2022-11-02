package com.vwjava;

import java.util.Scanner;

public class SumFirstFive {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int seed = sc.nextInt();
        int sum =0;
        int ct=0;
        
     
        
        while(ct<5)
        {
            
          System.out.println("seed="+seed);    
          sum +=seed; //10
          System.out.println("sum="+sum);    
          seed++;  
          
          ct++;
        }
        
        System.out.println("final sum:="+sum);
	}
}
