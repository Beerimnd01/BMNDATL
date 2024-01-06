package src.OOPS.Basics;

public class Lab109 {
    public static void main(String[] args) {


        // Immutable in nature (that can't changed)
        String password = "pass@123";

        // 1000 times I am going to change the password value
        // should I use the Sb, sb OR String

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);


        //       StringBuilder sb = new StringBuilder("message");
//       sb.append("123");
//       sb.append("456");
//        System.out.println(sb);

        String payload = "123";

        // 100 codde jave, not changing of payload
        // normal string is fine.


        // String, (new) -> concat
        // StringBuffer, Stringbuildet - append

    }
}
