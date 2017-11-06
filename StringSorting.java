package DataStructure;

/**
 *

 */
public class StringSorting {
    public static void main(String arg[]){
        String str[]= {"kamran", "zas", "ali", "bit", "aaa", "abc"};
        
        for(int y = 0; y < str.length; y++){
            for(int x = 0; x < str.length - 1; x++){
                String s1 = str[x];
                String s2 = str[x + 1];
                
                int l = Math.min(s1.length(), s2.length());
        
                for(int i = 0; i < l; i++){
                    char ch1 = s1.charAt(i);
                    char ch2 = s2.charAt(i);
                    
                    if(ch1 == ch2) continue;
                    else if(ch1 > ch2){
                        str[x] = s2;
                        str[x + 1] = s1;
                    
                        break;
                    }else if(ch1 < ch2){
                        break;
                    }
                }
            }
        }
        
        for(int i = 0; i < str.length; i++){
            System.out.println(str[i]);
        }
    }
}
