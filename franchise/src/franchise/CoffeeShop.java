package franchise;

public class CoffeeShop {

	private Coffee iceAmericano;
	private Coffee hotAmericano;
	
	/*
	 * @param menu 주문할 음료의 번호 1 -아메리카노 0- 따듯한 아메리카노
	 * @param quantity 주문할 수량 
	 * @return 주문 총액
	 */
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {

		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}
	
	
	public int orderCoffee(int menu , int quantity) {
		if(menu ==1) {
			System.out.println(iceAmericano.getPrice() + " 을 주문합니다");
			return iceAmericano.getPrice() * quantity;
		}
		
		System.out.println(hotAmericano.getPrice() + " 을 주문합니다");
		return hotAmericano.getPrice() * quantity;
	}
	
	

	
}
