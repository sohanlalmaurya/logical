package com.logical.code.xml;

public class Student {

	private Integer id;
	private String firstName;
	private String lastName;
	private String nockName;
	private Integer marks;
	
	public Student() {
		
	}
	public Student(Integer id, String firstName, String lastName, String nockName, Integer marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nockName = nockName;
		this.marks = marks;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", nockName=" + nockName
				+ ", marks=" + marks + "]";
	}

}
