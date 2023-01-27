/*       매개변수만  있고  반환값이  없는  메소드  작성하기
•       다음과  같이  동작하도록  메소드  sum을  작성하여라
•       실행예제
•     정수를  입력하세요: 3
•     정수를  입력하세요: 5
•     3 + 5 = 8
•     5 + 3 = 8  */

import java.util.Scanner;
public class Practice18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int i = input.nextInt();
		System.out.print("정수를 입력하세요 : ");
		int j = input.nextInt();
		
		sum(i, j);
	}
	
	public static void sum (int i, int j) {
		System.out.println(i + " + " + j + " = " + (i + j));
		System.out.println(j + " + " + i + " = " + (j + i));
	}
}