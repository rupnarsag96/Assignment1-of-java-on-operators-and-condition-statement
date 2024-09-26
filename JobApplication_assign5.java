package Assignment26_9;
import java.util.Scanner;
public class JobApplication_assign5 {

	public static void main(String[] args) {
		boolean degree;
		boolean exp;
		boolean criminal;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("does applicant have bachelor's degree");
		System.out.println("true/false");
		degree=sc.nextBoolean();
                System.out.println("does applicant have experince of 5 years");
		System.out.println("true/false");
		exp=sc.nextBoolean();
                System.out.println("does applicant have not any criminal record");
		System.out.println("true/false");
		criminal=sc.nextBoolean();


               if((degree||exp) && criminal)
               System.out.println("candidate is eligible");
               else
               System.out.println("candidate is not eligible");

	}

}
