package src.oops08jan24.Inheritance.multilevel;

public class Programming {
    //String Name;
    int version;
    String author;
    Programming(){
        System.out.println("DC");
    }
    Programming(String author,int version){
        this.author=author;
        this.version=version;
    }
    void printInfo(){
        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
    }

    void car(){
        System.out.println("Lambo");
    }

    void bhk3(){
        System.out.println("3BHK");
    }
}
