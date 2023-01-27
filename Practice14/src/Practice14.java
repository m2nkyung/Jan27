/* 구구단표를 교재에 나와 있는 모양으로 화면에 출력하는 프로그램을 작성하여 보자.
중첩된  반복문을  사용하라 */

public class Practice14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print((i * j) + "\t");
			}
			System.out.print("\n");
		}

	}

}
