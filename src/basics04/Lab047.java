package src.basics03.basics04;

import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the vowel");
        char vowel=sc.nextLine().toCharArray()[0];
        switch(vowel){
            case 'A':
                System.out.println("Vowel Char-->A");
            break;
            case 'E':
                System.out.println("Vowel Char-->E");
                break;
            case 'I':
                System.out.println("Vowel Char-->I");
                break;
            case 'o':
                System.out.println("Vowel Char-->o");
                break;
            case 'U':
                System.out.println("Vowel Char-->U");
                break;
            default: System.out.println("consont");




        }

    }

}
