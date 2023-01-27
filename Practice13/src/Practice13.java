/*        특정한  정수를  읽어  들여서  0과  이  정수  사이에  있는  모든  3의  배수를 
출력하는  프로그램을  작성하여라. 1줄에  5개씩만  출력한다. */

import java.util.Scanner;
public class Practice13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i;
		int count = 0;
		
		System.out.print("정수를 입력하세요 : ");
		i = input.nextInt();
		
		for (int j = 0; j <= i; j += 3) {
			System.out.print(j + "\t");
			count++;
			
			if (count == 5) {
				System.out.print("\n");
				count = 0;
			}
		}
	}

}
