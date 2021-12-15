/*
CSE 17 Fall 2019
@author Raphael Keele
Project 4
Program: DoublyLinkedList
*/


public class DoublyLinkedList {
  
  public Node front; 
  public Node back; 
  public int size = 0; 
  
  /**
    1-arg constructor that initializes the head of the List
  */
   DoublyLinkedList(){
     front = null;
     back = null; 
   }
  /**
    @params: int data
    @returns: void
    
    This method adds data to the start of the list
  */
  public void addStart(int data){
    Node temp = new Node(data);
    temp.prev = null; 
    temp.next = front; 
    
    if(front == null){
      back = temp; 
    }else {
      front.prev = temp; 
    }
    
    front = temp; 
    this.size++; 
  }
  /**
    @params: int data
    @returns: void
    
    This method adds data to the end of the list
  */
  
  public void addEnd(int data){
   
      Node temp = new Node(data);
      temp.prev = back; 
      temp.next = null; 
      
      if(back == null){
        front = temp; 
      } else {
        back.next = temp;
      }
      back = temp; 
      size++;
    
  }
  /**
    @params: none 
    @returns: int
    
    This method removes the start of the list
  */
  public int deleteStart(){
    if(front == null){
       back = null;
      return -1;
    }
    Node temp = front; 
    front = front.next;
    
    size--;
    return temp.data;
  }
  /**
    @params: none
    @returns: int
    
    This method removes the end of the list
  */
  public void deleteEnd(){
    Node current = front;
    if(front.next == null){
      front = null; 
    }else {
      while (current.next.next != null){
        current = current.next;
      }
      back = current; 
      back.next = null;  
    }
    size--;
  }
  
  /**
    @params: int index
    @returns: int
    
    This method returns the data of certain index
  */
  
  public int elementAt(int index){
    if(index > size){
      return -1;
    }
    Node n = front; 
    while(index - 1 != 0){
      n = n.next;
      index--; 
    } 

    return n.data; 
  }
  /**
    @params: none 
    @returns: int size
    
    This method returns the size of the list 
  */
  public int getSize(){
    return this.size;
  }
  /**
    @params: int data
    @returns: int
    
    This method searches through a list and looks for the element where data can be found
  */
  public int search(int data){
    Node current = front; 
    int count = 0; 
    while(current != null){
      count++; 
      if(current.data == data){
        return count; 
      }
      current = current.next;
    }
    return -1; 
  }
  /**
    @params: int data
    @returns: void
    
    This method adds data at different indices
  */
  
  public void addAtIndex(int data, int position){
    if(position == 1){
      addStart(data);
    }
        int length = size; 

    if(position == length + 1){
      addEnd(data);
    }
    
    if(position > length + 1 || position < 1){
      System.out.println("Invalid Position");
     
    }
    
    if(position <= length && position > 1){ //adding the node
       Node n = new Node(data); 
      Node currNode = front; 
      while((position - 2) > 0){
        currNode = currNode.next; 
        position--; 
      }   
      n.next = currNode.next; 
      currNode.next = n; 
      size++; 
    }
  }
  
  /**
    @params: int data
    @returns: void
    
    This method returns the contents of the list
    THIS DOES NOT PRINT THE LIST, YOU MUST STORE THE LIST AS A STRING AND THEN PRINT THE STRING 
    ex. String x = list.toString();
    System.out.println(x); 
  */
  
  
  @Override 
  public String toString(){
    String list = ""; //creating the string
    Node prev = null; //prev 
    Node curr = front; //start since each data only knows about the prev and next
                        //this how u have to handle the print out
    while(curr != null){
      list += curr.data + " "; //puts all the contents in one string  
      prev = curr; 
      curr = curr.next; 
    }
    return list; 
  }
}

//node object
class Node { 
  public int data;
  public Node prev; //the object before
  public Node next; //the object after
  
  /**
    1-arg constructor that takes in data from the user
  */
  Node(int data){ //stores the data 
    this.data = data; 
  }
}