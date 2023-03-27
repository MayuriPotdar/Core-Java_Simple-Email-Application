package EmailApp;
import java.util.*;

public class emailMain {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name:");
		String f_name=sc.next();
		System.out.println("Enter last name :");
		String l_name=sc.next();
		
		//creating object for Email class
		Email em1=new Email(f_name, l_name);
		int choice=-1;
		do {
			System.out.println("\n******\nMenu :\n1.Show Info\n2.Change password\n3.Change mailbox capacity \n4.Set Alternate mail\n5.Exit\n******");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				em1.DisplayInfo();
				break;
			case 2:
				em1.set_password();
				break;
			case 3:
				em1.set_mailbox();
			    break;
			case 4:
				em1.alternate_email();
				break;
			case 5:
				System.out.println("Thanks for using application....");
			    break;
			default:
				System.out.println("Invalid choice... \nenter proper choice again...");
			}
		}while(choice!=5);

	}

}
