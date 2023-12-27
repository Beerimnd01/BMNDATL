package src.basics06;

public class Lab073 {
    public static void main(String[] args) {
        int array1[]={23,44,55,55,67};
                float f_array2[]={23.45F, 45.56F,46.78F };
                double d_array3[]={34.455,34.234,56.6798,};
                long l_array4[]={234,567,432,789};

        boolean[] b_array = {true,false,true,false};
        char[] c_array = {'A','B','D'};
        String[] names = {"beeri","Amit","Alok"};

        System.out.println(array1.length);
        System.out.println(names.length);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
