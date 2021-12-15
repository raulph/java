public class CardGenerator {   /////////// card generator
    public static void main (String args[]) {    
        int card, temp;   ////////// these integers are used for the card numbers
        String suit, identity; //////// these integers are used for the identity (aces, spades, etc.)
        
        card = (int)(Math.random() * (52 -1) + 1);  ////// allows a random card number to be generated
        identity = "";  /////// empty string that allows me to place the string to any variable
        suit = ""; /////// same as above 
        temp = card; //////// this temp is going to be for a new card variable after the temp. 

        
        
        if ( 1 <= card && card <= 13) {  //////// creating intervals for the suits 
            suit = "Diamonds"; 
        } 
        
        if (14 <= card && card <= 26) {
            suit = "Clubs";
            temp = card - 13; ///////// subtracting it by a certain number so that it stays in between 1 and 13
        } 
        
        if (27 <= card && card <= 39) {
            suit = "Hearts";
            temp = card - 26;
        }
        
        if (40 <= card && card <= 52 ) {
            suit = "Spades"; 
            temp = card - 39; 
        }
        
       
        
        switch (temp) {  ///////////  this the new card variable, so all card variables are between 1 and 13 now
            case 1: identity = "Ace"; //////////// in replace of one
            break; 
            case 2: identity = "2";  
            break; ////// stops fallout
            case 3: identity = "3"; 
            break; 
            case 4: identity = "4";
            break; 
            case 5: identity = "5";
            break; 
            case 6: identity = "6";
            break; 
            case 7: identity = "7"; 
            break;
            case 8: identity = "8"; 
            break; 
            case 9: identity = "9"; 
            break; 
            case 10: identity= "10"; 
            break; 
            case 11: identity = "Jack";  //////// there cannot be an 11, so it has to be jack
            break;
            case 12: identity = "Queen"; ////// same logic as before
            break; 
            case 13: identity = "King";
            break; 
        }
        
        
        
        System.out.println("You picked " + identity + " of " + suit); ///// the final print statement
      
    }
}

