package franchise;

public class MarketPlace {

	//각 상황에 맞는 메소드를 Main 에서 정의
	
	
	public static void main(String[] args) {
		
		Seller shoeMarker = new Seller(100, 150_000, 1_000);
		Buyer me = new Buyer(1_000_000);
		
		int orderCount = 2;
		if(orderCount * shoeMarker.getPRICE() <= me.getMoney()) {
			int orderQuantity = shoeMarker.sell(orderCount);
			
			me.buy(orderCount, orderQuantity* shoeMarker.getPRICE());
		
		}
		
		shoeMarker.printSellerInfo();
		me.printBuyerInfo();
		
	}
}
