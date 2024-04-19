package ex04am;

import java.util.*;

public class Car { //자바빈이라고 한다.
	//필드 (속성)
	private String no;
	private String company;
	private String model;
	private String color;
	private int distance;
	private String date;
	
public Car() {
	
}



	public Car(String no, String company, String model, String color, int distance, String date) {
	super();
	this.no = no;
	this.company = company;
	this.model = model;
	this.color = color;
	this.distance = distance;
	this.date = date;
}



	public String getNo() {
		return no;
	}




	public void setNo(String no) {
		this.no = no;
	}




	public String getCompany() {
		return company;
	}




	public void setCompany(String company) {
		this.company = company;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getDistance() {
		return distance;
	}




	public void setDistance(int distance) {
		this.distance = distance;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	@Override
	public String toString() {
		return "Car [no=" + no + ", company=" + company + ", model=" + model + ", color=" + color + ", distance="
				+ distance + ", date=" + date + "]";
	}

	
	
}//class
