package franchise;

/*
 * 커피샵이 판매하는 상품의 정보
 * 데이터클래스 
 * 	-멤버변수
 * 	-생성자
 */
public class Coffee {

	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
