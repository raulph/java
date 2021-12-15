/*
CSE 17 Fall 2019
@author: Raphael Keele 
Project 4 	
Program: CircularLinkedList
*/


public class CircularLinkedList {
  
  public Node head; //the beginning
  public Node tail; //the end
  public int size = 0; 
  
  /**
    1-arg constructor that initializes the head and tail of the List
  */
   CircularLinkedList(){
     head = null;
     tail = null; 
   }
  
  /**
    @params: int data
    @returns: void
    
    This method adds data to the start of the list
  */
  
  public void addStart(int data){
   Node newNode = new Node (data); 
   if(size == 0){
      head = newNode; // linking the head and tail together
      tail = newNode;
      newNode.next = head; 
    } else {
      Node temp = head;  //
      newNode.next = temp;
      head = newNode;
      tail.next = head;
   }
   
    this.size++; //incrementing the size
  }
  /**
    @params: int data
    @returns: void
    
    This method adds data to the end of the list
  */
  
  public void addEnd(int data){
    if(size == 0){
      addStart(data);
    } else {
      
      Node n = new Node(data);
      tail.next = n;
      tail = n;
      tail.next = head;
      size++;
    }
  }
  /**
    @params: none 
    @returns: int
    
    This method removes the start of the list and returns the data of the removed front object
  */
  public int deleteStart(){
   int data = 0;
    if(size == 0){ 
      return -1;
    } else{
      data = head.data;
      head = head.next; 
      tail.next = head; 
      size--;
    }
   
    return data;
  }
  /**
    @params: none
    @returns: int
    
    This method removes the end of the list
  */
  public void deleteEnd(){
    
    if(size == 0){
      System.out.println("List is empty");
    } else {
      Node prev = head; //starting from the head because that's the tail
      Node curr = head.next; //evaluating everything that comes after
      
      do { //only executes if the third element does not equal head, since it's 
          //circular, none of the elements in the list are really null 
        prev = curr; //moving through 
        curr = curr.next; //passing through
        
      }while(curr.next != head); 
      
        prev.next = head; //at this point, the prev is the tail, meaning we have to take care of that 
        tail = prev; 
        curr = null; //deleting everything
      size--;
    }
    
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
    Node n = head; 
    while(index - 1 != 0){
      n = n.next; //moving through the list
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
    Node current = head; 
    int count = 0; 
    do{
      count++; 
      if(current.data == data){
        return count; 
      }
      current = current.next;
    }while(current != head);
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
      Node currNode = head; 
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
    Node temp = head; //starting from the beginning
    
    if(size <= 0){
      list = "List is empty."; //the string for nothing there
    } else {
      do {
        list += temp.data + " "; //putting all the data for nothing there. 
        temp = temp.next;
      }  while(temp != head);
    }
    return list;
  }
}

//node object
class Node { 
  public int data;
  public Node next;
  /**
    1-arg constructor that takes in data from the user
  */
  Node(int data){ //stores the data 
    this.data = data;
  }
}