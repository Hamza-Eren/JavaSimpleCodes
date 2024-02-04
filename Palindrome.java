// @author HamzaEren
package github;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    static boolean isPol(String word){
        String str= word;
        String nstr="";
        char ch;
        
        for (int i=0; i<str.length(); i++){
            ch = str.charAt(i);
            nstr = ch+nstr;
        }
        return nstr.toLowerCase().equals(word.toLowerCase());
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Kelime: ");
        String word = scan.nextLine();
        System.out.println(isPol(word));
    }
}
