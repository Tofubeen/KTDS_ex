package franchise;


/*
 * 자판기에서 판매하는 상품
 */


public class Goods {

	private String name;
	private int quantity;
	private int price;
	
	
	
	public Goods(String name, int quantity , int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
