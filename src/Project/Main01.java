package Project;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {

		//랜덤 종목 추천 프린트
		 Scanner scanner = new Scanner(System.in);
		
				System.out.println("--- 종목추천 ---");
			
				int num1 = 0;		// 종목 추천 수
				System.out.println("하이 침팬지, 종목 추천해줘.");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.print("원하는 종목수를 말씀해주세요. : ");
		        num1 = scanner.nextInt();
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("침팬지가 다트를 던지는 중입니다.");
		        try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// for 구문을 이용한 종목 수 설정
				
				System.out.print("추천 종목은 [");
				
				for (int i=0; i<num1; i++) {
				System.out.print(Unit.Unit[(int) (Math.random()*50)]);
				if(i!=num1-1) {
					System.out.print(", ");
					}
				}
				System.out.println("] 입니다.");
				
				
				System.out.println(" ");
				scanner.close();
	}

}
