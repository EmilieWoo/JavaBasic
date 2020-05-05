package Exercise;

import java.util.Scanner;

public class Exercise1 {// 시험점수를 입력받아~ 점수를 출력하는 프로그램 만들기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		int score = scan.nextInt();
		String grade;
		if(score >=90) {
			grade ="A";
		}else if(score >=80 && score <90){
			grade ="B";
			
		}else if(score >=70 && score <80) {
			grade ="C";
		}else if(score>=60 && score<70) {
			grade = "D";
		}else {
			grade ="F";
		}
		
	System.out.println("이번 성적은 "+ score+"점이고 결과는 "+ grade +"등급입니다. ");
		scan.close();
	}

}
