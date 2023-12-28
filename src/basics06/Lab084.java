package src.basics06;

public class Lab084 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%3==0&&i%5==0){
                System.out.println("FIzz Buzz"+i);
            }
            else if (i%3==0){
                System.out.println("Fizz");

            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }

    }

}
