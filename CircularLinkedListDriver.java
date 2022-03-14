import java.util.*;
public class CircularLinkedListDriver
{
   public static void main(String [] args)
   {
      Scanner console = new Scanner(System.in);
      CircularLinkedList myList = new  CircularLinkedList();
      int choice=1, value, val;
       
      System.out.println("Welcome...");
      System.out.println("Please choose the number of the operation");
     
      while(choice != 0)
      {
         System.out.println(" 1) Add a value at the beginning of the list");
         System.out.println(" 2) Add a value at the end of the list");
         System.out.println(" 3) Search for a  specific value"); 
         System.out.println(" 4) Test if the list is empty");
         System.out.println(" 5) Replace a value by another one");
         System.out.println(" 6) Delete the first name from the list");
         System.out.println(" 7) Rotate the list");
         System.out.println(" 8) Display the content of the list");
         System.out.println(" 9) Display the number of elements in the list");
         System.out.println(" 0) Exit");
      
         choice = console.nextInt();
         switch(choice)
         {
            case 0:
               System.out.println("Thank you for using the application!");
               break;
               
            case 1:
               System.out.println("Enter a value");
               value = console.nextInt();
               myList.addFirst(value);
               break;
               
            case 2:
               System.out.println("Enter a value");
               value = console.nextInt();
               myList.addLast(value);
               break;
               
            case 3:
               System.out.println("Enter a value to search for ");
               value = console.nextInt();
               //System.out.println("Is the name "+value+" available: " + myList.contains(value));
               if(myList.contains(value)==true)
                  System.out.println(value+"  is available in the list");
               else
                  System.out.println(value+"  is not available in the list");
               break;
               
            case 4:
               boolean empty = myList.isEmpty();
               if(empty == true)
                  System.out.println("The list is empty!");
               else
                  System.out.println("The list is not empty!");
               break;
               
            case 5:
               System.out.println("Enter the value to be replaced ");
               value = console.nextInt();
               System.out.println("Enter the new value ");
               val = console.nextInt();
               myList.replace(value, val);
               break;
               
            case 6:
               val=myList.removeFirst();
               System.out.println("The value removed is : " + val);
               break;
               
            case 7:
               myList.rotate();
               break;
               
            case 8:
               System.out.println(myList);
               break;
               
            case 9:
               System.out.println("The total number of elements in the list is: " + myList.size());
               break;
               
            default:
               System.out.println("Please enter a valid number: ");  
               choice = console.nextInt();
         }  
      }  
   } 
}

