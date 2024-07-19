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




//아이템을 판매하는 자판기
public class Product {

	private Goods bakKas;
	private Goods monster;
	private Goods hotSix;
	private Goods milkies;
	
	public Product(Goods bakKas, Goods monster, Goods hotSix, Goods milkies) {
		super();
		this.bakKas = bakKas;
		this.monster = monster;
		this.hotSix = hotSix;
		this.milkies = milkies;
	}
	
	
	//주문하기
	public Goods orderProduct(String menuName , int orderQuantity) {
		
		if(bakKas.getName().equals(menuName)) {
			
			if(bakKas.getQuantity() > 0 &&  bakKas.getQuantity() >= orderQuantity ) {
				bakKas.setQuantity(bakKas.getQuantity() - orderQuantity);
//				bakKas.getQuantity() -= orderQuantity;
				
				/*
				 * 다른방법은
				 * Goods outputBakkas = new Goods(menuName, orderQuantity, bakKas.price*orderQuantity);
				 * 로 객체를 만들고
				 * return outputBakkas; 로 해도된다
				 */
				
				
				return new Goods(menuName, orderQuantity, bakKas.getPrice()*orderQuantity);
				
			}
			System.out.println("상품이 품절되었습니다");
			
			
		}else if(monster.getName().equals(menuName)) {
			
			if(monster.getQuantity() > 0 &&  monster.getQuantity() >= orderQuantity ) {
				monster.setQuantity(monster.getQuantity() - orderQuantity); 
				return new Goods(menuName, orderQuantity, monster.getPrice()*orderQuantity);
			}
			System.out.println("상품이 품절되었습니다");
			
		}else if(hotSix.getName().equals(menuName)) {
			
			if(hotSix.getQuantity() > 0 &&  hotSix.getQuantity() >= orderQuantity ) {
				hotSix.setQuantity(hotSix.getQuantity() - orderQuantity);
				return new Goods(menuName, orderQuantity, hotSix.getPrice()*orderQuantity);
			}
			System.out.println("상품이 품절되었습니다");
			
		}else if(milkies.getName().equals(menuName)) {
			if(milkies.getQuantity() > 0 &&  milkies.getQuantity() >= orderQuantity ) {
				milkies.setQuantity(milkies.getQuantity() - orderQuantity);
				return new Goods(menuName, orderQuantity, milkies.getPrice()*orderQuantity);
			}
			System.out.println("상품이 품절되었습니다");
		}else {
			System.out.println("그런 상품은 없습니다.");
		}
		return null;//메모리에 할당된 데이터가 없는 상태 
	}
	
	
	//입고하기
	public void setQuantity(String menuName , int plusQuantity) {
		
		if(bakKas.getName().equals(menuName)) {
			bakKas.setQuantity(bakKas.getQuantity() + plusQuantity);
			System.out.println(menuName + "의 재고에 " + plusQuantity + " 개를 추가했습니다.");
			
		}else if(monster.getName().equals(menuName)) {
			
			monster.setQuantity(monster.getQuantity() + plusQuantity);
			System.out.println(menuName + "의 재고에 " + plusQuantity + " 개를 추가했습니다.");
			
		}else if(hotSix.getName().equals(menuName)) {
			
			hotSix.setQuantity(hotSix.getQuantity() + plusQuantity);
			System.out.println(menuName + "의 재고에 " + plusQuantity + " 개를 추가했습니다.");
			
		}else if(milkies.getName().equals(menuName)) {
			
			milkies.setQuantity(milkies.getQuantity() + plusQuantity);
			System.out.println(menuName + "의 재고에 " + plusQuantity + " 개를 추가했습니다.");
			
		}
	}
	
	
	// 재고출력 하기
	public void getQuantityPrint() { // 재고출력 하기
		
		System.out.println("남은 재고는 "+ bakKas.getQuantity() + "입니다");
	}
	
	
	
}
