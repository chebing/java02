package java04;

import java.util.Scanner;

public class v {
	public static void main(String[] args) {
	
		    if (true) {
		      System.out.println("����Ϊ��ʱִ��");
		    } else {
		      System.out.println("����Ϊ��ʱִ��");
		    }

		    if (!true) {
		      System.out.println("����Ϊ��ʱִ��");
		    } else {
		      System.out.println("����Ϊ��ʱִ��");
		    }

		    if (1 > 2) {
		      System.out.println("����Ϊ��ʱִ��");
		    } else {
		      System.out.println("����Ϊ��ʱִ��");
		    }

		    // ֻ��һ��ִ�����,���ʡ�� {}
		    if (2 == 2)
		      System.out.println("��");
		    else
		      System.out.println("��");

		    // ��������� ����ȥ��ɽ;���� �ڼ�ߣ����
		    int sunny = 2;
		    // ֻ���ж� if(..)
		    if (sunny == 1) {
		      System.out.println("ȥ��ɽ");
		    }

		    // �ж�..���� if(..) else ..
		    if (sunny == 1) {
		      System.out.println("ȥ��ɽ");
		    } else {
		      System.out.println("�ڼ�ߣ����");
		    }

		    // ��Ԫ���ʽ (? ֮ǰ������Ϊ����ִ�� : ֮ǰ�Ĵ���;���� ִ�� : ֮��Ĵ���)
		    System.out.println((sunny == 1) ? "ȥ��ɽ" : "�ڼ�ߣ����");


		    // ������ if(..) .. else if(..) .. else ..
		    // 1 ���� 2 ���� 3 ���� 4 ѩ�� 5 ���� 6 �׵�
		    // �����ı���: weather
		    // Scanner ɨ������ System.in �ӿ���̨����
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("������Ŀǰ������: 1 ���� 2 ���� 3 ����");

		    // �ӿ���̨��ȡ���������,��ֵ������ weather
		    int weather = scanner.nextInt();
		    if (weather == 1) {
		      System.out.println("ȥ��ɽ");
		    } else if (weather == 2) {
		      System.out.println("��ŮƱԼ��");
		    } else {
		      System.out.println("�ڼ�ߣ����");
		    }
		  }
		}

