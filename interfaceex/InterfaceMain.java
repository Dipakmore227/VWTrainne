package interfaceex;

import java.util.Scanner;
public class InterfaceMain {

    public static void main(String[] args) {

         Bounceable bref;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color of ball:-");
                        
        String c = sc.next();
        
        bref = new Ball(c);  //2
        
        System.out.println("Enter bounce factor multiple for ball:-");
        
        int multiple = sc.nextInt();
        
        meth(bref,multiple);
        
        System.out.println("Enter color of Tyre:-");

        String tc = sc.next();
        
        bref = new Tyre(tc);
        
        System.out.println("Enter bounce factor multiple for Tyre");
     
        int multi = sc.nextInt();
        
        meth(bref,multi);
    }
    
    
    public static void meth(Bounceable b,int multiple)
    {
        b.setBounceMultiple(multiple);
        b.bounce();
        
    }

}