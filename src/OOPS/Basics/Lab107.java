package src.OOPS.Basics;

public class Lab107 {
    public static void main(String[] args) {

        String s1 = "Pramod";//String constant pool
        String s2 = new String("Pramod");//object area
        String s3 = new String("pramod");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));//Check the values only for equal case


        System.out.println(s1.equalsIgnoreCase(s3)); //Check the values only for equal case and ignore case sensitive
    }
}
