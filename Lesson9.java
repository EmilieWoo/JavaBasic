package basic;

import java.util.Scanner;

public class Lesson9 {// ���ǹ� ����
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("num1�� �Է��ϼ���!");
		int num1 = scan.nextInt();
		System.out.println("num2�� �Է��ϼ���!");
		int num2 = scan.nextInt();
		
		if(num1==num2) {
			System.out.println("���� ������");
			
		}else if(num1>num2){
			System.out.println("1�̴� ũ����");
		}else {
			System.out.println("2�� �� ũ����");
		}
	}

}
