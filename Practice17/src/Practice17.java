/* 16번  문제에서  작성한  메소드  show를  이용하여  다음과  같이  동작하는 메인  메소드를  작성하여라.
실행예제
•     *************************
•     메소드  호출하기  전
•     *************************
•     메소드  호출한  후
•     *************************
*/

public class Practice17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show();
		System.out.println("메소드 호출하기 전");
		show();
		System.out.println("메소드 호출하기 후");
		show();
	}
	
	public static void show() {
		System.out.println("*************************");
	}
}
