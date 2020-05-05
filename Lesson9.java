package basic;

import java.util.Scanner;

public class Lesson9 {// 조건문 관련
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("num1을 입력하세요!");
		int num1 = scan.nextInt();
		System.out.println("num2을 입력하세요!");
		int num2 = scan.nextInt();
		
		if(num1==num2) {
			System.out.println("둘이 같지롱");
			
		}else if(num1>num2){
			System.out.println("1이더 크지롱");
		}else {
			System.out.println("2가 더 크지롱");
		}
	}

}
