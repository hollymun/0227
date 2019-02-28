import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrimeList {

	public static void main(String[] args) {

		//2부터 100까지 소수를 찾아서 ArrayList에 저장하고 내림차순으로 출력 
		//소수는 2부터 자신의 절반이 되는 숫자까지 나누어 떨어지지 않으면 소수 
		
		//정수를 저장할 수 있는 ArrayList 생성 
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		
		//2부터 100까지 수 중에서 
		for(int i=2; i<100; i=i+1) {
			//나누어떨어졌는지 확인하기 위한 변수 
			int flag=0;
			//2부터 자신의 절반이 되는 숫자까지 
			for(int j=2; j<=i/2; j=j+1) {
				//나누어떨어지지 않으면 중단 - 지나갔는지 확인필요 
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			//나누어 떨어진 적 없으면 소수이므로 리스트에 추가 
			if(flag==0) {
				primeList.add(i);
			}
		}
		
		//데이터를 정렬하기 위해서 비교할 방법을 알려주는 객체를 생성 
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		};
		
		//결과 출력 
		System.out.printf("%s\n", primeList);
		

		
	}

}
