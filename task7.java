import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a ASCII Sentence:");
        String sentence = scanner.nextLine();

        if(sentence.length()==0){
            System.out.print("Invalid input");
        }else{
            String subString[] = sentence.split(" ");
           

            
           String b = subString[0];
           String c =  subString[0];
           
            for(int i=1; i<subString.length;i++){
                int a = subString[i].length();
                if(b.length()>a){
                    b = subString[i];
                    
                    System.out.println(subString[i]);
                }else if(c.length()<a){
                    c = subString[i];
                    
                }
            }

            System.out.println("Shortest word = "+b+" ,shortest length ="+b.length());
            System.out.println("longest word = "+c+" ,longest length = "+c.length());
            
        }
    }
}
