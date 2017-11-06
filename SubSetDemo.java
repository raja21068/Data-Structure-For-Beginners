package DataStructure;


/**
 *

 */
public class SubSetDemo {
    public static void main(String arg[]){
        String str="abcd";
        
        java.util.Vector<String> v=new java.util.Vector<String>();
        
        for(int j=0; j<str.length(); j++){                
            int length=v.size();
            char ch1=str.charAt(j);
            v.addElement(""+ch1);

            for(int k=0; k<length; k++){
                String s=v.elementAt(k);
                s+=ch1;
                v.addElement(s);
            }
        }

        for(int k=0; k<v.size(); k++){
            String s=v.elementAt(k);        
            System.out.println((k+1)+" : "+s);
        }        
    }
}
/* a
 * b
 * ab
 * c 
 * ac
 * bc
 * abc
 * d
 * ad
 * bd
 * abd
 * cd
 * acd
 * bcd
 * abcd
 */