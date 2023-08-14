import java.util.Arrays;

public class task8_3 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        String num = "";

        for(int i=0;i<numA.length;i++){
            num += numA[i]/numB[i]+"";
            
        }
       System.out.print(num);
    }
    }

   // System.out.print(Arrays.toString(myArray));


