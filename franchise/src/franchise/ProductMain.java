package franchise;

/*
 * 클래스 has a 클래스 실습 (음료수 자판기)
상품
박카스 (상품명: 박카스, 가격: 900원, 재고 15개)
몬스터 (상품명: 몬스터, 가격: 1500원, 재고 20개)
핫식스 (상품명: 핫식스, 가격 1300원, 재고 10개)
밀키스 (상품명: 밀키스, 가격 1400원, 재고 5개)

기능
주문하기(제품명, 주문수량): 상품
	몬스터를 5개 주문한다면 	상품(상품명: 몬스터, 재고: 5개, 가격: 1500원 * 5)을 	반환한다.
	주문을 하면 주문 수량만큼 재고가 감소된다.
	재고가 없다면 “상품이 품절되었습니다“ 를 출력하고 null을 반환한다.
입고하기(제품명, 입고수량): void
	입고를 하면 입고 수량만큼 재고가 증가된다.
재고 출력() : void

 */

public class ProductMain {

	

	
	
	public static void main(String[] args) {
		
		Goods bak = new Goods("박카스", 15, 900);
		Goods mon = new Goods("몬스터", 20, 1500);
		Goods hot = new Goods("박카스", 10, 1300);
		Goods mil = new Goods("핫식스", 5, 1400);
		
		Product pro = new Product(bak, mon, hot, mil);
		
		
		bak = pro.orderProduct("박카스", 10);
		System.out.println("상품명 : "+bak.getName() +", 재고: " + bak.getQuantity()+ ", 가격: " + bak.getPrice());
		
		pro.getQuantityPrint();// 남은재고 출력 메소드
		
		pro.setQuantity("박카스", 3); //기존 재고에 수량 추가
		
		pro.getQuantityPrint();
		
//		bak = pro.orderProduct("박카스", 4);
//		System.out.println("상품명 : "+bak.name +", 재고: " + bak.quantity+ ", 가격: " + bak.price);
//		pro.getQuantityPrint();
//		
//		bak = pro.orderProduct("박카스", 1);
//		System.out.println("상품명 : "+bak.name +", 재고: " + bak.quantity+ ", 가격: " + bak.price);
//		pro.getQuantityPrint();
//		
//		
//		try {
//			bak = pro.orderProduct("박카스", 1);
//			System.out.println("상품명 : " + bak.name + ", 재고: " + bak.quantity + ", 가격: " + bak.price);
//		} catch (NullPointerException e) {
//			
//		}
		
		
		
	}
}
