/*

  CSE 17 Fall 2019
  @author Raphael Keele
  IBL 10
  Program: LinearSearch

*/

import java.util.*;

public class LinearSearch <E extends Comparable<E>> implements Comparable<LinearSearch<E>>{
  
  
  private E e; // declaring an E named e;
  
  /**
    params: none 
    Returns an E type called e.
  
  */
  public E getE(){ // returning the E; 
    return this.e; 
  }
  
   /**
    params: LinearSearch of type E 
    Returns an integer
    This method overrides the Compare to method in Comparable
  
  */
  
  @Override //overriding the Compare to method in Comparable
  public int compareTo(LinearSearch<E> o) {
    return getE().compareTo(o.getE());
   }
  
  
   /**
    params: int start, int end, Comparable [] list, Comparable key
    returns: int 
  
     This method looks through an array and returns the position of the key  
  */
  
  public static int RecursiveSearch(int start, int end, Comparable [] list, Comparable key){
        if( end < 1){ // if there is no elements left to search return -1
            return -1;
        }
        if(list[end].equals(key)){ // return if found immediately at the end 
            return end;
        }
        if(list[start].equals(key)){ // return if found immediately at the start
            return start; 
        }   
        return RecursiveSearch(start + 1, end -1, list, key); // keep changing the start and end values
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Integer [] list = new Integer [5]; // generating a list
        for(int i = 0; i < list.length; i++){ // making the user enter an element
          System.out.println("Enter element " + i);
          Integer num = input.nextInt(); 
          list[i] = num; 
        }
      //entering in a keyb
        System.out.println("Enter a number to search for in the array."); 
        Integer key = input.nextInt();
        System.out.println(Arrays.toString(list)); //printing array
        System.out.print("First Linear Search test: ");
        System.out.println(RecursiveSearch(0, list.length -1, list, key)); //printing the returns
        
        Double [] list2 = new Double [list.length]; 
      
        for(int i = 0; i < list2.length; i++){ //generating an array of Doubles
          list2[i] = list[i] * 22.0; 
        }
      
        Double key1 = list2[4];
        System.out.println(Arrays.toString(list2)); 
        System.out.println("The key is: " + key1);
        System.out.print("Second Linear Search test: ");
        System.out.println(RecursiveSearch(0, list2.length -1, list2, key1));


        String [] list3 = new String[list2.length]; // generating an Array of Strings
        for(int i = 0; i < list3.length; i++){
          list3[i] = "" + list2[i] * 3; 
        }
        
        String key2 = list3[2];
        System.out.println(Arrays.toString(list3)); 
        System.out.println("The key is: " + key2);
        System.out.print("Third Linear Search test: ");
        System.out.println(RecursiveSearch(0, list3.length -1, list3, key2));

      
      
    }
  
}