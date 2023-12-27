package src.basics03;

public class Lab037 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // Part - A ( Exp = 11, a = 11  ) -> ++a -> O/P -> 11
        // Part - B ( Exp = 11, a = 12  ) -> a++ -> O/P -> 11
        // Part - C ( Exp = 12, a = 13  ) -> a++ -> O/P -> 12
        // A+B+C -> 11+11+12 -> 34, a -> 13

        int b = 10;
        System.out.println(++b + b++);
        System.out.println(b);

        // A - ++b -> Exp - 11 , b -> 11
        // B - b++ -> Exp - 11 , b -> 12
        // A+B -> 22
        /// b -> 12
    }
}
