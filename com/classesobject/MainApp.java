package com.classesobject;

public class MainApp {
	
	 static Employee e1 = new Employee(1, "Mayur", 124565, 2);

	public static void main(String[] args) {
		
		Employee e = new Employee(2,"Dipak More",15670,2);
		System.out.println(e1.toString());
		System.out.println(e.toString());
		
        
        double annsal =  e1.calcAnnSal();
        System.out.println(annsal);
        
       // System.out.println(e1.calcAnnSal());
       
        
           Employee e3 = new Employee(3,"Paras Joshi",10000,20);
           
           annsal = e3.calcAnnSal(5000);
            System.out.println(annsal);
            
            
         // Employee e4 = new Employee(e3);
		
	}
	

}
