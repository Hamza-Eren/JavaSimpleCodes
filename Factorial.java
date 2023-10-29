// @author HamzaEren
package github;

import java.util.Scanner;

public class Factorial {
    static int Factorial(int number){
        int result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Faktöriyelini istediğiniz sayı: ");
        int num = scan.nextInt();
        System.out.println(Factorial(num));
    }
}
