package src.Interview;

public class CharcountStringBuilder {
    public static void main(String[] args) {
        int count=0;

        StringBuilder sb= new StringBuilder("Beeraiah");
        for(int i=0;i<= sb.length()-1;i++) {
            char c= sb.charAt(i);

                if (c=='e') {
                    count++;

                }
            System.out.println(c+" "+ count);



    }


    }
}
