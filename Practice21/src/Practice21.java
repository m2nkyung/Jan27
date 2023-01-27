/*•       정수를  하나  입력  받아서, 정수에  해당하는  구구단은  출력하는  프로그 
램을  작성하여라. 이를  위해서  메소드  printTimes를  작성하여라.*/

import java.util.Scanner;
public class Practice21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i;
		
		System.out.print("정수를 입력하세요 : ");
		i = input.nextInt();
		
		printTimes(i);
	}
	
	public static void printTimes(int i) {
		System.out.println("구구단 " + i + "단 입니다.");
		
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + (i * j));
		}
	}
}