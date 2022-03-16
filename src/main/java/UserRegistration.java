

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public String regex;
	/**
	 * Method to perform validations on user input as first name
	 * @param firstName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean firstNameofUser(String firstName)  {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2}");
		Matcher m = p.matcher(firstName);
		return m.matches();
	}
	
	/**
	 *  In this method we will check for exception for the first name.
	 *  If the first name is valid then it will print valid.
	 *  If the first name is Invalid then it will throw the exception and print the message.
	 * @param firstName - We will pass the first name to this method.
	 * @return - The method will compute and return a boolean value true if correct pattern.
	 * @throws UserRegistrationException - We will throw the custom exception.  
	 */
	public boolean testFirstName(String firstName) throws UserRegistrationException {
        try {
            if (!firstNameofUser(firstName)) {
                throw new UserRegistrationException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (UserRegistrationException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return firstNameofUser(firstName);
    }
	/**
	 * Method to perform validations on user input as last name
	 * @param lastName - input name of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean lastNameofUser(String lastName){
		regex="^[A-Z][a-z]{2}";
		Pattern p=Pattern.compile(regex);

		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(lastName);
		//System.out.println(m.matches());
		return m.matches();
	}
	/**
	 *  In this method we will check for exception for the last name.
	 *  If the last name is valid then it will print valid.
	 *  If the last name is Invalid then it will throw the exception and print the message.
	 * @param lastName - We will pass the last name to this method.
	 * @return - The method will compute and return a boolean value true if correct pattern.
	 * @throws InputInvalidException - We will throw the custom exception & is used to declare an exception
	 */
	public boolean testLastName(String lastName) throws UserRegistrationException {
        try {
            if (!lastNameofUser(lastName)) {
                throw new UserRegistrationException("Entered LastName is Invalid Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (UserRegistrationException e) {
            System.out.println("Exception is Occurred" + e);
            e.printStackTrace();
        }
        return lastNameofUser(lastName);
    }
	/**
	 * Method to perform validations on user input as Emails
	 * @param email - email ids of the user
	 * @return - returns true or false based on the condition
	 */
	public boolean emaiIdofUser(String email) {
		regex="^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		Pattern p=Pattern.compile(regex);

		/**
		 * Pattern class contains matcher() method  to find matching between given lastname
           and regular expression.
		 */
		Matcher m=p.matcher(email);
		return m.matches();
		
	}
	public boolean testEmailId(String email) throws UserRegistrationException {
        try {
            if (!emaiIdofUser(email)) {
                throw new UserRegistrationException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (UserRegistrationException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return emaiIdofUser(email);
    }
	/**
	 * Method used to perform mobile number validations using regular expression
	 * @param phone - input phone number given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean mobileNumberOfUser(String phone) {

		regex="^([0-9]{2}[\\s]){1}[0-9]{9,10}$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(phone);
		return m.matches();
		
	}
	public boolean testMobileNumber(String phone) throws UserRegistrationException {
        try {
            if (!mobileNumberOfUser(phone)) {
                throw new UserRegistrationException("Entered MobileNumber is Invalid\n" +
                        "Mobile Number Must Contain Country Code");
            } else {
                System.out.println("Entered MobileNumber is Valid\n");
            }
        } catch (UserRegistrationException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return mobileNumberOfUser(phone);
    }
	/**
	 * Method used to perform password  validations using regular expression
	 * As a User need to follow pre-defined Password rules.
	 * Rule 1 : Minimum 8 characters
	 * Rule 2 : Should have at least 1 Upper Case
	 * Rule 3 : Should have at least 1 numeric number in the password
	 * Rule 4 : Has exactly 1 Special Character
	 * @param password - input password given by the user
	 * @return - it returns true or false based on the given regular expression
	 */
	public boolean passwordOfUser(String password) {
		regex="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(password);
		return m.matches();
	}
	public boolean testPassword(String password) throws UserRegistrationException {
        try {
            if (!passwordOfUser(password)) {
                throw new UserRegistrationException("Entered Password is Invalid\n");
            } else {
                System.out.println("Entered Password is Valid");
            }
        } catch (UserRegistrationException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return passwordOfUser(password);
    }

}
