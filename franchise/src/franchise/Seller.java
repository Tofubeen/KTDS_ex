package franchise;


/*
 * 판매자 = 파는행위에만 초점
 */


public class Seller {

	private int stock;
	private final int PRICE;
	private int money;
	
	public Seller(int stock, int price, int money) {
		super();
		this.stock = stock;
		this.PRICE = price;
		this.money = money;
	}
	
	
	
	
	
	
	public int getStock() {
		return stock;
	}






	public void setStock(int stock) {
		this.stock = stock;
	}






	public int getMoney() {
		return money;
	}






	public void setMoney(int money) {
		this.money = money;
	}






	public int getPRICE() {
		return PRICE;
	}






	public int sell(int quantity) { //  판매자의 판매행위에만 집중한 메소드
		if(this.stock >= quantity) {
			this.stock -= quantity;
			this.money += this.PRICE * quantity;
			return quantity;
			
		}
		quantity = this.stock;
		
		this.money += this.PRICE * this.stock;
		this.stock = 0;
		return quantity;
	}
	
	
	public void printSellerInfo() {
		System.out.println("------------------------------------");
        System.out.println("판매자의 상품가격 " + this.PRICE+ "원");
        System.out.println("판매자의 상품 수: " + this.stock + "개");
        System.out.println("판매자의 금고 현황: " + this.money + "원");
        System.out.println("------------------------------------");
	}
	
}
