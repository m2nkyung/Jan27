/* 1부터 100까지 3씩 건너뛰면서 정수의 값을 출력하는 프로그램을 작성하라.
•     1줄에  5개씩  출력한다.
•     처음  출력은  for 루프를  사용하고, 두  번째  출력은  while 루프를  사용 */

public class Practice12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		int i;
		
		for (i = 1; i <= 100; i += 3) {
			System.out.print(i + "\t");
			count++;
			
			if(count == 5) {
				count = 0;
				System.out.print("\n");
			}	
		}
		
		System.out.print("\n\n");
		
		i = 1;
		count = 0;
		
		while (i <= 100) {
			System.out.print(i + "\t");
			count++;
			i += 3;
			
			if (count == 5) {
				System.out.print("\n");
				count= 0;
			}
		}
	}
}
