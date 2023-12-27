package src.basics05;

public class Lab055 {
    public static void main(String[] args) {

        // for( A ;B ; C)
        // A -> Initialization -> JVM What variable, where you are starting point
        // B - Condition -> When you want this to stop.
        // C ->  Increment / Decrement

        // ICID ->
        for(int i=1; i<=10;i++){
            System.out.println("Beeri");
        }System.exit(-1);

        // // Exit Code - 0 Normal,
        // 1 Force Exit, 130-137 You do it - User interrupted
        final boolean b1 = true;
        //b1=false;
        for (float f = 0; b1; ) //infinate loop
            System.out.println("TTA");
    }
}
