package src.Practice;

public class Plab003 {
    public static void main(String[] args) {
        Integer a=300;
        Integer b=300; // output: "not equal" wrapper class create objects which we should not compare with "==" (Campre operater)
        if (a==b){  // Integer cache memory However, for Integer values outside the range of -128 to 127 (inclusive),
            System.out.println(a);
            System.out.println(b);
        }
       else{
            System.out.println("not equal");
        }

        if (a.equals(b)){
            System.out.println(a);
            System.out.println(b); //300 300
        }
        else{
            System.out.println("not equal");
        }
    }
}
