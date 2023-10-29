// @author HamzaEren
package github;

import java.util.Scanner;

public class Armstrong {
    public static boolean Armstrong(int number){
        int toplam = 0;
        char[] arr = Integer.toString(number).toCharArray();
        for (char x : arr){
            toplam += Math.pow(Integer.parseInt(String.valueOf(x)), arr.length);
        }
        
        return number == toplam;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Sayı: ");
        int number = scan.nextInt();
        System.out.println(Armstrong(number));
    }
}
