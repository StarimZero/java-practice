package juso;

public class Juso { // 자바빈만들기(VO:Value Object)
	//필드
	private int no;
	private String name;
	private String address;
	private String phone;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Juso [no=" + no + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}
	
	
	
	
	
	
	
	
	
}












