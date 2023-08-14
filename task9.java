import java.util.Arrays;
import java.util.Scanner;

public class task9 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a word");
        String word = scanner.nextLine();

       char[] chars = word.toCharArray();
        for(int i=0,j=chars.length-1;i<j;i++){
            if(chars[i]==chars[j]){
                System.out.println("palindrome");;
            }
            }
        }
        
}
