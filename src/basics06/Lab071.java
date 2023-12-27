package src.basics06;

public class Lab071 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,53};
        System.out.println(array1.length);
        System.out.println("Ref Adress-->"+array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.println(array1[i]);
        }
    }
}
