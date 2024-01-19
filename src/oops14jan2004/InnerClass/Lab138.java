package src.oops14jan2004.InnerClass;

public class Lab138 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() { ////to cal anoy class methods in main we can use in thread
            @Override
            public void run() {
                System.out.println("I am THREAD!!");
            }
        };



    }
}

