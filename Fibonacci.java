// @author HamzaEren
package github;

import java.util.Scanner;

public class Fibonacci {
    public static void Fibonacci(int limit){
        int num1 = 1, num2 = 1;
        int counter = 0;
        
        while (counter < limit) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
	    num1 = num2;
	    num2 = num3;
            counter = counter + 1;
	}
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Limit: ");
        int limit = scan.nextInt();
        Fibonacci(limit);
	}
}
