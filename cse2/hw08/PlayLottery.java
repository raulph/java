import java.util.Scanner; 

public class PlayLottery {
  public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in); 
    
    System.out.println("Enter a numbers between 0 and 59:"); 
    System.out.println("Number One:"); 
   
     int n1 = input.nextInt();
    
     while (n1 < 0 || n1 > 59) {
      System.out.println("ERROR: This is not a good integer.");
      
      n1 = input.nextInt();
      
    }

    System.out.println("number two: ");
    
    int n2 = input.nextInt();
    
     while (n2 < 0 || n2 > 59) {
      System.out.println("ERROR: This is not a good integer.");
      
      n2 = input.nextInt();
      
    }
      
    System.out.println("number three: ");
      
    int n3 = input.nextInt();
    
     while (n3 < 0 || n3 > 59) {
      System.out.println("ERROR: This is not a good integer.");
      
      n3 = input.nextInt();
      
    }

    System.out.println("number four: ");
    
   
    int n4 = input.nextInt();
    
     while (n4 < 0 || n4 > 59) {
      System.out.println("ERROR: This is not a good integer.");
      
      n4 = input.nextInt();
      
    }
    
    System.out.println("number five: ");
    
    int n5 = input.nextInt();
    
     while (n5 < 0 || n5 > 59) {
      System.out.println("ERROR: This is not a good integer.");
      
      n5 = input.nextInt();
      
    }
    
    int [] user = new int [5]; 
    
    user [0] = n1; 
    user [1] = n2;
    user [2] = n3;
    user [3] = n4;
    user [4] = n5;
    
    System.out.println("Your numbers are:" + n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5); 
    
    int [] lottery = new int[5];
    
   
    
    System.out.println("Lottery numbers are: "); 
    
    for (int i = 0; i < 5; i++) {
      lottery [i] = numberspicked(lottery); 
      
      System.out.print(lottery[i] + " ");
    }
    
    System.out.println(" ");
    
    
    boolean winornot = userWins(user, lottery);
    
    if(winornot) {
      System.out.println("You win");
    } else {
      System.out.println("You lose");
    }
    
  }
  
  public static int numberspicked( int [] y ) {
   
    int val = 0; 
    for (int i = 0; i < 5; i++) {
      y[i] = (int ) (Math.random() * 60);
       val = y[i]; 
       
    }
        
  return val;
  }
  
  public static boolean userWins(int [] x, int [] y) {
    
    boolean win = true; 
    
    for (int i = 0; i < x.length; i++) {
      for (int j = 0; j < y.length; j++) {
        if (x[i] == y[j]){
           win = true; 
        } else if (x[i] != y[j]) {
          win = false;
        }
      }
    }
    
    
    return win;
  }
  
  
  
  
  
}
