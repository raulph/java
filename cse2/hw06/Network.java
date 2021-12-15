import java.util.Scanner;

public class Network {
  public static void main (String args[]) {
     int height, width, size, edgelength; 
     
     
     // all the while not inputs go here at the end 
    Scanner input = new Scanner(System.in);
    
      
    
    
    
    System.out.println("Enter the desired height:");
    
    // while loop for when it does not put in an integer
    
    while (!input.hasNextInt()) {
            String junkWord = input.next();
            
            System.out.print("You did not put in an integer, please retry");
            
    }
    
    
    
     height = input.nextInt(); // column length
    
    // for when a height is a negative
    
    while (height < 0) {
      System.out.println("ERROR: This is not a good integer.");
      
      height = input.nextInt();
      
    }
    
    
     System.out.println("Enter the desired width:");
    
    // for when the width is not an integer
    while (!input.hasNextInt()) {
            String junkWord = input.next();
            
            System.out.print("You did not put in an integer, please retry");
            
        }
    
    
     width = input.nextInt(); // width for the all the boxes 
    
    while (width < 0) {
      System.out.println("ERROR: This is not a good integer.");
      
      width = input.nextInt();
      
    }
    
    
     
   System.out.println("Enter the desired size:");
    
    
    // for when they do not put in an integer
   while (!input.hasNextInt()) {
            String junkWord = input.next();
            
            System.out.print("You did not put in an integer, please retry");
            
        }
    
    size = input.nextInt(); // size for all the boxes
    
    // for it is a negative
    while (size < 0) {
      System.out.println("ERROR: This is not a good integer.");
      
      size = input.nextInt();
      
    }
    
    
   System.out.println("Enter the desired edge length:"); 
    
    // for it is a negative
    while (!input.hasNextInt()) {
            String junkWord = input.next();
            
            System.out.print("You did not put in an integer, please retry");
            
        } 
    
    
    edgelength = input.nextInt(); // variable for edgelength
    
    // for if it a negative 
    while (edgelength < 0) {
      System.out.println("ERROR: This is not a good integer.");
      
      edgelength = input.nextInt();
      
    }
    
    

     
    
    
    // this giant for loop for the height of the loop
    
    for (int d = 0; d <=  (height) / (size + edgelength) ; d++) { 
     
      // this loop controls the size of the squares for the boxes
    
     for (int i = 0; i < size; i++) {
       // this controls the width of the whole pattern
        for (int o = 0; o < (width) / (size + edgelength) ; o++) {
          // this controls what the corners of the boxes will be
            if (i == 0 || i == size - 1) {
              System.out.print("#");
              // this controls how many dashes were in between the corners
              for (int j = 0; j < size - 2; j++) {
                System.out.print("-");
              } 
              System.out.print("#"); 
              // this controls the spaces in between mutliple boxes
              for (int l = 0; l < edgelength; l++) {
                 System.out.print(" ");
              }
             
              
              // the else statement for when it is not in between 0 and 7
              
           } else {
              System.out.print("|");
              for (int k = 0; k < size - 2; k++) { // same as above
                 System.out.print(" "); 
              } 
              System.out.print("|");
             
              if(i == size / 2 || i == size / 2 - 1) {
                 for (int m = 0; m < edgelength; m++) {
                    System.out.print("-");
                 }
                     } else {
                          for(int n = 0; n < edgelength; n++) {
                          System.out.print(" ");
                       } 
                    } 
                  }
               }
       
    
       
      System.out.println(); // so that it does not 
     }
       
      
      
      
      
      // for if the size is even
      
    if ( size % 2 == 0) {
       for (int a = 0; a < edgelength; a++) { //this sets how many rows the bridge is
         for (int b = 0; b < (width) / (size + edgelength); b++) { //this sets how many groups of bridges there are 
           for(int c = 0; c < size + edgelength; c++ ) { // goes from 0 to the size //this sets how the columns are printed
           if (c == size/2 || c == size/2 - 1) {
             System.out.print("|");
             } else {
             System.out.print(" ");
                  }
                }
              }       
            System.out.println();
          }
      
      // for it the size is odd
        } else if ( size % 2 != 0) {
              for (int a = 0; a < edgelength; a++) { //this sets how many rows the bridge is
                 for (int b = 0; b < (width) / (size + edgelength); b++) { //this sets how many groups of bridges there are 
                   for(int c = 0; c < size + edgelength; c++ ) { // goes from 0 to the size //this sets how the columns are printed
                   if (c == size/2) {
                     System.out.print("|");
                     } else {
                     System.out.print(" ");
                     }
                   }
                 }       
                 System.out.println();
               }
          } 
        }
    
    
    
    
    
     }
  }




 

 