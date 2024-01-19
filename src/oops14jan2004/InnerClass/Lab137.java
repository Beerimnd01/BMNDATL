package src.oops14jan2004.InnerClass;

public class Lab137 {
    public static void main(String[] args) {

        Thread t=  new Thread(){ //to cal anoy class methods in main we can use in thread
            @Override
            public void run(){
                System.out.println("I am a THREAD!");
            }
        };
        t.run();


    }

}
