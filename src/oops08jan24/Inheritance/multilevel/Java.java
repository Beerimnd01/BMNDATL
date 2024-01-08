package src.oops08jan24.Inheritance.multilevel;

public class Java extends Programming {
    String newFeature;

    Java() {
        System.out.println("Java DC");
    }

    Java(String Feature) {
        this.newFeature = Feature;
    }

    void printInfo() {
        System.out.println("Feature is -> " + this.newFeature);
        System.out.println("Feature is -> " + this.newFeature);

    }
}
