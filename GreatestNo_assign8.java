        package Assignment26_9_24;
        import java.util.Scanner;  

        public class GreatestNo_assign8{  
        public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);;  
  
        System.out.print("Enter first number: ");  
        int num1 = sc.nextInt();  
        
        System.out.print("Enter second number: ");  
        int num2 = sc.nextInt();  
        
        System.out.print("Enter third number: ");  
        int num3 = sc.nextInt();  
        
         
        int greatest_no = (num1 > num2)  
                        ? (num1 > num3 ? num1 : num3)  
                        : (num2 > num3 ? num2 : num3);  
       
        System.out.println("The greatest number is: " + greatest_no);  

        
    }  
}