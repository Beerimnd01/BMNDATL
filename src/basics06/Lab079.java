package src.basics06;

public class Lab079 {
    public static void main(String[] args) {
        int [] a={1,3,4,5};
                int [][]  array1= new int[3][3];
        int array2[][]=new int[3][3];
        //row 0 to 2
         array1 [0][0]=3;
         array1 [0][1]=5;
         array1 [0][2]=7;
        //Initializing 2nd Array/2nd Row
         array1 [1][0]=8;
         array1 [1][1]=3;
         array1 [1][2]=4;

        // Initializing 3rd Array/3rd Row
        array1[2][0] = 1;
        array1[2][1] = 43;
        array1[2][2] = 45;
        for(int i=0;i<a.length;i++){
            for(int j=0;j< array1.length;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println("");
        }
            }
        }





