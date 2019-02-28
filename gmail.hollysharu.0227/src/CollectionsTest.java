import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {

		
		//Collections 클래스의 static 메소드를 이용하면
		//List, Set, Map에 작업을 수행할 수 있음 
		//reverse, shuffle, unmodifyableList 등의 메소드가 있음 
		List<String> list=new ArrayList<String>();
		list.add("커크");
		list.add("스팍");
		list.add("우후라");
		list.add("본즈");
		
		Collections.reverse(list);
		System.out.printf("%s\n", list);
		
		//데이터를 섞어주는 함수 호출 
		Collections.shuffle(list);
		System.out.printf("%s\n", list);
		
		//읽기전용의 리스트 만들기 - 데이터 수정하려고 하면 예외 발생 
		List<String> readOnlyList=Collections.unmodifiableList(list);
		readOnlyList.add("스코티");
		
		
	}
}
