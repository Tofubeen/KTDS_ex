package franchise;



public class QuestProduct {
 
	
	
	private int store ; 
	private int wallet; 
	
	public QuestProduct(int basket, int wallet) {
		super();
		this.store = basket;
		this.wallet = wallet;
	}

	public void buy(QuestProduct seller, int buyCount, int price) {
		
        if(this.wallet >= buyCount * price && seller.store >= buyCount) { 
        	
            // 구매자와 판매자의 상태를 업데이트
            seller.store -= buyCount; 
            seller.wallet += buyCount * price;
            this.store += buyCount;
            this.wallet -= buyCount * price;
            System.out.println("구매가 정상적으로 성사됐습니다.");
            
        } else if(this.wallet >= buyCount * price && buyCount >= seller.store  ) { //돈은 충분하나 구매수량이 판매수량을 넘을시 코드
        	this.store += seller.store;
        	this.wallet -= seller.store * price;
        	seller.wallet += seller.store * price;
        	seller.store = 0;
            System.out.println("일정수의 제품만 구매가 되었습니다.");
        }else {
        	System.out.println("구매가 정상적으로 진행되지 않았습니다. 잔고를 확인해주세요");
        }
    }
	
	public void print(QuestProduct buyer , QuestProduct seller , int ITEMPRICE) {
		System.out.println("------------------------------------");
		System.out.println("구매자의 상품 수: " + buyer.store + "개");
        System.out.println("구매자의 지갑 현황: " + buyer.wallet + "원");
        System.out.println("판매자의 상품가격 " + ITEMPRICE + "원");
        System.out.println("판매자의 상품 수: " + seller.store + "개");
        System.out.println("판매자의 지갑 현황: " + seller.wallet + "원");
        System.out.println("------------------------------------");
	}
}
