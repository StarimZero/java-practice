package product;

import java.util.*;

public interface ProductInter { // 기본 인터페이스(설계도) 만들기. 
	public ArrayList<ProVO> list(); // list 의 method 정의하기.
	public void insert(ProVO vo); // 인서트의 Method 정의
	public boolean delete(String code); //
	public void update(ProVO vo);
	public ProVO read(String code);
	public String getCode();//getCode라는 함수는 
}

