package day3;

import java.util.Scanner;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		int ans = 47;
		int min = 0, max = 100;
		do {
			Scanner scanner = new Scanner(System.in);
			// 使用者猜
			System.out.printf("使用者請在 %d ~ %d 之間猜一個數字:", min, max);
			int userGuess = scanner.nextInt(); // 取得使用者所猜的數字
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.printf("恭喜答對了 ! ans = %d\n", ans);
				break;
			}

		} while(true);

		System.out.println("Game Over !");
	}

}