import java.util.Arrays; 
import java.util.Random; 

public class Letters{ 

    public static void main(String[] args) { 
            

      System.out.println("Random character generator:"); 
      
      String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
      
      Random r = new Random(); 
      
      int y = (int) (Math.random() * 100);
      
      char [] arrayofchar = new char [y]; 
      
      for (int i = 0; i < arrayofchar.length; i++) {
        
        
        arrayofchar [i] = alphabet.charAt(r.nextInt(52));
        
        System.out.print(arrayofchar[i]);
        
        
      }
      System.out.println();
    
    AtoM(arrayofchar);
      
   
    
    NtoZ(arrayofchar);
  
  }
  
  
  public static void AtoM(char[] i) {
    
    Arrays.sort(i);
    
     System.out.println("AtoM character array:");
     
    
    String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMm";
    int z = alphabet.length();
    
    for (int x = 0; x < i.length; x++) {
        for (int y = 0; y< z; y++) {
            if(i[x] == alphabet.charAt(y)) {
                System.out.print(i[x]);
            }
        }
    }
    
  }
  
  
  public static void NtoZ(char [] i) {
      
     Arrays.sort(i);
     
     System.out.println(" ");
    
     System.out.println("NtoZ character array:");
     
    
    String alphabet = "NnOoPpQqRrSsTtUuVvWwXxYyZz";
    int z = alphabet.length();
    
    for (int x = 0; x < i.length; x++) {
        for (int y = 0; y< z; y++) {
            if(i[x] == alphabet.charAt(y)) {
                System.out.print(i[x]);
            }
        }
    }
     
    System.out.println(" ");
      
  }
  
}
  
  
  
  
  