package controller;

import java.util.ArrayList;

public class FillStudent {
	
	
	public static ArrayList<Student> getStudentList()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("boule","BOULE",7));
		students.add(new Student("gaston","LAGAFFE",12));
		students.add(new Student("picsou","DUCK",24));
		
		return students;
	}

}
