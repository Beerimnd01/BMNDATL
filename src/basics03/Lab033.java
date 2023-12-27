package src.basics03;

public class Lab033 {
    public static void main(String[] args) {


        // Ternary operator.

        //int a =  condition ?  if this is true print do this :  If false do this

        int a = true ? 10 : 20;
        int a1 = (30 > 40) ? 10 : 20;
        System.out.println(a);
       System.out.println(a1);

        String str = 10 > 20 ? "10" : "TWENTY";
        System.out.println(str);


        String anil_status = true ? "Yes" : "No";
        System.out.println(anil_status);

        int s1 = 10;
        int s2 = 20;
        int max = s1< s2 ? s2 : s1;
        int min = s1< s2 ? s1 : s2;;
        System.out.println(max);
        System.out.println(min);
    }
}
