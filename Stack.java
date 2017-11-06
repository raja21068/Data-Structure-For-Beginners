package DataStructure;

/**
 * Created on Oct 7, 2011, 1:56:48 AM
 * 

 */

public class Stack<E> extends java.util.Vector<E>{
    
    public Stack(){
        super();
    }
    
    public synchronized void push(E item){
        super.addElement(item);
    }
    
    public synchronized E pop(){
        E item = null;
        if(!super.isEmpty()){
            item = super.elementAt(super.size()-1);
            super.removeElementAt(super.size()-1);
        }
        return item;
    }
    
    public synchronized E peek(){
        if(super.isEmpty())
            throw new java.util.EmptyStackException();
        return super.elementAt(super.size()-1);
    }
    
    public synchronized int search(E item){
        int i = super.lastIndexOf(item);
        
        if(i >= 0)
            return super.size() - i;
        
        return -1;
    }
    
    public synchronized boolean isStackEmpty(){
        return super.isEmpty();
    }
}