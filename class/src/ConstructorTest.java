
public class ConstructorTest {

	private String name;
	
//	public ConstructorTest() {
//		
//		System.out.println("인스턴스를 생성합니다.");
//		//인스턴스가 생성된 직후에 아래코드가 실행된다
//		name = "unknown";
//	}

	public ConstructorTest(String name) {
		System.out.println("인스턴스를 실행합니다");
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
