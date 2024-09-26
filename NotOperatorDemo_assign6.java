        package Assignment26_9_24;
        import java.util.Scanner;  

        public class NotOperatorDemo_assign6
        {  
        public static void main(String[] args) 
         {  
        Scanner sc = new Scanner(System.in);  
        int num;
        
        System.out.print("Enter the number");  
        num = sc.nextInt();  

         System.out.print("Lets check no is between 10 And 20");

        if (!(num >= 10 && num <= 20))

        {  
            System.out.println("It's in no range of 10 to 20  ");  
        } 
        else
        {  
            System.out.println("Number is between 10 to 20");  
        }  

         
       }  
       }