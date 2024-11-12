// ## Write a Java program to print the multiplication table of a given number using loops.

import java.util.Scanner;

public class lop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("print the num.");
        int num1 = scanner.nextInt();

        for(int i= 1; i<=10; i++){
            System.out.println(num1 + "x" + i+ "="+ i*num1);

        }
        scanner.close();
        
        
    }

    
}
