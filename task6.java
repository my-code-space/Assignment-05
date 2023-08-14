import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter ASCII Sentence:");
        String sentence = scanner.nextLine();

        


        if(sentence.length()==0){
            System.out.print("Wrong Input");
        } else{
            String subString[] = sentence.split(" ");
            
            for(int i=0,j=subString.length-1;i<j;i++,j--){
                String temp = subString[i];
                subString[i] =subString[j];
                subString[j] = temp;
            }
            System.out.print(Arrays.toString(subString));
            
        }

    }
}
