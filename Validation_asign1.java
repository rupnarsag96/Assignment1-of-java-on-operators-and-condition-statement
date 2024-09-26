package Assignment26_9_24;
import java.util.Scanner;
public class Validation_asign1
{
	public static void main(String[] args) {
		
		int age;
		double income;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age and Income in $");
		age=sc.nextInt();
		income=sc.nextDouble();
		
		if(age>=18 && age<=60 && income>25000)
			System.out.println("Person is eligible for Loan");
		else
			System.out.println("Person is not eligible for loan");
	}
}
