package DataStructure;


public class BitTest {
    public static void main(String arg[]){
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(20));
        System.out.println(Integer.toOctalString(10));
        int a = -1;
        a |= ( 2 > 2 ) ? 1 : 0;
        System.out.println(a);  // prints "2"
	System.out.println(9 & 7);  // prints "2"
	System.out.println(1 | 2);  // prints "2"
	System.out.println(3 ^ 2);  // prints "2"
    }
}
