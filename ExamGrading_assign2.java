package Assignment26_9_24;
import java.util.Scanner;
public class ExamGrading_assign2 {

	public static void main(String[] args) {
		
		int s1,s2,s3;
		int avg;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks for 3 subjects");
		System.out.println("Enter marks for 1st subjects");
		s1=sc.nextInt();
		System.out.println("Enter marks for 2nd subjects");
		s2=sc.nextInt();
		System.out.println("Enter marks for 3 subjects");
		s3=sc.nextInt();
		
		avg=(s1+s2+s3)/3;
		
		
		if(s1>40 && s2>40 && s3>40 && avg>=60)
			System.out.println(" Student is Passed");
		else
			System.out.println("Student is Failed");
		
	}

}
