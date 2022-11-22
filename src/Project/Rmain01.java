package Project;


public class Rmain01 {


	public static void main(String[] args) {

		
		//랜덤 종목 추천 프린트
		
		
		System.out.println("--- 종목추천 ---");
	
		int n = 3;		// 종목 추천 수
		System.out.println("하이 침팬지, "+ n + "가지 종목 추천해줘.");
		System.out.println("침팬지가 다트를 던지는 중입니다.");
		// for 구문을 이용한 종목 수 설정
		
		System.out.print("추천 종목은 [");
		
		for (int i=0; i<n; i++) {
		System.out.print(Unit.Unit[(int) (Math.random()*50)]);
		if(i!=2) {
			System.out.print(", ");
			}
		}
		System.out.println("] 입니다.");
		
		
		System.out.println(" ");
		

		
		// 복리계산기 프린트 
		
		System.out.println("--- 복리계산기 ---");
		bok1 m1 = new bok1(10000000, 15, 10);		// (초기시드, 수익률, 매매횟수 순서)
		System.out.println(m1.toString() + " 최종금액: " + m1.money1());
		
		System.out.println(" ");
		
		// 코스피 프린트
		
		System.out.println("--- 코스피와 내 계좌 비교하기 ---");
		
		double stkospi = 2462.5;
		double endkospi = 2500;
		double stseed = 1000000.0;
		double endseed = 1453450.0;
		
		double kosprofit = ((endkospi-stkospi)/stkospi)*100;
		String formattedkosprofit = String.format("%.2f", kosprofit);
		
		double seedprofit = ((endseed - stseed)/stseed)*100;
		String formattedseedprofit = String.format("%.2f", seedprofit);
		
		System.out.println("코스피 성장률: " + formattedkosprofit +"%");
		System.out.println("내 계좌 성장률: " + formattedseedprofit + "%");
		
		if(seedprofit > kosprofit) {
			System.out.println("코스피 성장률보다 계좌수익률이 더 높습니다. Good Job!");
		}
		else {
			System.out.println("계좌수익률보다 코스피 성장률이 더 높습니다. 분발합시다!");
		}
		
	}

	

}
