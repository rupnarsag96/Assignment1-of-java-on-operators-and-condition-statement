        package Assignment26_9_24;
        import java.util.Scanner;  

        public class Weather_assign7
        {  
        public static void main(String[] args) 
         {  
        Scanner sc = new Scanner(System.in);  
        int temp;
        boolean rain;
        System.out.print("Enter the temperature in Celsius: ");  
        temp = sc.nextInt();  

        System.out.print("Is it raining (true/false)? ");  
        rain = sc.nextBoolean();  

        if (temp >= 20 && temp <= 30 && !rain)
        {  
            System.out.println("It's safe to go outside.");  
        } 
        else
        {  
            System.out.println("It's not safe to go outside.");  
        }  

         
       }  
       }