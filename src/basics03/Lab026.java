package src.basics03;

public class Lab026 {
    public static void main(String[] args) {
        byte b=10;
        //int a=b; //implicit casting
        int a=(int) b; //explicit casting
        int a1=300;
        byte b1=(byte)a1;
        System.out.println(b1);
        // 32 Bits
        // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1
        // will be sotred into the b
        // 0 0 1 0 1 1 0 0
//        0 * 27 + 0 * 26 + 1 * 25 + 0 * 24 + 1 * 23 + 1 * 22 + 0 * 21 + 0 * 20
//        0 + 0 + 32 + 0 + 8 + 4 + 0 + 0
        //44

    }
}
