package day3;

import java.util.Scanner;
import java.util.Random;

public class DoWhileDemo1 {

	public static void main(String[] args) {
		Random random = new Random();
		int min = 10, max = 20;
		int ans = random.nextInt(max - min - 1) + 1 + min;
		do {
			Scanner scanner = new Scanner(System.in);
			// 使用者猜
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
				System.out.printf("恭喜答對了 ! ans = %d\n", ans);
				break;
			}

		} while(true);

		System.out.println("Game Over !");
	}

}