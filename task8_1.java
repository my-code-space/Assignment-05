import java.util.Arrays;

public class task8_1 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        int[] myArray=new int[0];
        for(int i=0;i<numA.length;i++){
            
            for(int j=0;j<numB.length;j++){
                if(numA[i]==numB[j]){
                  int[] temp = new int[myArray.length+1];  
                  for(int k=0;k<myArray.length;k++){
                    temp[k] = myArray[k];
                  }
                  temp[temp.length-1]=numB[j];
                  myArray = temp;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));
    }
}
