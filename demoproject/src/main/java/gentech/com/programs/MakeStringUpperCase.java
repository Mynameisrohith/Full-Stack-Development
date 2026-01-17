package gentech.com.programs;

public class MakeStringUpperCase {
    public static void main(String[] args) {
        String str="rohith";
        char upper[]=str.toCharArray();

        for(char i:upper){
            if(i>='a'&&i<='z'){
                i= (char) (i-32);
            }
            System.out.print(i);
        }
    }
}
