package src.oops13jan2024.encapusalation.GS;

public class ICICBank {
    public String getName(){

        return name;

    }
    public ICICBank(String name,long bal){
        this.name=name;
        this.bal=bal;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getBal() {
        return bal;
    }
    public void setBal(long bal) {
        if(bal > 0) {
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed!!");
        }
    }
    String name;
    long bal;
}
