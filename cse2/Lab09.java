import java.util.*;


public class Lab09 {
  public static void main (String [] args ) {
    
    
    
    
   Scanner input = new Scanner(System.in);
    
   System.out.println("Would you like to perfom a linear search or binary search. L for linear, B for binary."); 
    String option = input.nextLine(); 
    
    while(!option.equals("L") && !option.equals("B")) {
      System.out.println("This is not a valid option, please input L or B."); 
      option = input.nextLine();
    }
    
   if(option.equals("L")) {
     System.out.println("Input an array length."); 
     int length = input.nextInt();
     
     while(length < 0) {
       System.out.println("This is not a valid integer, please input again.");
       length = input.nextInt();
     }
   
   int [] firstarray = new int [length]; 
     
     System.out.println("The array: ");
     
     for(int i = 0; i < firstarray.length; i++) {
       
       firstarray[i] = LinearArray(firstarray);
       
       System.out.print(firstarray[i] + " ");
       
     }
     System.out.println();
     
     
     System.out.println(" "); 
     System.out.println("Enter a term to search");
     
     int term = input.nextInt(); 
     
     
     while(term < 0) {
       System.out.println("This is not a valid integer, please input again.");
       term = input.nextInt();
     }
     
     int number = LinearSearch(firstarray, term); 
     
     if (number == -1) {
       System.out.println(number + ": The number is not found.");
     } else if (number != -1) {
       System.out.println("The term " + term + " is found at: " + number); 
     }
   
   } else if (option.equals("B")) {
     
     System.out.println("Input an array length."); 
     int length = input.nextInt();
     
     while(length < 0) {
       System.out.println("This is not a valid integer, please input again.");
       length = input.nextInt();
     }
   
   int [] firstarray = new int [length]; 
     
     System.out.println("The array: ");
     
     for(int i = 0; i < firstarray.length; i++) {
       
       firstarray[i] = BinaryArray(firstarray);
       
     }
     
     
     Arrays.sort(firstarray);
     
     for(int i = 0; i < firstarray.length; i++) {
       
       System.out.print(firstarray[i]+ " "); 
     }System.out.println();
     
     
     System.out.println(" "); 
     System.out.println("Enter a term to search");
     
     int term = input.nextInt(); 
     
     
     while(term < 0) {
       System.out.println("This is not a valid integer, please input again.");
       term = input.nextInt();
     }
     
     
     int number = BinarySearch(firstarray, term); 
     
     if (number == -1) {
       System.out.println(number + ": The number is not found.");
     } else if (number != -1) {
       System.out.println("The term " + term + " is found at: " + number); 
     }
     
   }
    
  }
  
  
  public static int LinearArray(int [] x) { // method A 
    
    int val = 0; 
    for (int i = 0; i < x.length; i++) {
      x[i] = (int) (Math.random() * 100 + 1);
      val = x[i];
     
    }
    
    
    return val;
    
  }
  
  
  public static int BinaryArray(int [] x) {
    
    
    Arrays.sort(x);
    
    int val = 0; 
    for (int i = 0; i < x.length; i++) {
      x[i] = (int) (Math.random() * 100 + 1);
      val = x[i];
     
    }
    
    
    return val;
  }
  
  
  
  
  public static int LinearSearch (int [] nums, int term) { //method C
  
    
    int val = 0; 
    
    
    for(int index = 0; index < nums.length; index++) {

      if (nums[index] == term) {
        return index;
      }
    }
    return -1;
  }
  
  
  
  public static int BinarySearch(int [] nums, int term) { // method D
  

   
        int start = 0;
        int end = nums.length - 1;
    
        while (start <= end) {
            int mid = (start + end) / 2;
            if (term == nums[mid]) {
                return mid;
            } else if (term < nums[mid]) {
                end = mid - 1;
            } else if (term > nums[mid]) {
                start = mid + 1;
            }
        }
        return -1;
 
  
} 
  
}



  
