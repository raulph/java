/**

CSE 17 Fall 2019
@author Raphael
IBL8
Program: RecursiveBinary

*/


public class RecursiveBinary {
  
  
  /**
    param: int [] list, int key, int low, int high
    returns: k value;

    Recursive Method that returns the k value.

  */
  public static int binarySearch(int [] list, int key, int low, int high){

    int mid = (low + high)/2; 
    int k = 0; 
    
    if(list[mid] == key){ // if it is found then return immediately
      k = mid; 
      return k;
    }else if (list[mid] > key) { // creates a new high and then call the method on itself
      high = mid - 1;
      k = binarySearch(list, key, low, high);
     
    } else if(list[mid] < key){ //creates a new low and calls the method on itself
      low = mid + 1;
      k = binarySearch(list, key, low, high);
     
    }else { // if it is not found
      System.out.println("Integer: " + key + " is not found.");
      return - 1; 
    }
  
      return k; // returning the value
  }
  
  
  public static void main(String [] args){
    
    // provided code
    int [] myList = {2, 4, 7, 9, 10, 11, 19, 29, 30}; 
    int key = 29;
    int indKey = binarySearch(myList, key, 0, myList.length - 1);
    System.out.println(indKey);
   
    
  }
}