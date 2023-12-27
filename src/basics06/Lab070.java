package src.basics06;

public class Lab070 {
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5};
        int array2[]={1,2,3,4,5};
        System.out.println(array1==array2);// false-campare with reference
        int []array3=array1;
        System.out.println(array1==array3);// true-campare with reference
        array3[0]=24;
        System.out.println(array1[0]);//-24
        System.out.println(array3[0]);//24
    }
}
