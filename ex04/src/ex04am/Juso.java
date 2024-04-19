package ex04am;

import java.util.*;

//주소관리록의 자바빈(VO) 만들어보기 = 필드, 생성자, 게터세터, 투스티링


public class Juso {
	//필드(속성)
	private int no;
	private String name;
	private String address;
	private String phone;
	
	
	
	
	//기본생성자 - new Juso 기본생성자는 생략가능 근데 오버로딩할꺼면 적어여함
	
	public Juso() {
		
	}
	
	//생성자 2
	public Juso(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	
	//게터, 세터
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	//Tostring
	
	@Override
	public String toString() {
		return "Juso [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
	
}
