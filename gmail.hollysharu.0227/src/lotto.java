import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class lotto {

	public static void main(String[] args) {

		Set<Integer> lotto=new TreeSet<Integer>();
		Scanner sc=new Scanner(System.in);

		//lotto 사이즈가 6이 아니라면 => 6이면 끝남 
		while(lotto.size()!=6){
			System.out.printf("1-45 사이의 값\n:");
				int su=sc.nextInt();
				if(su<1||su>45) {
					System.out.printf("1-45 사이의 값을 입력하세요\n");
					continue;
				}
				//중복된 값 들어오면 false 리턴하는 treeset
				if(lotto.add(su)==false) {
					System.out.printf("이전과 동일한 데이터가 입력되었습니다.\n");
				}
		}
		
		for(int temp:lotto) {
			System.out.printf("%d\t", temp);
		}

		sc.close();
	}
}