package DataStructure;


public class SelectionSort {
    public static void main(String arg[]){
        //             0   1   2   3   4   5   6   7
        int data[] = {11, 33, 44, 77, 88, 22, 66, 55};
        int index = 0;
        for(int i = 0; i < data.length-1; i++){
            int repIndex = min(data[index], i, data);
            if(repIndex == -1){
                index += 1;
                continue;
            }
            int temp = data[index];
            data[index] = data[repIndex];
            data[repIndex] = temp;
            index += 1;
        }
        for(int j = 0; j < data.length; j++){
            System.out.print(data[j]+", ");
        }
    }
    private static int min(int item, int start, int data[]){
        int index = -1;
        for(int i = start; i < data.length; i++){
            if(item > data[i]){
                item = data[i];
                index = i;
            }
        }
        return index;
    }
}