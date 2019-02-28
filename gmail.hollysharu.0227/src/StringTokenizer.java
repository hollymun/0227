import java.util.ArrayList;
import java.util.Comparator;

public class StringTokenizer {

	public static void main(String[] args) {
/*
		StringTokenizer st = new StringTokenizer("그는 낙관주의자다 내가 바다로 갔다고 믿는다");
		//hasMoreTokens가 false를 리턴할 때까지 반복
		while(st.hasMoreTokens()){
			String e = st.nextToken(); 
			System.out.printf("%s\n", e);
		}
*/
		
		
		//2부터 100까지 소수를 찾아서 ArrayList에 저장하고 내림차순으로 출력 
		//소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=2; i<100; i=i+1) {
			int j;
			for(j=2; j<=i/2; j=j+1){
				if(i%j==0) {
					break;
				}	
			}
		
			if(i!=j) {
				System.out.printf("x");
				i=i-1;
				continue;
			}
			
			list.add(i);
		}
/*
		for(int i=2; i<100; i=i+1) {
			int flag=0;
			for(int j=2; j<=i/2; j=j+1) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				list.add(i);
			}
		}
*/		
		//데이터를 정렬하기 위해서 비교할 방법을 알려주는 객체를 생성 
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		
		System.out.printf("%s\n", list);
		
		
	}
}
