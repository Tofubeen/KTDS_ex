package franchise;



public class QuestProductMain {
	
	public static final int ITEMPRICE = 4000;
	
	public static void main(String[] args) {
		
		QuestProduct buyer = new QuestProduct(0, 8000);
		QuestProduct seller = new QuestProduct(5, 100_000);
		
		
//		buyer.buy(seller, 1, ITEMPRICE);  // 구매자가 판매자로부터 1개 구매
//		
//		buyer.print(buyer, seller, ITEMPRICE);
//        buyer.buy(seller, 5, ITEMPRICE);  // 구매자가 판매자로부터 1개 더 구매
//		
//        buyer.print(buyer, seller, ITEMPRICE);
        buyer.buy(seller, 1, ITEMPRICE);  // 구매자가 판매자로부터 1개 구매
        
        buyer.print(buyer, seller, ITEMPRICE);
        buyer.buy(seller, 5, ITEMPRICE);  // 구매자가 판매자로부터 1개 더 구매
        
        buyer.print(buyer, seller, ITEMPRICE);
		

	}
}
