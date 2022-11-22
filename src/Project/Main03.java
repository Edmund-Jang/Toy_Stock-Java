package Project;
import java.util.Scanner;
public class Main03 {

	public static void main(String[] args) {

System.out.println("--- 코스피와 내 계좌 비교하기 ---");
		
Scanner scanner = new Scanner(System.in);

		double num1 = 0.00;
		double num2 = 0.00;
		double num3 = 0.00;
		double num4 = 0.00;
		
		System.out.print("초기 코스피값을 입력하세요. : ");
        num1 = scanner.nextDouble();
        
        System.out.print("마지막 코스피값을 입력하세요. : ");
        num2 = scanner.nextDouble();
        
        System.out.print("초기 시드값을 입력하세요. : ");
        num3 = scanner.nextDouble();
		
        System.out.print("마지막 시드값을 입력하세요. : ");
        num4 = scanner.nextDouble();
        
		
		double kosprofit = ((num2-num1)/num1)*100;
		String formattedkosprofit = String.format("%.2f", kosprofit);
		
		double seedprofit = ((num4 - num3)/num3)*100;
		String formattedseedprofit = String.format("%.2f", seedprofit);
		
		System.out.println(" ");
		System.out.println("코스피 성장률: " + formattedkosprofit +"%");
		System.out.println("내 계좌 성장률: " + formattedseedprofit + "%");
		System.out.println(" ");
		
		if(seedprofit > kosprofit) {
			System.out.println("코스피 성장률보다 계좌수익률이 더 높습니다. Good Job!");
		}
		else {
			System.out.println("계좌수익률보다 코스피 성장률이 더 높습니다. 분발합시다!");
		}
		scanner.close();
	}

}
