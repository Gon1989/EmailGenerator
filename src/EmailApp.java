

/*
 * Generate email: firstname.lastname@department.company.com
 * determine the department(sales, dev, accounting) if none leave blank
 * generate random string for a password
 * set methods to change password, set mailbox capacity, define alternate email address
 * get methods to display name, email, mailbox capacity
 */


public class EmailApp {

	public static void main(String[] args) {
		
		Email em1 = new Email("gonzalo", "Carrasco"); //create object to access Email class and pass arguments
		
		System.out.println(em1.displayInfo()); //display information
		
	}

}
