
public class Contact {
	
	private int num;
	private String name;
	private String birth;
	
	//매개변수가 없는 생성자 - default constructor
	public Contact() {
		super();
	}

	//매개변수가 있는 생성자 
	public Contact(int num, String name, String birth) {
		super();
		this.num = num;
		this.name = name;
		this.birth = birth;
	}
	
	//접근자 메소드 
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	//디버깅을 위한 메소드 :멤버의 모든 값을 확인하기 위한 메소드 
	@Override
	public String toString() {
		return "contact [num=" + num + ", name=" + name + ", birth=" + birth + "]";
	}

	
	
	
	
	

	
}
