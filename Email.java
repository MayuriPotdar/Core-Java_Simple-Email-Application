package EmailApp;
import java.util.*;
import java.io.*;
import java.util.random.*;
public class Email 
{
	public Scanner sc=new Scanner(System.in); //Scanner class
	//declaring variables private 
	private String fname;
	private String lname;
	private String email;
	private String password;
	private int mailCapacity=500;
	private String alter_email;
	
	public Email(String fname,String lname)
	{
		this.fname=fname;
		this.lname=lname;
		System.out.println("New User :"+this.fname+" "+this.lname);
		
		//calling all methods in constructor
		this.password=this.generatePassword(8); //password
		this.email=this.generate_email(); //email generation	
	}
	
	//generate mail method
	private String generate_email()
	{
		return this.fname.toLowerCase()+""+this.lname.toLowerCase()+"@gmail.com";	
	}
	
	//set random password
	private String generatePassword(int length)
	{
		Random r=new Random();
		String capital_chars ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small_chars="abcdefghijklmnopqrstuvwxyz";
		String numbers="1234567890";
		String symbols="!@#$&?";
		
		String values=capital_chars+small_chars+numbers+symbols;
		String password="";

		for(int i=0;i<length;i++)
		{
			password= password+values.charAt(r.nextInt(values.length()));
			
		}
		return password;		
	}
	
	
	//change password method
	public void set_password()
	{
		boolean flag=false;
		do
		{
			System.out.println("Do you want to change your password!(Y/N)");
			char choice=sc.next().charAt(0);
			if(choice=='Y'||choice=='y')
			{
				flag=true;
				System.out.println("Enter current password");
				String temp=sc.next();
				if(temp.equals(this.password)) {
					System.out.println("Enter new password:");
					this.password=sc.next();
					System.out.println("Password changed successfully...");
				}
				else {
					System.out.println("Incorrect password..!");
				}	
			}
			else if(choice=='N'||choice=='n')
			{
			  flag=true;
			  System.out.println("Password changed option cancelled...!");
			}
			else
			{
				System.out.println("Enter valid choice...!");
			}
		}while(!flag);
	}
	
	//set mailbox capacity method
	public void set_mailbox()
	{
		System.out.println("Current capacity= "+this.mailCapacity+"mb");
		System.out.println("Enter new mailbox capacity:");
		this.mailCapacity=sc.nextInt();
		System.out.println("Mailbox capacity is successfully changed...");
	}
	
	//set alternate mail
	void alternate_email()
	{
		System.out.println("Enter new alternate mail:");
		this.alter_email=sc.next();
		System.out.println("Alternate email is set...");
	}
	
	//Display user information method
	public void DisplayInfo()
	{
		System.out.println("New:"+this.fname+" "+this.lname);
		System.out.println("Email:"+this.email);
		System.out.println("Password:"+this.password);
		System.out.println("Mailbox capacity:"+this.mailCapacity+"mb");
		System.out.println("Alternate mail:"+this.alter_email);
	}	
}
