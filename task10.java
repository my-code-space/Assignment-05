import java.util.Arrays;
import java.util.Scanner;

public class task10 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        String num = scanner.nextLine();
        char[] chars = num.toCharArray();
        for(int i=0;i<chars.length;i++){

        if((chars[3]=='-') && chars.length==11){
            System.out.println("valid input");

            break;
        }else if((chars[3]==' ' && chars[6]==' ' ) && chars.length==14){
            System.out.println("valid input");
            break;
        }else{
            System.out.println("wrong input");
            break;
        }
        
        }
    }
}
