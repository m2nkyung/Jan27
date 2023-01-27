/* 사용자가  입력한  이름을  가지고, 인사말을  출력하는  메소드  greeting 을  작성하여라
•       실행  예제
•     이름을  입력하세요: 김동덕
•     김동덕씨, 좋은  아침입니다 */

import java.util.Scanner;
public class Practice20 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.print("이름을 입력하세요 : ");
		name = input.next();
		
		greeting(name);
	}
	
	public static void greeting(String s) {
		System.out.println(s + "씨, 좋은 아침입니다.");
	}
}