package src.oops08jan24.Inheritance;

public class Lab119 {
    public static void main(String[] args) {
        BankAccount BA=new BankAccount();
        BA.printDetails();
        System.out.println(" ----  ---- ");
        BankAccount BA1=new BankAccount("Hdfc","Hdfc001");
        BA1.printDetails();
        System.out.println(" ----  ---- ");

        BankAccount BA2=new BankAccount("icici","icici001");
        BA2.bankCode="ICIC002";
        BA2.printDetails();

        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();
    }
}
