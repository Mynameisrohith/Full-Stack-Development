package gentech.com.programs;

public class Fibonnaci {

    public static void main(String[] args) {
        int f=0;
        int f1=1;
        int n=20;
        System.out.println(f);
        for(int j=1;j<=n;j++){
            int f2=f+f1;
            System.out.println(f1);
            f = f1;
            f1 = f2;
        }
    }
}
