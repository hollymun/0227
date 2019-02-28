import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class contactMain {

	public static void main(String[] args) {
		
		//1. 클래스 생성 
		//Contact 클래스의 인스턴스 만들기 
		//클래스의 변수가 1개인 경우 첫글자만 소문자로 변경해서 사용 
		//Contact contact=new Contact();
		Contact contact=new Contact(1, "문하루", "20090316");
		
		//구성요소를 하나씩 출력
		System.out.printf("번호:%d\n", contact.getNum());		
		System.out.printf("이름:%s\n", contact.getName());		
		System.out.printf("생일:%s\n", contact.getBirth());		
		//클래스, 관계형 데이터베이스를 사용했을 때
		//편리하기는 하지만 클래스의 구조를 변경해야 하는 경우 모든 부분을 수정해야 함 
	
		System.out.printf("============================================\n");
		
		//2. Map 사용 
		//동일한 데이터를 Map을 이용해서 저장
		//HashMap, LinkedHashMap, TreeMap 
		Map<String, Object> catsInfo=new HashMap<String, Object>();
		catsInfo.put("num", 1);
		catsInfo.put("birth", "20090316");
		catsInfo.put("name", "문하루");
		
		//key의 이름을 직접 입력하지 않고 출력 
		//catsInfo의 key가 변경되더라도 출력하는 부분을 수정할 필요 없음 
		Set<String> keys=catsInfo.keySet();
		for(String key : keys) {
			System.out.printf("%s:%s\n", key, catsInfo.get(key));
		}
		
	}
}