package sale;

import java.text.*;
import java.util.*; // date가 기본포맷이아니라서 유틸에서 가져와야함 (sql에서 가져오면x)
import product.ProVO; // ProVO를 상속받을려면 다른패키지를 임포트해줘야한다.

public class SaleVO extends ProVO { //자바빈 //extends ProVO는 상속받는거다.
	private int seq;
	private String code;
	private String sale_date;
	private int qnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###"); // 숫자는 #
		String fmtPrice = df.format(getPrice());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String fmtDate = sdf.format(sale_date);
		int sum = getPrice() * qnt;
		String fmtSum = df.format(sum);
		return "코드 : "  + code + ", 판매날짜 : " + getSale_date() + ", 판매수량 : " + qnt + ", 상품명 : "
				+ getName() + ", 가격 : " + fmtPrice + "원, 총판매액 : " + fmtSum + "]";
	}
}
