package src.OOPS.Basics;

public class Lab106 {
    public static void main(String[] args) {
        String name="Mahesh";
        System.out.println(name.concat("mandadi"));
        System.out.println(name.contains("a"));
        System.out.println(name+"man");
        System.out.println(name);
        String name2="mandadi";

                String password1="ma!@123";
        String password2="Ma!@123";
        System.out.println(password1==password2);//false case sensitive
        System.out.println(password1.equals(password2)); //false case sensitive
        System.out.println(password1.equalsIgnoreCase(password2)); //true ignore
        if(password1==password2){ //false case sensitive
            System.out.println("yes");
        }


    }
}
