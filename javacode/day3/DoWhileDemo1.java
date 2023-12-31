package day3;

import java.util.Scanner;
import java.util.Random;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 0, max = 10;
		int ans = random.nextInt(max - min - 1) + 1 + min;
		do {
			Scanner scanner = new Scanner(System.in);
			// 使用者猜 ---------------------------------------------------------------------------------
			System.out.printf("使用者請在 %d ~ %d 之間猜一個數字:", min, max);
			int userGuess = scanner.nextInt(); // 取得使用者所猜的數字
			// 1.檢查使用者所輸入的數字是否是在 min 與 max 的範圍之間
			if(userGuess <= min || userGuess >= max) {
				System.out.printf("數字 %d 不在 %d ~ %d 範圍之間, 請重新輸入!\n", userGuess, min, max);
				continue; // 重新執行迴圈
			}

			// 2.判斷使用者是否猜對的邏輯
			if(userGuess > ans) {
				max = userGuess;
			} else if(userGuess < ans) {
				min = userGuess;
			} else {
				System.out.printf("恭喜使用者答對了 ! ans = %d\n", ans);
				break;
			}

			// 電腦猜 -----------------------------------------------------------------------------------
			int pcGuess = random.nextInt(max - min - 1) + 1 + min;
			System.out.printf("電腦請在 %d ~ %d 之間猜一個數字:%d\n", min, max, pcGuess);
			// 判斷電腦是否猜對的邏輯
			if(pcGuess > ans) {
				max = pcGuess;
			} else if(pcGuess < ans) {
				min = pcGuess;
			} else {
				System.out.printf("恭喜電腦答對了 ! ans = %d\n", ans);
				break;
			}

		} while(true);

		System.out.println("Game Over !");
	}

}