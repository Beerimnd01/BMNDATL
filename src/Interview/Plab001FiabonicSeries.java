package src.Interview;

public class Plab001FiabonicSeries {
    public static void main(String[] args) {
        int l=0, m=1, n, count=10;
        System.out.print(l+""+m);
        for(int i=2;i<count;i++){
            n=l+m;
            System.out.print(""+n);
            l=m;
            m=n;
        }



    }
}
