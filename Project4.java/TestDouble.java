/*
CSE 17 Fall 2019
@author Raphael Keele
IBL 12 	
Program: TestSingle
*/

public class TestDouble{
  public static void main(String [] args){
    DoublyLinkedList list = new DoublyLinkedList();
    //creating the list
    list.addStart(2); 
    list.addStart(3);
    list.addStart(4);
    list.addEnd(6);
    list.addAtIndex(7,2);
    list.addEnd(9);
    System.out.println("Current list: " + list.toString());
    //deleting the start and the end 
    list.deleteEnd();
    int x = list.deleteStart();
   // System.out.println(x);
    list.deleteEnd();
    System.out.println("Removing parts of the list: " + list.toString());
    //other information about the list
    System.out.println("Element at index 1: " + list.elementAt(1));
    System.out.println(3 +" is found at element "+ list.search(3));
    System.out.println("The size of the list is " + list.getSize());
  } 
}