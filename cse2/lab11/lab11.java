import java.util.Arrays;

public class lab11 {
  
  
  public static void main(String [] args) {
    
    int [] unsorted = {9, 8, 7, 6, 5, 4, 3, 2, 1};
 
    
    
     
    int iterworst = insertionsort(unsorted); 
    
    System.out.println("The total number of iterations is: " + iterworst);
    
  }
  
  public static int insertionsort(int [] list) {
    
    
    System.out.println(Arrays.toString(list)); 
    int iterations = 0; 
    
    for (int i = 1; i <list.length; i++) {
      
      iterations++; 
      int j = i; 
     while (j > 0) {
       
       int currentmem = list[j]; 
       int previousmem = list[j - 1];
        
        if(currentmem < previousmem){
          int temp = list[j - 1]; 
          list[j -1] = list[j]; 
          list[j] = temp;
          iterations++; 
          
        }
       
       j--;
        
        
      }
      System.out.println(Arrays.toString(list)); 
    }
    
    return iterations;

  } 
  
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
