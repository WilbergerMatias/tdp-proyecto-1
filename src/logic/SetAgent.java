package logic;

import entities.Student;

public class SetAgent {

	private static String Name = "Matias";
	private static String LastName = "Wilberger";
	private static String LU = "116603";
	private static String URL = "https://github.com/WilbergerMatias/tdp-proyecto-1";
	private static String Mail = "matias180399@gmail.com";
	private static String PathPhoto = "/images/example.png";
	
	//metodo por conveniencia

	public Student SetAll(Student studentData) {
		// TODO Auto-generated method stub
		studentData = new Student (Integer.parseInt(LU), LastName, Name, Mail, URL, PathPhoto);
		return studentData;
	}
	
}