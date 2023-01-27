/* 매개변수가  있고  반환값이  있는  메소드  작성하기
•       다음과  같이  동작하는  프로그램을  메소드  abs를  이용하여  작성하여라
•       실행  예제  (1)
•     정수를  입력하세요: 3
•     입력된  정수  3의  절대값은  3입니다. */

import java.util.Scanner;
public class Practice19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i;
		
		System.out.print("정수를 입력하세요 : ");
		i = input.nextInt();
		
		System.out.println("입력된 정수 " + i + "의 절대값은 " + abs(i) + "입니다.");
	}

	public static int abs(int i) {
		if (i < 0) {
			return (i * -1);
		} else {
			return i;
		}
	}
}
