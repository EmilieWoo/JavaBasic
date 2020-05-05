package Exercise;

import java.util.Scanner;

public class Exercise2 {// 숫자를 입력받고 구구단 을 출력하는 프로그램
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단 수를 입력하세요");
		int n = scan.nextInt();
		int i;
		System.out.println("n단은?");
		
		
		for( i=1;i<=9;i++) {
			System.out.println(n+" * "+ i +" = " + (n*i));
		}
	}

}
