package studio9;

import assignment7.Student;

import java.util.HashMap;
import java.util.Map;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String,Student> map ; 
	

	public UniversityDatabase() {
		super();
		this.map = new HashMap<String,Student>();
	}

	public void addStudent(String accountName, Student student) {
		map.put(accountName, student);
		
	}

	public int getStudentCount() {
		return map.size();
	}

	public String lookupFullName(String accountName) {
		Student student = map.get(accountName);
		if(student == null) {
			return null;
		}
		return student.getFullName();
	}

	public double getTotalBearBucks() {
		double counter = 0;
		for( String name: map.keySet()) {
			counter += map.get(name).getBearBucksBalance();
			
		}
		return counter;

	}
}
