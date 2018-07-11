import java.util.Scanner;

/***
 * 
 * @author gonzalo
 *class to manage Email variables
 *
 *
 */

public class Email {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private int passwordLength = 10;
	private String department;
	private int mailBoxCapacity = 200;
	private String alternateEmail;
	private String companyEmail = "company.com";
	
	
	//constructor to pass receive variables
	Email(String fName, String lName) {
		this.firstName = fName; //this. being the class variable
		this.lastName = lName; //this. being the class variable
		
		//call setDepartment to choose what dept worker belongs 
		this.department = setDepartment();
	
		this.password = randomPassword(passwordLength);
		System.out.println("Your Password: " + this.password);
		
		//combine info to create email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyEmail;
	
	}
	
	
	//Method to ask/set the department belonging to that person
	private String setDepartment() {
		System.out.println("New Worker: " + firstName + ". Department Code: \n1 Sales \n2 Developer \n3 Accounting \n4 None. \nEnter option: \n");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		
		if (choice == 1) { //check
			return "Sales";
		}else if (choice == 2) {
			return "Developer";
		}else if (choice == 3) {
			return "Accounting";	
		} else if (choice == 4) {
			return "none";
		} else {
			return ""; 
		} 
	}
	
	//Method to generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%"; //possibilities of passwords from the alphabet
		char[] password = new char[length];
		
		for (int i = 0; i < length; i++) { //iterate for each value of length, we grab a value inside the array
			int rand = (int)(Math.random() * passwordSet.length()); //get a random chosen by passwordSet, typecast int
			//take the character of the random number we generated on scope of passwordSet
			password[i] = passwordSet.charAt(rand); 
		}
		return new String(password); //password is a set of characters, we change it to new string
	}
	
	//method to set the mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	//method to set alternate email
	public void setAlternateEmail(String setAltEmail) {
		this.alternateEmail = setAltEmail;
	}

	//method to set password
	public void changePassword(String password) {
		this.password = password;
	}
	
	//method to get mail capacity
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	//method to get alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	//method to get password
	public String getPassword() {
		return password;
	}
	
	//method to display summary info
	public String displayInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " +
				mailBoxCapacity + "mb";
		
	}
	
	
}



















