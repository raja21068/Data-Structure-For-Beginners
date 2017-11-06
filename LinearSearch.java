package DataStructure;

public class LinearSearch {
    public static void main(String arg[]){
        int data[]=new int[]{11,22,30,40,44,55,60,66,77,44,88,99};
        int item=44, index;

        for(int i=0; i<data.length; i++){
            if(data[i]==item){
                index = i;
                System.out.println(index+" : "+item);
            }
        }
    }
}
