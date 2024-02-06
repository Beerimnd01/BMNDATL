package src.Interview;

public class CountReplace {
    public static void main(String[] args) {
        String name="Java is my Programming Language";
        int totalCount= name.length();
        System.out.println(totalCount);
      int countwithouta=  name.replace("a","").length();
        System.out.println(countwithouta);
      int count=(totalCount-countwithouta);
        System.out.println(count);

    }
}
