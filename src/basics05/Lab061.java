package src.basics05;

public class Lab061 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println(i);
            if (i == 5) continue;
            System.out.println("after5");
        }


            for (int j = 1; j <= 10; j++) {
                if (j % 2 == 0) {
                    System.out.println("Val Even of ->" + j);
                    continue;
                }
                System.out.println("Val Odd of -> " + j);
            }
        }
    }

