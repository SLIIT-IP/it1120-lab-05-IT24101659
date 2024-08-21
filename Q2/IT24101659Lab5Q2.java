import java.util.Scanner;

public class IT24101659Lab5Q2{
public static void main(String[]args ){
   
   Scanner input = new Scanner(System.in);
 

   int newMem;

 //input new members
   
   System.out.println("Enter the number of new members introduced: ");
   newMem = input.nextInt();

//validate the input
   if(newMem<0)
    {
     System.out.println("Input number must be a number 0 or greater");
     return;
    }
   
//condition check
   switch(newMem) 
   {
    case 0 : System.out.print("No Prize");
             break; 

    case 1 : System.out.print("Prize is a: Pen");
             break; 

    case 2 : System.out.print("Prize is a: Umbrella");
             break; 

    case 3: System.out.print("Prize is a: Bag");
             break; 

    case 4 : System.out.print("Prize is a: Travelling Chair");
             break; 

    default : System.out.print("Prize is a: Headphone");
    }
 }
}          