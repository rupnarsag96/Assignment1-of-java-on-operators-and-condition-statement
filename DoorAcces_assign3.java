package Assignment26_9_24;
import java.util.Scanner;
public class DoorAcces_assign3 
{

	public static void main(String[] args) {
		
		boolean validId;
		boolean validCard;
		boolean isAdmin;

                sc=new Scanner(System.in);
		System.out.println("Enter id and access card");
                System.out.println("or check wheither person os admin or not"); 
                System.out.println(" Enter value in true/false?");   
		validId=sc.nextboolean();
                validCard=sc.nextboolean();
                isAdmin=sc.nextboolean();
		
		if((validId && validCard) || isAdmin)
			System.out.println("Access Granted");
		else
			System.out.println("Access Denied");
	}

}
