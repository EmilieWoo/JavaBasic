package basic;

import java.util.Scanner;

public class Exercise1 {//�������� ���α׷�
	public static void main(String[] args) {
		//�迭�� �̿��� �л����
		String Ujungli[]= {"�躹��","��⸰","���մ�","�̰��"};
		int score[] =new int[4];
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Ujungli[0] +"�� ������ �Է����ּ���");
		score[0]= scanner.nextInt();
		
		System.out.println(Ujungli[1] +"�� ������ �Է����ּ���");
		score[1]= scanner.nextInt();
		
		System.out.println(Ujungli[2] +"�� ������ �Է����ּ���");
		score[2]= scanner.nextInt();
		
		System.out.println(Ujungli[3] +"�� ������ �Է����ּ���");
		score[3]= scanner.nextInt();
		
		
		double ave = (double)(score[0]+ score[1]+score[2]+ score[3])/4;
		
		System.out.println("��ü����� "+ ave);
		
		System.out.println("arraylength�� " + Ujungli.length );
		
	}
}
