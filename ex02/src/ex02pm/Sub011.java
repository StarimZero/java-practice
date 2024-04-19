package ex02pm;

import java.util.*; // 자바유틸패키지 모든 클래스를사용하게따.

public class Sub011 {
	public static void run() {
		Scanner s = new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>(); //names를 저장한 어레이를만들어따. == 바구니이름이 names이고 add로 추가한다.
		names.add("조복치"); //데이터입력
		names.add("김민지");
		names.add("김태연");
		names.add("이지은");
		names.add("팜하니");
		
//		names.remove(1); 지우기
		
//		names.set(1,  "라라라"); 교체하기
		for(int i=0; i<names.size(); i++) {// 배열은 legnth고 arrayList는 size다 ㅡㅡ
			String name=names.get(i); // String 을 names 바구니에서 get한다.
			System.out.println(name);
		}//for
		while(true) {
		System.out.println("검색할 이름은? ");
		String sname=s.nextLine();
		if(sname=="") {
			System.out.println("★검색을 종료합니다.");
			break;
		}//if
		int index=-1;
		for(int i = 0; i < names.size(); i++) {
			String name=names.get(i);
			if(sname.equals(name)) { // sname이랑 name이랑 저장돼있는 메모리가 달라서 --> 주소가 다르니까 그냥 다름.. 내용을 비교할려면 equals를 써야한다.
				index=i+1;
			}//if
		}//for
		if(index==-1) {
			System.out.println("★존재하지 않습니다.");
		}else {
			System.out.println(index + "번째 존재합니다.");
		}
		//if
		}//while
	}//method
}//class
