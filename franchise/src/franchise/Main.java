package franchise;

public class Main {

	public static void main(String[] args) {
		
		//Coffee > CoffeeShop > Main
		
		Coffee ice = new Coffee("아이스 아메리카노", 2500);
		Coffee hot = new Coffee("따뜻한 아메리카노", 2000);
		
		CoffeeShop cs = new CoffeeShop(ice, hot);
		
		int price = cs.orderCoffee(1, 5);
		System.out.println(price);
		System.out.println(price);
	}
}
