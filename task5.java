import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter ASCII Character:");
        String x = scanner.nextLine();

        if(x.length()==0){
            System.out.print("Invalid input");
        }else{
            char[] chars = x.toCharArray();
            
            for(int i=0,j=chars.length-1;i<j;i++,j--){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }
            System.out.print(Arrays.toString(chars));
        }

    }
}
