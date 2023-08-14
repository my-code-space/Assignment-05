import java.util.Arrays;

public class task8_2 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        int[] myArray=new int[0];
        loop:
        for (int a = 0; a < numA.length+numB.length; a++) {
            if(a<numA.length){
                
                for (int b = 0; b < myArray.length; b++) {
                    if(numA[a]==myArray[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray.length+1];  
                for(int k=0;k<myArray.length;k++){
                    temp[k] = myArray[k];
                }
                temp[temp.length-1]=numA[a];
                myArray = temp;


                    
                
            }else{
                for (int b = 0; b < myArray.length; b++) {
                    if(numB[a-numA.length]==myArray[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray.length+1];  
                for(int k=0;k<myArray.length;k++){
                    temp[k] = myArray[k];
                }
                temp[temp.length-1]=numB[a-numA.length];
                myArray = temp;

            }
        }
        


       System.out.print(Arrays.toString(myArray));
            
     

    }
}
