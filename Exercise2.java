package Exercise;

import java.util.Scanner;

public class Exercise2 {// ���ڸ� �Է¹ް� ������ �� ����ϴ� ���α׷�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int n = scan.nextInt();
		int i;
		System.out.println("n����?");
		
		
		for( i=1;i<=9;i++) {
			System.out.println(n+" * "+ i +" = " + (n*i));
		}
	}

}
