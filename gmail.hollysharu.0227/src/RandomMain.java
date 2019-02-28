import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		//인스턴스를 생성할 때 seed를 대입하면 일정한 패턴으로 숫자가 생성 
		//seed를 대입하지 않으면 진짜 랜덤으로 숫자 생성 
		Random r = new Random();
		//nextInt는 정수 범위 내에서 랜덤한 숫자를 리턴 
		//System.out.printf("%d\n", r.nextInt());
		
		int [] ar = {1,2,3,4,5,6};
		//nextInt(정수)는 정수로 나눈 나머지 중에서 랜덤하게 숫자를 리턴 
		int len=ar.length;
		int su=r.nextInt(len);
		System.out.printf("%d\n", ar[r.nextInt(ar.length)]);
		
		//빨강, 파랑, 노랑, 초록 네 가지 중에 하나가 랜덤하게 나오도록 작성 
		String [] colors = {"빨강", "파랑", "노랑", "초록"};
	
		while(true) {
			//일정 시간 대기 
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%s\n", colors[r.nextInt(colors.length)]);
		}
		
	
		
	}
}
