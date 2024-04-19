package product;

import java.text.DecimalFormat;

public class ProVO { //product 를 저장한 java빈 = VO의 역할을 저장을 담을 '방'
	private String code;
	private String name;
	private int  price;
	
	
	public String getCode() { //가져오기 리턴해야지
		return code;
	}
	public void setCode(String code) { // 넣어주기 this는 code필드
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	} // setter getter method
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###원");
		String fmtPrice = df.format(price);
		return "ProVO [code=" + code + ", name=" + name + ", price=" + fmtPrice + "]";
	}
	
}//class
