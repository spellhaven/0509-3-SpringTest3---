package com.spellhaven.springtest3_050903;

public class Student {
	
	private String name;
	private String age;
	private String gradeNum; //항년 몇 학년인지?
	private String classNum; //몇 반인지?
	

	public Student() { //얘가 있어야 applicationCTX.xml에서 세터로 학생 만드는 게 된다.
		super(); // 않 그러면 아래에 있는 생성자로만 만들 수 있으니까...
	}

	public Student(String name, String age, String gradeNum, String classNum) {
		super();
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	
	

}
