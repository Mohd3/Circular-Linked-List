public class CircularLinkedList
{

  private class Node
  {
    private int element;
    private  Node next;
    public  Node( int e,  Node n)
    {
      element = e;
      next = n;
    }
    
    public  int getElement(){ return element;} 
    public  Node getNext(){ return next;}
    
    public void setElement(int e){ element = e;}
    public void setNext(Node n){ next = n;}
  }
  
  private  Node tail;
  private int size;
  
  public  CircularLinkedList()
  {
    tail = null;
    size = 0;
   }
   
   public boolean isEmpty()
   { if (size == 0)
       return true;
     else return false;
   }
   
  public void addFirst(int e)
  {
    if(size == 0)
    {
      tail = new  Node(e, null);
      tail.setNext(tail);
    }
    else
    {
       Node newest = new Node(e, null);
       newest.setNext(tail.getNext());
       tail.setNext(newest);
    }
     size++;
  }
  
 
 public void rotate()
  {
    if(tail != null)
      tail=tail.getNext();
  }
  
 public void addLast(int e)
  {
     addFirst(e);
     tail = tail.getNext();
  }
 
  public int removeFirst()
  {
    if (isEmpty())
      return -999;
    else
    {
     Node head = tail.getNext();
     int answer = head.getElement();
     if(head == tail)
          tail = null;
     else
         tail.setNext(head.getNext());
     size --;
     return answer;
    } 
  }

  public void replace(int n, int v)
  {
    if(!isEmpty())
    {
     Node temp = tail.getNext();
      while (temp != tail)
      {
        if (temp.getElement()== n)
           temp.setElement(v);
        temp = temp.getNext();
      }
     if (temp.getElement()== n)
           temp.setElement(v);
     }
  } 
  
  public int size()
  { return size;   }  


 public boolean contains(int value)
  { 
      Node current = tail.getNext();
      boolean found = false;
      while (current != tail && !found)
      {
        if(current.getElement() == value)
            found = true;
        else
            current = current.getNext();
      }
        if(current.getElement() == value)
            found = true;
        return found;
   }
   
  public String toString()
  { 
      String st = " ";
      if(!isEmpty())
      {
         Node current = tail.getNext();
        while (current != tail)
        {
         st = st +("   " + current.getElement());
         current = current.getNext();
        }
          st = st +("   " + current.getElement());
       }
       return st;
   }  

 }
