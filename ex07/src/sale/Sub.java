package sale;

import java.text.*;
import java.util.*;
import product.*;

public class Sub {
	public static void run() {
		SaleDAO dao = new SaleDAO();
		ProDAO pdao = new ProDAO();
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###원");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		while(run) {
			System.out.println("\n┌────────────────────────────────────────────────────┐");
			System.out.println("\t\t\t\t\t1.판매등록 | 2. 판매현황 | 3. 판매찾기 | 4. 판매삭제 | 0. 종료");
			System.out.println("└────────────────────────────────────────────────────┘");
			System.out.print("\t\t선택하세요. ");
			String menu = scan.nextLine();  //nextLine  Scanner는 클래스다 = nextLine은 메소드다 
			switch(menu) {
			case "1":
				System.out.print("\t\t등록하실 상품코드를 입력하세요.");
				String code1 = scan.nextLine();
				ProVO vo1 = pdao.read(code1);
				if(vo1.getCode()==null) {
					System.out.println("\t\t입력하신 상품코드는 존재하지 않습니다.");
				}else {
					SaleVO svo = new SaleVO();
					System.out.println("\t\t입력하신 코드의 상품 이름은 " +vo1.getName() + " 입니다.");
					String today = sdf.format(new Date());
					System.out.print("\t\t판매일을 입력해주세요." + today);
					String date = scan.nextLine();
					if(date !="") {
						svo.setSale_date(date);
					} else {
						svo.setSale_date(today);
					}
					System.out.print("\t\t판매가를 입력해주세요 " + vo1.getPrice() + "원");
					String price = scan.nextLine();
					if(price !="") {
						svo.setPrice(Integer.parseInt(price));
					} else {
						svo.setPrice(vo1.getPrice());
					}
					System.out.print("\t\t판매 수량을 입력해 주세요 ");
					String qnt = scan.nextLine();
					if(qnt !="") {
						svo.setQnt(Integer.parseInt(qnt));
					}else {
						svo.setQnt(1);
					}
					svo.setCode(code1);
					System.out.println("\t\t" + svo.toString());
					dao.insert(svo);
					System.out.println("\t\t매출등록완료!");
				}
				break;
			case "2":
				System.out.println("\t\t판매날짜\t\t\t\t\t상품명\t\t\t판매대수\t\t총판매가격");
				for(SaleVO vo:dao.list()) {
//			System.out.println("\t\t" + vo.toString());
					System.out.printf("\t\t%s\t\t%s(%s)\t\t%d개\t\t\t%,d원\n",
							vo.getSale_date(), vo.getName(), vo.getCode(), vo.getQnt()
							,vo.getPrice());
				}
				break;
			case "3":
				System.out.print("\t\t찾고싶은 상품의 코드를 입력하세요");
				String code3 = scan.nextLine();
				ProVO vo3 = pdao.read(code3);
				if(vo3.getCode()==null) {
					System.out.println("\t\t"+ code3 + "번의 상품은 존재 하지 않습니다.");
				}else {
					System.out.println("\t\t상품이름 : " + vo3.getName());
					System.out.println("\t\t상품단가 : " + df.format(vo3.getPrice()));
				}
				
				break;
			case "4":
				break;
			case "0":
				System.out.println("\t\t....판매관리를 종료합니다....");
				run=false;
				break;
			default:
				System.out.println("\t\t메뉴에서 선택하세요..");
			}//switch
		}//while
	}
}
