import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setMain {

	public static void main(String[] args) {

		//변수를 선언할 때 사용한 클래스나 인터페이스를 구현한 경우에는
		//변수를 아래처럼 상위 클래스나 인터페이스 타입으로 설정할 수 있음 
		Set<String> set=new	TreeSet<String>();
		set.add("Desk");
		set.add("Queen size Bed");
		set.add("Table");
		set.add("chairs");		
		set.add("sofa");		
		set.add("Desk");
	
		//모든 데이터를 접근
		for(String interior:set) {
			System.out.printf("%s\n", interior);
		}
		
		
	}
}
