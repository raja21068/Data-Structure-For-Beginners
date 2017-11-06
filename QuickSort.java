package DataStructure;



public class QuickSort {
    public static void main(String arg[]){
        int data[] = {12,9,4,99,120,1,3,10,13};

        System.out.println(" Quick Sort");
        
        System.out.println("Values Before the sort:");        
        for(int i = 0; i < data.length; i++)
            System.out.print(data[i]+"  ");
        
        System.out.println();
        data = quickSort(data, 0, data.length-1);
        
        System.out.print("Values after the sort:\n");
        for(int i = 0; i <data.length; i++)
            System.out.print(data[i]+"  ");
        
    }

    private static int[] quickSort(int data[], int beg, int end){
        int left = beg,
            right = end;
        int pivot = beg;
        
        if(left >= right) return data;
        
        boolean b = true;
        
        while(b){
            b = false;
            
            for(int i = right; i >= pivot; i--){ //right to left
                if(data[i] < data[pivot]){
                    data = swap(data, pivot, i);
                    pivot = i;
                    b = true;
                    break;
                }
            }
            
            for(int i = left; i <= pivot; i++){ //left to right 
                if(data[i] > data[pivot]){
                    data = swap(data, pivot, i);
                    pivot = i;
                    b = true;
                    break;
                }
            }
        }// end while
        data = quickSort(data, beg, pivot - 1);
        data = quickSort(data, pivot + 1, end);
        return data;
    }
    
    private static int[] swap(int data[], int source, int dest){
        int temp = data[source];
        data[source] = data[dest];
        data[dest] = temp;
        
        return data;
    }
}