package com.demo;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {// 输出用户输入的数字之间的随机数
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("请输入第一个数字");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个数字 要求第二个数字大于等于第一个数字");
		int num2 = scanner.nextInt();

		int rand = new Random().nextInt(num2 - num1) + num1;
		System.out.println(rand);

		System.out.println("请输入一个您猜的数字");
		int aim = scanner.nextInt();

		while (true) {
			if (aim == rand) {
				System.out.println("ok");
				break;
			} else if (aim > rand) {
				System.out.println("你猜大了");
			} else {
				System.out.println("你猜小了");
			}
			System.out.println("请重新输入猜写的数字");
			aim = scanner.nextInt();
		}

	}
}
