package gentech.com.programs;

public class ReverseString {

    public static void main(String[] args) {
        String str="rohith";
        char reverse[]=str.toCharArray();
        for(int i=reverse.length-1;i>=0;i--){

            System.out.print(reverse[i]);
        }
    }
}
