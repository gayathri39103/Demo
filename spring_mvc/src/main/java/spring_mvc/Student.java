package spring_mvc;

public class Student {

	int id;
	String name;
	String Area_of_interest;
	public String getArea_of_interest() {
		return Area_of_interest;
	}
	public void setArea_of_interest(String area_of_interest) {
		Area_of_interest = area_of_interest;
	}
	public int getId() {
		return id;	
	}
	public Student() {
		
	}
	public Student(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}

}
