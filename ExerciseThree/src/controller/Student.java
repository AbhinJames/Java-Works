package controller;

public class Student {


	//attribute

	public final int ID;    
    private static int nextID = 0;

	private String lastName;


	private String firstName;


	private int age;
	
	
	public Student(String firstName,String lastName,int age)
	{
		this.ID = nextID++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		
	}



	//getter setter


	public String getLastName() {


	return lastName;


	}


	public void setLastName(String lastName) {


	this.lastName = lastName;


	}


	public String getFirstName() {


	return firstName;


	}


	public void setFirstName(String firstName) {


	this.firstName = firstName;


	}


	public int getAge() {


	return age;


	}


	public void setAge(int age) {


	this.age = age;


	}


	}