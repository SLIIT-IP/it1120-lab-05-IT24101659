import java.util.Scanner;

public class IT24101659Lab5Q1{
public static void main(String[]args ){
   
   Scanner input = new Scanner(System.in);
   
   int num1,num2,num3,max,min;
   
   //input the three integers  

   System.out.print("Enter the first integer: ") ;
   num1 = input.nextInt();
   
   System.out.print("Enter the second integer: ") ;
   num2 = input.nextInt();

   System.out.print("Enter the third integer: ") ;
   num3 = input.nextInt();

   System.out.println("User entered numbers are: " +num1 +" " +num2 +" " +num3);
    
   //find the min and max
   
   if(num1<num2 && num1<num3)
    {  
     System.out.println("The smallest number is: " + num1);
    }
   else if(num2<num1 && num2<num3)
    {  
     System.out.println("The smallest number is: " + num2);
    }

   else
    {  
     System.out.println("The smallest number is: " + num3);
    }

   
   if(num1>num2 && num1>num3)
    {  
     System.out.println("The largest number is: " + num1);
    }
   else if(num2>num1 && num2>num3)
    {  
     System.out.println("The largest number is: " + num2);
    }

   else    
    {  
     System.out.println("The largest number is: " + num3);
    }
 }
}
   


 
   

   


   

   



   

