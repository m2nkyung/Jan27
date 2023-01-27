/* 매개변수도  반환값도  없는  메소드  작성하기
• 다음과 같이 동작하도록 메소드 show를 작성하여라
•     메소드  호출하기  전
•     *************************
•     메소드  호출한  후 */ 

public class Practice16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메소드 호출하기 전");
		show();
		System.out.println("메소드 호출하기 후");
	}
	
	public static void show() {
		System.out.println("*************************");
	}
}