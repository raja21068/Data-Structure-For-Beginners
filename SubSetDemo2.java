package DataStructure;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasak
 */
public class SubSetDemo2 {
    public static void main(String arg[]){
        String str = "abcd";
	int n = str.length();
        
	for(int i = 1; i < (1 << n); i++) {
//            System.out.print(i+" : ");
            for(int j = 0; j < n; j++) {
		if((i & (1 << j)) > 0) {
                    System.out.print(str.charAt(j));
//                    System.out.println(j);
                }
            }
            System.out.println();
	}
        
        /*for(int j=0; j<pluralWordLength; j++){                
            if(vector.size()==0){
                char ch1=pluralWord.charAt(j);
                vector.addElement(""+ch1);
                
                char ch2=pluralWord.charAt(j+1);
                vector.addElement(""+ch2);
                    
                vector.addElement(ch1+""+ch2);
                j++;
            }
            else{
                char ch3=pluralWord.charAt(j);
                vector.addElement(""+ch3);
                    
                int length=vector.size();
                for(int i=0; i<length-1; i++){
                    String temp=vector.elementAt(i);
                    temp+=ch3;
                    vector.addElement(temp);
//                    System.out.println(temp);
                }
            }
        }*/
    }    
}
