package java04;

import java.util.Scanner;

public class v {
	public static void main(String[] args) {
	
		    if (true) {
		      System.out.println("条件为真时执行");
		    } else {
		      System.out.println("条件为假时执行");
		    }

		    if (!true) {
		      System.out.println("条件为真时执行");
		    } else {
		      System.out.println("条件为假时执行");
		    }

		    if (1 > 2) {
		      System.out.println("条件为真时执行");
		    } else {
		      System.out.println("条件为假时执行");
		    }

		    // 只有一行执行语句,则可省略 {}
		    if (2 == 2)
		      System.out.println("真");
		    else
		      System.out.println("假");

		    // 如果天晴则 我们去爬山;否则 在家撸代码
		    int sunny = 2;
		    // 只有判断 if(..)
		    if (sunny == 1) {
		      System.out.println("去爬山");
		    }

		    // 判断..否则 if(..) else ..
		    if (sunny == 1) {
		      System.out.println("去爬山");
		    } else {
		      System.out.println("在家撸代码");
		    }

		    // 三元表达式 (? 之前的条件为真则执行 : 之前的代码;否则 执行 : 之后的代码)
		    System.out.println((sunny == 1) ? "去爬山" : "在家撸代码");


		    // 多条件 if(..) .. else if(..) .. else ..
		    // 1 晴天 2 阴天 3 雨天 4 雪天 5 暴雨 6 雷电
		    // 天气的变量: weather
		    // Scanner 扫描器类 System.in 从控制台输入
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("请输入目前的天气: 1 晴天 2 阴天 3 雨天");

		    // 从控制台获取输入的整数,赋值给变量 weather
		    int weather = scanner.nextInt();
		    if (weather == 1) {
		      System.out.println("去爬山");
		    } else if (weather == 2) {
		      System.out.println("与女票约会");
		    } else {
		      System.out.println("在家撸代码");
		    }
		  }
		}

