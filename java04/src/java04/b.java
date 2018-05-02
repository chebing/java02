package java04;

import java.util.Scanner;

public class b {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的分数");
		
		int x = scanner.nextInt();
		if(x >= 90 && x<=100){
			System.out.println("优秀");
		}
		else if(x >=80 && x<=90){
			System.out.println("良好");
		}
		if(x>=70 && x<=80){
			System.out.println("良");
		}
		if(x>=60 && x<=70){
			System.out.println("及格");
	}
		if(x<60 && x>=1){
			System.out.println("不及格");

}
}
}