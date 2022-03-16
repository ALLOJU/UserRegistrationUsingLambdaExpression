package UserRegistrationUsingLamdaExpression;

import java.util.regex.Pattern;
/**
 * functional interface for first name
 * @author 
 *
 */
@FunctionalInterface
interface IfirstName{
	public String validate(String regex,String firstname);
}
/**
 * functional interface for last name
 * @author 
 *
 */
@FunctionalInterface
interface ILastName{
	public String validate(String regex,String lastname);
}
/**
 * functional interface for email id and it contains an abstract method validate
 * @author mounika
 *
 */
@FunctionalInterface
interface IEmail{
	public String validate(String regex,String email);
}
/**
 * functional interface for mobile number and it contains an abstract method validate
 * @author mounika
 *
 */
@FunctionalInterface
interface IMobileNumber{
	public String validate(String regex,String mobile);
}

/**
 * functional interface for password and it contains an abstract method validate
 * @author mounika
 *
 */
@FunctionalInterface
interface IPassword{
	public String validate(String regex,String password);
}

public class UserRegistrationUsingLambda {
	public static void main(String[] args) {
		/**
		 * method to check first name is valid or not using lambda expression by using regular expression and also providing 
		 * functional interface
		 */
		IfirstName firstNameofUser=(regex,firstname) ->{
			return "The first name provided is :" +Pattern .compile(regex).matcher(firstname).matches();
		};
		System.out.println(firstNameofUser.validate("^[A-Z][a-z]{2}", "Mou"));
		/**
		 * method to check last name is valid or not using lambda expression by using regular expression and also providing 
		 * functional interface
		 */
		ILastName lastNameofUser=(regex,lastname) ->{
			return "The last name provided is :" +Pattern .compile(regex).matcher(lastname).matches();
		};
		System.out.println(lastNameofUser.validate("^[A-Z][a-z]{2}", "All"));
		
		/**
		 * method to check email id is valid or not using lambda expression by using regular expression and also providing 
		 * functional interface
		 */
		IEmail emaiIdofUser=(regex,email) ->{
			return "The email id provided is :" +Pattern .compile(regex).matcher(email).matches();
		};
		System.out.println(emaiIdofUser.validate("^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", "abc@yahoo.com"));
		
		/**
		 * method to check mobile number is valid or not using lambda expression by using regular expression and also providing 
		 * functional interface
		 */
		IfirstName mobileNumberOfUser=(regex,mobile) ->{
			return "The phone number provided is :" +Pattern .compile(regex).matcher(mobile).matches();
		};
		System.out.println(mobileNumberOfUser.validate("^([0-9]{2}[\\s]){1}[0-9]{9,10}$","91 9866349586"));
		
		
		/**
		 * method to check password is valid or not using lambda expression by using regular expression and also providing 
		 * functional interface
		 */
		IfirstName passwordOfUser=(regex,password) ->{
			return "The password provided is :" +Pattern .compile(regex).matcher(password).matches();
		};
		System.out.println(passwordOfUser.validate("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])[a-zA-Z0-9]*[\\@\\#\\^][a-zA-Z0-9]*$","Password@123"));
	}
}

