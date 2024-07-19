
public class CoffeeShop {

	int iceAmericano;
	int hotAmericano;
	String iceAmericanoName;
	String hotAmericanoName;
	double discountRatio;
	
	
	
	
	public CoffeeShop(String iceAmericanoName, int iceAmericano, String hotAmericanoName ,int hotAmericano,  
			double discountRatio) {
		
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
		this.iceAmericanoName = iceAmericanoName;
		this.hotAmericanoName = hotAmericanoName;
		this.discountRatio = discountRatio;
	}




	public CoffeeShop(int iceAmericano, int hotAmericano, String iceAmericanoName, String hotAmericanoName) {
		super();
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
		this.iceAmericanoName = iceAmericanoName;
		this.hotAmericanoName = hotAmericanoName;
	}




	public int orderCoffee(int menu , int quantity) {
		
		if(menu == 1) {
			
			return this.iceAmericano * quantity;
		} 
		return this.hotAmericano * quantity;
	}
	
}
