package java04;
/**
 *  
 *逻辑运算符
 * @author SONG
 */

public class c {
	public static void main(String[] args) {
		System.out.println(true);
		System.out.println(true);//folse
		System.out.println(1==2);//true
		System.out.println(2==2);//folse
		
		int a =10;
		int b =20;
		//逻辑与 and 
		if(++a == 12 &  ++b == 22){
			System.out.println("执行了.");
			
		}
		 System.out.println(a+""+b);//11 21
		 
		     a =10;//重新初始化默认值
			 b =20;
			 //短路与(&& 之前的表达式是 false,那么整个表达式都是 false)
			if(++a == 12 &&  ++b == 22){
				System.out.println("执行了.");
				
			}
			 System.out.println(a+""+b);//11 20
			 
		             a =10;
					 b =20;
					 //短路或(|| 之前的表达式是true,那么整个表达式都是 true)
					if(++a == 10 || ++b == 20){
						System.out.println("执行了.");
						
					}
					 System.out.println(a+""+b);
		
	}

}
