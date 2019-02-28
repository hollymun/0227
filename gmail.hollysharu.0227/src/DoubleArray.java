import java.util.HashMap;
import java.util.Map;

public class DoubleArray {
	
	
	public static void main(String[] args) {
	
		String [] moon= {"하루", "박시"};
		String [] yoon= {"호두", "후추"};
		String [] min= {"주녕"};

		
		//위 2개의 배열을 하나의 배열로 만들기 
		String [][]catsNdogs= {moon,yoon};
		
		//팀 이름과 선수 명단을 출력 
		for(int i=0; i<catsNdogs.length; i=i+1) {
			if(i==0) {
				System.out.printf("뭉네\n");
			}
			else{
				System.out.printf("미윤씨네\n");
			}
			//각 팀의 명단 가져오기 
			String [] animals = catsNdogs[i];
			//배열을 순회해서 출력
			for(String temp:animals) {
				System.out.printf("\t%s\n", temp);
			}
		}
		
		System.out.printf("=====================================\n");
		
		//각 배열을 Map으로 저장 
		Map<String, Object> map1=new HashMap<String, Object>();
		
		//팀 이름을 team이라는 키로 저장 
		map1.put("team", "뭉네");
		//선수 명단 배열을 cats라는 키로 저장 
		map1.put("cats", moon);
		
		Map<String, Object> map2=new HashMap<String, Object>();
		map2.put("team", "미윤씨네");
		map2.put("cats", yoon);
		
		//데이터를 새로 추가하더라도 출력부분은 수정하지 않아도 됨 
		Map<String, Object> map3=new HashMap<String, Object>();
		map3.put("team", "회장님네");
		map3.put("cats", min);
		
		//Map의 배열을 생성	
		Map [] animals={map1,map2, map3};
		
		for(Map map:animals) {
			//팀 이름 출력 
			System.out.printf("%s\n", map.get("team"));
			//Map에서 데이터를 가져와서 출력하지 않고 사용할 때는 
			//원래의 자료형으로 형 변환해서 사용해야 함 
			//형 변환하지 않으면 Object 타입이 됨 
			String[]temp=(String [])map.get("cats");
			for(String imsi:temp) {
				System.out.printf("\t%s\n", imsi);
			}
		}

		
		
	}
}
