package Exercise;

import java.util.Scanner;

public class Exercise3 {//A�� B�Է¹޾Ƽ� A+B�ۼ�
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("a �� �Է����ּ���");
	int a = scan.nextInt();
	System.out.println("b �� �Է��� �ּ���");
	int b = scan.nextInt();
	
	while(a>0 && b<10) {
		System.out.println("a + b = "+ (a+b));
		return;
	}
}


}
