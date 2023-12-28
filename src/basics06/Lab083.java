package src.basics06;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the P value");
        String P_value=sc.nextLine();
        String R_value="";
        int Strlength=P_value.length();
        for (int i = (Strlength-1); i>=0;i--){
            R_value=R_value+P_value.charAt(i);
        }
if(R_value==P_value){
    System.out.println("palindrom");
}
else {
    System.out.println("not a palindrom");
}


    }
}
