package src.oops14jan2004.InnerClass;

public class Lab134 {
    public static void main(String[] args) {
        OCC ooc = new OCC();
        OCC.SNCI icref= new OCC.SNCI();
        //inner class is Static in nature no need use outer class reference to create object to call inside method;
        icref.show();
    }


}
class OCC{
    static int o=100;
    int a=99;
    static class SNCI{
        void show(){

            //System.out.println(a); //local variables are not used in
            System.out.println(o);
        }
    }
}
