package java04;

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ķ���");
		
		int x = scanner.nextInt();
		if(x >= 90 && x<=100){
			System.out.println("����");
		}
		else if(x >=80 && x<=90){
			System.out.println("����");
		}
		if(x>=70 && x<=80){
			System.out.println("��");
		}
		if(x>=60 && x<=70){
			System.out.println("����");
	}
		if(x<60 && x>=1){
			System.out.println("������");

}
}
}