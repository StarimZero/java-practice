package ex03pm;

public class Sale {
	
	String code;
	String name;
	int price;
	int qnt;
	
	//기본생성자만 쓸거면 생략가능
	public Sale() {
		
	}
	//생성자 - 필드를 이용한.
	public Sale(String code, String name, int price, int qnt) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}

	//
	
	
	
	//금액을 구하는 method
	public  int vol() {
		int vol = price * qnt;
		return vol;
	}
	//총 판매액을 구하는 method

		
	
	
	// 내용을 가로 출력 Method
	public void print_land() {
		System.out.printf("\t\t%s\t\t%s\t\t%,d원\t\t%d대\t\t\t%,d원\n", code, name, price, qnt, vol());
	}
	// 내용을 세로로 출력 
	public void print_port() {
		System.out.printf("\t\t상품 이름 : %s\n", name);
		System.out.printf("\t\t가격 : %,d원\n" ,price);
		System.out.printf("\t\t수량 : %d개\n" ,qnt);
		System.out.printf("\t\t총매출액 : %,d원\n" ,vol());
	}
}
