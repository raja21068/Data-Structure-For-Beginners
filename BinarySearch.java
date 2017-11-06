package DataStructure;

public class BinarySearch {
    public static void main(String arg[]){
        //                    0  1  2  3  4  5  6  7  8  9 10 11 12
        int data[]=new int[]{11,22,30,33,40,44,55,60,66,77,80,88,99};
        int item=40, index;
        //    0     12
        int beg=0, end = data.length-1;
        //    6
        int mid = (beg + end) / 2;
        
        while(beg <= end && data[mid] != item){
            if(item < data[mid])
                end = mid - 1;
            else
                beg = mid + 1;

            mid=(beg + end) / 2;
        }
        if(data[mid]==item)
            index=mid;
        else index=-1;

        System.out.println(index);
    }
}
