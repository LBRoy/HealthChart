import java.util.Scanner;
/**
 * <p>This class calls the methods from Patient.java and prompts the user to input their information to print out the users health chart.</p>
 * @author Braden Howard
* 
* <p> Things the program does:</p><br>
* <p> Program will let you choose your own gender, you can be a symbol or a number or whatever you want to be.</p><br>
* 
* <p> Exceptions:</p>
* <p> This program does not handle any exceptions.</p>
* <p> Program does not check to see if the user input symbols or numbers for the first name.</p>
* <p> Program does not check to see if the user input symbols or numbers for the last name.</p>
* <p> Program does not check to see if the user input a valid day(1-31) for day of month you were birthed.</p>
* <p> Program does not check to see if the user input a valid month(1-12) for month they were born.</p>
* <p> Program does not check to see if the user input a valid year(0000) for the year they were born.</p>
* <p> Program does not check to see if the user input a valid height as a double. </p>
* <p> Program does not check to see if the user input a valid weight as a double.</p>
* <p> If user input incorrect values for height or weight, the BMI calculation will not be accurate to what it truly should be.</p>
* <p> BMI values are for adults 20 and over, they do not account for people under the age of 20.</p>
* <p> If user inputs incorrect year that they were born, it will cause the age to be incorrect, then the maximum heart rate
* and target heart rate range to be calculated incorrectly.</p>
* <p> If user inputs a space between ANY answers for the prompts, the input after the space will be used for the next question causing errors.</p>
*/
public class MyHealthDataTest {
	/**
	 * 
	 * @param args (not used)
	 */
	public static void main(String[] args) {
		// Declarations
		Scanner keyboard = new Scanner(System.in);
		Patient patient = new Patient(null, null, null, 0, 0, 0, 0, 0);
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int birthMonth;
		int birthDay;
		double height;
		double weight;
		
		// Prompts user for first name
		System.out.println("Please input your first name: ");
		firstName = keyboard.next();// Takes user input
		patient.setFirstName(firstName);
		
		// Prompts user for last name
		System.out.println("Please input your last name: ");
		lastName = keyboard.next();// Takes user input
		patient.setLastName(lastName);
		
		// Prompts user for gender
		System.out.println("Please input your gender: ");
		gender = keyboard.next();// Takes user input
		patient.setGender(gender);
		
		// Prompts user for birth year
		System.out.println("Please input your Birth Year: ");
		birthYear = keyboard.nextInt();// Takes user input
		patient.setBirthYear(birthYear);
		
		// Prompts user for birth month
		System.out.println("Please input your Birth Month as a number: ");
		birthMonth = keyboard.nextInt();// Takes user input
		patient.setBirthMonth(birthMonth);
		
		// Prompts user for birth day
		System.out.println("Please input your Birth Day: ");
		birthDay = keyboard.nextInt();// Takes user input
		patient.setBirthDay(birthDay);
		
		// Prompts user for height
		System.out.println("Please enter your height in total inches:");
		height = keyboard.nextDouble();// Takes user input
		patient.setHeight(height);
		
		// Prompts user for weight
		System.out.println("Please enter your weight in pounds:");
		weight = keyboard.nextDouble();// Takes user input
		patient.setWeight(weight);
		
		// closes scanner
		keyboard.close();
		
		// Calls displayMyHealthData to print out health chart
		patient.displayMyHealthData();

	}
}
