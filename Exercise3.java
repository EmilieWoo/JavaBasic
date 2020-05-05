package Exercise;

import java.util.Scanner;

public class Exercise3 {//A와 B입력받아서 A+B작성
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("a 를 입력해주세요");
	int a = scan.nextInt();
	System.out.println("b 를 입력해 주세요");
	int b = scan.nextInt();
	
	while(a>0 && b<10) {
		System.out.println("a + b = "+ (a+b));
		return;
	}
}


}
