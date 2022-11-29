package assignment7;

//TODO: Copy a working Student class from Assignment 7 over this file.
public class Student {

	private String firstName;
	private String lastName;
	private int studentID;
	private int attemptedCredits;
	private int passingCredits;
	private double totalGradeQualityPoints;
	private double bearBucksBalance;
	
	public Student(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = id;
		this.attemptedCredits = 0;
		this.passingCredits = 0;
		this.totalGradeQualityPoints= 0;
		this.bearBucksBalance = 0;
			}

	public String getFullName() {
		return this.firstName + " " + this.lastName;

			}

	public int getId() {
		return this.studentID;
		}

	public void depositBearBucks(double amount) {
		this.bearBucksBalance = this.bearBucksBalance+ amount;
	}

	public double getBearBucksBalance() {
		return this.bearBucksBalance;
		}
}
