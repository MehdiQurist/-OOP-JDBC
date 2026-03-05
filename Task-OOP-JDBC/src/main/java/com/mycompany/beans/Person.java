package beans;

import java.util.Scanner;

public abstract class Person {

    protected int customerNo;
    protected String customerName;

    protected abstract double getCreditLimit();

    
    Scanner sc = new Scanner(System.in);
        
        String username = sc.nextLine();

}
