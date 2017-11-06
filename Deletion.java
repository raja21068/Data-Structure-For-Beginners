package DataStructure;


public class Deletion {
    public static void main(String arg[]){
        int a[] = new int[]{1,2,3,4,5};
        int len = a.length;
        int index = 0;
        for(int i = 0; i < len; i++){
            if(i == index){
                for(int j = i; j < len-1; j++)
                    a[j] = a[j+1];
                len--;
            }
        }
        for(int i = 0; i < len; i++){
            System.out.println(a[i]);
        }
    }
}
