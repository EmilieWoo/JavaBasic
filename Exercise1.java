package basic;

import java.util.Scanner;

public class Exercise1 {//학점관리 프로그램
	public static void main(String[] args) {
		//배열을 이용한 학사관리
		String Ujungli[]= {"김복수","김기린","나왕눈","이곡길"};
		int score[] =new int[4];
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Ujungli[0] +"의 점수를 입력해주세요");
		score[0]= scanner.nextInt();
		
		System.out.println(Ujungli[1] +"의 점수를 입력해주세요");
		score[1]= scanner.nextInt();
		
		System.out.println(Ujungli[2] +"의 점수를 입력해주세요");
		score[2]= scanner.nextInt();
		
		System.out.println(Ujungli[3] +"의 점수를 입력해주세요");
		score[3]= scanner.nextInt();
		
		
		double ave = (double)(score[0]+ score[1]+score[2]+ score[3])/4;
		
		System.out.println("전체평균은 "+ ave);
		
		System.out.println("arraylength는 " + Ujungli.length );
		
	}
}
