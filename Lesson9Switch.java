package basic;

import java.util.Scanner;

public class Lesson9Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("영어 점수를 입력해주세요 ");
		int i = scan.nextInt();
		
		switch (i) {
		case 100 : System.out.println("수석");
		break;
		case 90 : System.out.println("수");
		break;
		case 80 : System.out.println("우");
		break;
		case 70 : System.out.println("미");
		break;
		case 60 : System.out.println("양");
		break;
		default :
		System.out.println("다시 해보자");
		break;
		}
		scan.close();
	
	
	
	}

}
