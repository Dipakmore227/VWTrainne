package com.vwjava;

import java.util.Scanner;

public class Staticnonstatic {

	public static void main(String[] args) {
		
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter full name:");
        String name = sc.nextLine();
        
        //call a member function
        Staticnonstatic ob = new Staticnonstatic();
               ob.greet(name);
        
        //calling a static function
        greet1(name);
        
        ob.greet1(name);
        ob.display();
        sc.close();
        
        System.out.println("remaining program continues");
        
        
    }
    
    
    
    public void greet(String name)
    {
        System.out.println("Hello "+name);
    }
    
    public static void greet1(String name)
    {
        System.out.println("Hello "+name);
	}

    public static void  display()
    {
    	System.out.println("this is static method");
    }
}
