package basic;

import java.util.Scanner;

public class Lesson9Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ��� ");
		int i = scan.nextInt();
		
		switch (i) {
		case 100 : System.out.println("����");
		break;
		case 90 : System.out.println("��");
		break;
		case 80 : System.out.println("��");
		break;
		case 70 : System.out.println("��");
		break;
		case 60 : System.out.println("��");
		break;
		default :
		System.out.println("�ٽ� �غ���");
		break;
		}
		scan.close();
	
	
	
	}

}
