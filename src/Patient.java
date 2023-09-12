import java.time.LocalDate;
import java.time.Period;
/**
* <p>The Patient class is used to calculate and print out a chart of the users health data.</p>
* @author Braden Howard
* 
* <p> Things the program does:</p>
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
public class Patient{
	
	static LocalDate currentDate = LocalDate.now();// Code used cited below code [1].
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int birthMonth;
	private int birthDay;
	private double height;
	private double weight;

	/**
	 * This constructor sets the firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight as passed.
	 * @param firstName the firstName of this Patient
	 * @param lastName the lastName of this Patient
	 * @param gender the gender of this Patient
	 * @param birthYear the birthYear of this Patient
	 * @param birthMonth the birthMonth of this Patient
	 * @param birthDay the birthDay of this Patient
	 * @param height the height of this Patient
	 * @param weight the weight of this Patient
	 */
public Patient(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, double height, double weight ) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.birthYear = birthYear;
	this.birthMonth = birthMonth;
	this.birthDay = birthDay;
	this.height = height;
	this.weight = weight;
}

/**
 * Returns the FirstName for this Patient
 * @return the firstNamefor this Patient
 */
public String getFirstName() {
	return firstName;
}

/**
 * Sets thefirstName for this Patient
 * @param firstName the firstName for this Patient
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * Returns the lastName for this Patient
 * @return the lastName for this Patient
 */
public String getLastName() {
	return lastName;
}

/**
 * Sets the lastName for this Patient
 * @param lastName the lastName for this Patient
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * Return the gender for this Patient
 * @return the gender for this Patient
 */
public String getGender() {
	return gender;
}

/**
 * Sets the gender for this Patient
 * @param gender the gender for this Patient
 */
public void setGender(String gender) {
	this.gender = gender;
}

/**
 * Returns the birthYear for this Patient
 * @return the birthYear for this Patient
 */
public int getBirthYear() {
	return birthYear;
}

/**
 * Sets the birthYear for this Patient
 * @param birthYear the birthYear to set
 */
public void setBirthYear(int birthYear) {
	this.birthYear = birthYear;
}

/**
 * Returns the birthMonth for this Patient
 * @return the birthMonth for this Patient
 */
public int getBirthMonth() {
	return birthMonth;
}

/**
 * Sets the birthMonth for this Patient
 * @param birthMonth the birthMonth for this Patient
 */
public void setBirthMonth(int birthMonth) {
	this.birthMonth = birthMonth;
}

/**
 * Returns the birthDay for this Patient
 * @return the birthDay for this Patient
 */
public int getBirthDay() {
	return birthDay;
}

/**
 * Sets the birthDay for this Patient
 * @param birthDay the birthDay for this Patient
 */
public void setBirthDay(int birthDay) {
	this.birthDay = birthDay;
}

/**
 * Returns the height for this Patient
 * @return the height for this Patient
 */
public double getHeight() {
	return height;
}

/**
 * Sets the height for this Patient
 * @param height the height for this Patient
 */
public void setHeight(double height) {
	this.height = height;
}

/**Returns the weight for this Patient
 * @return the weight for this Patient
 */
public double getWeight() {
	return weight;
}

/**
 * Sets the weight for this Patient
 * @param weight the weight for this Patient
 */
public void setWeight(double weight) {
	this.weight = weight;
}

/**
 * This method returns the Patients BMI represented as a double.
 * @return the BMI for this Patient
 */
public double getBMI() {
   return (getWeight() * 703) / (getHeight() * getHeight());// Returns BMI calculation as double
} 

/**
 * This method returns the Patients age as an int.
 * @return the age for this Patient
 */
public int age() {
	// Calculates time between the current date and users birthdate. 
	LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);// Code cited below code [1].
	int age = Period.between(birthDate, currentDate).getYears();// Code cited below code [1].
	return age;
}

/**
 * This method returns the maximum heart rate as an int.
 * @return maximumHeartRate Returns maximumHeartRate for this Patient
 */
 public int maximumHeartRate() {
	 // Calculates maximum heart rate by doing 220 - age of user
	int maximumHeartRate =  220 - age();
	return maximumHeartRate;		
 }
 
 /**
  * This method returns the target heart rate range as a String.
  * @return targetHeartRateRange Returns targetHeartRateRange for this Patient
  */
 public String targetHeartRateRange() {
	 // Calculates minimum target heart rate by doing maximum heart rate divided by 2
	 double minimumTargetHeartRate = maximumHeartRate() / 2;
	 // Calculates maximum target heart rate by doing maximum heart rate multiplied by .85.
	 double maximumTargetHeartRate = maximumHeartRate() * .85;
	 String targetHeartRateRange = String.format("Your target heart rate range is between %.2f and %.2f" ,minimumTargetHeartRate, maximumTargetHeartRate);
	 return targetHeartRateRange;
 }
 
 /**
  * This method prints out the health chart when called.
  */
public void displayMyHealthData() { 
	// Prints out health chart
	System.out.printf("Full name: %s %s%nGender: %s%nDate of birth: %d-%d-%d%nHeight: %.2f%nWeight: %.2f%nAge: %d%nBMI: %.2f%nMaximum Heart Rate: %d%n%s%n"
			, firstName, lastName, gender, birthYear, birthMonth, birthDay, height, weight, age(), getBMI(), maximumHeartRate(), targetHeartRateRange());

   System.out.println("BMI VALUES");
   System.out.println("Underweight: less than 18.5");
   System.out.println("Normal:      between 18.5 and 24.9");
   System.out.println("Overweight:  between 25 and 29.9");
   System.out.println("Obese:       30 or greater");
   
	} 

} // end class Patient
/*
 * References:
 * Used code from javaToint.com to get the age of a person using Period.between and LocalDate.
 * [1] Java Calculate Age. javaTpoint.com
 * https://www.javatpoint.com/java-calculate-age (accessed Jun. 19, 2023).
 */


