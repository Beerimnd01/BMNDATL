package src.basics05;

import java.text.BreakIterator;

public class Lab057 {
    public static void main(String[] args) {
        System.out.println("print the values uptpo 5 and  break ");
        for(int i=0;i<10;i++){
            if(i==5) {


                break;
            }
            //System.out.println(i);
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Val of " + i);
            if (i == 5) {
                break;
            }
        }
        System.out.println("end");

        }
    }

