package day2;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		System.out.println(5 << 1);
		System.out.println(5 >> 1);
		System.out.println(5 >>> 1);
		// 替代乘法
		int n = 10;
		int result = n << 3; // 等同於 n * 8
		System.out.println(result);
		
		int ans = 42;
		int key1 = 5;
		int key2 = 2;
		int output = ans << key1 >> key2;

		System.out.println("請破解:" + output);
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入 key1:");
		int myKey1 = scanner.nextInt();
		System.out.print("請輸入 key2:");
		int myKey2 = scanner.nextInt();

		result = output << myKey2 >> myKey1;
		System.out.println("result:" + result);

		if(result == ans) {
			System.out.println("破解成功");
		} else {
			System.out.println("破解失敗");
		}

	}

}