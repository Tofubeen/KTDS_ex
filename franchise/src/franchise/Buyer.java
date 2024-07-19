package franchise;

/*
 * 구매자 ( 사는 행위에만 초점 )
 */

public class Buyer {

	private int itemCount;
	private int money;
	
		
	public Buyer(int money) {
		super();
		this.money = money;
	}

	
	

	public int getItemCount() {
		return itemCount;
	}




	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}




	public int getMoney() {
		return money;
	}




	public void setMoney(int money) {
		this.money = money;
	}




	public void buy(int quantity , int price) {
		
		if(this.money >= price) {
			this.money -= price;
			this.itemCount += quantity;
		}
	}
	
	public void printBuyerInfo() {
		System.out.println("------------------------------------");
		System.out.println("구매자의 상품 수: " + this.itemCount + "개");
        System.out.println("구매자의 지갑 현황: " + this.money + "원");
        System.out.println("------------------------------------");
	}
	
	
	
	
	
}
