// 구구단표 출력

public class Practice15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 6; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 6; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.print("\n");
		}
	}

}
