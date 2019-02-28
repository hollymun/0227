import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapUse {

	public static void main(String[] args) {
		//번호(int), 이름(String), 나이(int)를 묶어서 저장 
		//자료구조 생성 
		Map<String, Object> map=new HashMap<String, Object>();
		//데이터 삽입 
		map.put("num", 1);
		map.put("name", "문하루");
		map.put("age", 11);
		
		//데이터 꺼내서 출력 
		System.out.printf("%s\n", map.get("name"));
		//없는 key를 사용해서 데이터를 가져오면 null 리턴함 
		System.out.printf("%s\n", map.get("boxy"));		
		
		//데이터 추가 
		map.put("job", "고양이");
		//데이터 갱신 - 존재하는 key에 데이터 추가하면 갱신 
		map.put("num", 2);
		//데이터 삭제
		map.remove("age");
		System.out.printf("%s\n", map);
		
		System.out.printf("=====================================\n");
		
		//맵의 데이터를 하나씩 전부 출력
		//맵의 모든 키를 전부 가져오기 
		Set<String> keySet=map.keySet();
		//빠른 열거를 이용해서 keySet의 모든 데이터에 접근 
		for(String key:keySet) {
			System.out.printf("%s: %s\n", key, map.get(key));
		}
		
		System.out.printf("=====================================\n");

		
		
	}
}
