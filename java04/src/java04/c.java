package java04;
/**
 *  
 *�߼������
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
		//�߼��� and 
		if(++a == 12 &  ++b == 22){
			System.out.println("ִ����.");
			
		}
		 System.out.println(a+""+b);//11 21
		 
		     a =10;//���³�ʼ��Ĭ��ֵ
			 b =20;
			 //��·��(&& ֮ǰ�ı��ʽ�� false,��ô�������ʽ���� false)
			if(++a == 12 &&  ++b == 22){
				System.out.println("ִ����.");
				
			}
			 System.out.println(a+""+b);//11 20
			 
		             a =10;
					 b =20;
					 //��·��(|| ֮ǰ�ı��ʽ��true,��ô�������ʽ���� true)
					if(++a == 10 || ++b == 20){
						System.out.println("ִ����.");
						
					}
					 System.out.println(a+""+b);
		
	}

}
