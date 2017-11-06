package DataStructure;


public class RecursiveFunctions {
    
    public static void main(String arg[]){
//        int count = fibnocci(5, 0, 1);
        prime(20);
//        System.out.println(count);
    }
    
    public static int add(int count){
        if(count > 1)
            count += add(--count);
        return count;
    }
    public static int multi(int count){
        if(count > 1)
            count *= multi(--count);
        return count;
    }
    public static int square(int base, int pow){
        if(pow > 1)
            base *= square(base, --pow);
        return base;
    }
    public static int factorial(int no){
        if(no > 1)
            no *= factorial(--no);
        return no;
    }
    public static int fibnocci(int end, int f, int s){
        System.out.print(f+",");
        
        if(end == f+s){
            return f+s;
        }
        int current = fibnocci(end, s, f+s);
        return current;
    }
    
    private static void prime(int num){
	if(num > 1){
	     prime(num-1);
	}
	int count = 0;
        for(int j=1; j<=num; j++){
	    if(num%j==0)
                count++;

            if(count > 2){
		return;
            }
	}
        System.out.println(num);
    }
}
