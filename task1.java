import java.util.Scanner;

public class task1{
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number:");
        int num = scanner.nextInt();
        
        int i=0;
        int t1=0;
        int t2=1;
        
        do{
            
            i = t1+t2;
            System.out.print(i+" ");
            t1 = t2;
            t2 = i;
            i++;
        }while(i<num);



    }
}