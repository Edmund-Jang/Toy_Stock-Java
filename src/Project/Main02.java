package Project;
import java.util.Scanner;
public class Main02 {

	
	
	public static void main(String[] args) {

		
		
		System.out.println("--- 복리계산기 ---");
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		 
		System.out.print("초기 시드를 입력하세요. : ");
        num1 = scanner.nextInt();
        
        System.out.print("수익률을 입력하세요. : ");
        num2 = scanner.nextInt();
        
        System.out.print("매매횟수를 입력하세요. : ");
        num3 = scanner.nextInt();
		
		
		bok1 m1 = new bok1(num1, num2, num3);		// (초기시드, 수익률, 매매횟수 순서)
		System.out.println(m1.toString() + " 최종금액: " + m1.money1());

		System.out.println(" ");
		scanner.close();
	}

}
