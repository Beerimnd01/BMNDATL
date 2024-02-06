package src.Interview;

import java.util.Scanner;

public class VowelesCount {
    public static void main(String[] args) {
        int Vowels = 0;
        int NonVowels = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name");
        String name = sc.nextLine();
        name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {

            char c = name.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                Vowels=Vowels+1;
            }else {
                NonVowels= NonVowels+1;
            }
        }
        System.out.println(Vowels);
        System.out.println(NonVowels);
    }
}
