package com.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {// ����û����������֮��������
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�������һ������");
		int num1 = scanner.nextInt();
		System.out.println("������ڶ������� Ҫ��ڶ������ִ��ڵ��ڵ�һ������");
		int num2 = scanner.nextInt();

		int rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);

		System.out.println("������һ�����µ�����");
		int aim = scanner.nextInt();

		while (true) {
			if (aim == rand) {
				System.out.println("ok");
				break;
			} else if (aim > rand) {
				System.out.println("��´���");
			} else {
				System.out.println("���С��");
			}
			System.out.println("�����������д������");
			aim = scanner.nextInt();
		}

	}
}
