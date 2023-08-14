import java.util.Arrays;

public class task8_4 {
    public static void main(String[] args) {
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        
        int[] myArray1=new int[0];
        loop:
        for (int a = 0; a < numA.length+numB.length; a++) {
            if(a<numA.length){
                
                for (int b = 0; b < myArray1.length; b++) {
                    if(numA[a]==myArray1[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray1.length+1];  
                for(int k=0;k<myArray1.length;k++){
                    temp[k] = myArray1[k];
                }
                temp[temp.length-1]=numA[a];
                myArray1 = temp;


                    
                
            }else{
                for (int b = 0; b < myArray1.length; b++) {
                    if(numB[a-numA.length]==myArray1[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray1.length+1];  
                for(int k=0;k<myArray1.length;k++){
                    temp[k] = myArray1[k];
                }
                temp[temp.length-1]=numB[a-numA.length];
                myArray1 = temp;

            }
        }




       

        int[] myArray2=new int[0];
        for(int i=0;i<numA.length;i++){
            
            for(int j=0;j<numB.length;j++){
                if(numA[i]==numB[j]){
                  int[] temp = new int[myArray2.length+1];  
                  for(int k=0;k<myArray2.length;k++){
                    temp[k] = myArray2[k];
                  }
                  temp[temp.length-1]=numB[j];
                  myArray2 = temp;
                }
            }
        }

        int[] myArray3 = new int[0];
        loop:
        for (int a = 0; a < myArray1.length+myArray2.length; a++) {
            if(a<myArray1.length){
                
                for (int b = 0; b < myArray3.length; b++) {
                    if(myArray1[a]==myArray3[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray3.length+1];  
                for(int k=0;k<myArray3.length;k++){
                    temp[k] = myArray3[k];
                }
                temp[temp.length-1]=myArray1[a];
                myArray3 = temp;


                    
                
            }else{
                for (int b = 0; b < myArray3.length; b++) {
                    if(myArray2[a-myArray2.length]==myArray3[b]){
                        continue loop;
                    }
                }
                
                    
                int[] temp = new int[myArray3.length+1];  
                for(int k=0;k<myArray3.length;k++){
                    temp[k] = myArray3[k];
                }
                temp[temp.length-1]=myArray2[a-myArray1.length];
                myArray3 = temp;

            }
        }
        


       System.out.print(Arrays.toString(myArray3));

                }
            }
        
