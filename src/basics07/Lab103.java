package src.basics07;

public class Lab103 {
    public static void main(String[] args) {
        String name="Beeraiah";
        char [] arrayChar=name.toCharArray();
        System.out.println(arrayChar.length);
        int left=0;
        int right= arrayChar.length-1;
        while(left<right){
            char temp=arrayChar[left];
            arrayChar[left]= arrayChar[right];
           arrayChar[right]=temp;

            left++;
            right--;
        }
 String rev_name=new String(arrayChar);
        System.out.println(rev_name);
    }
}
