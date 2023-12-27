package src.basics03;

public class Lab038 {
    public static void main(String[] args) {

        int b = 10;
        System.out.println(--b + b--);
        System.out.println(b);

        int c = 10;
        System.out.println(--c + c++ + ++c);
        System.out.println(c);

        // A -> --c , Exp ->9 , c ->9
        // B -> c++ , Exp 9 , c->  10
        // C , Exp -> 11 , c - 11
    }
}
