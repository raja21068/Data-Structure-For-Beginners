package DataStructure;

public class BubbleSort {
    public static void main(String arg[]){
        int data[]={5,9,2,7,1,3,4,8,6,10};
        
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length-1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i]+", ");
        }
    }
}
