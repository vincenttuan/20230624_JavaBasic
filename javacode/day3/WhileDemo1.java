package day3;
import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		// 建立一個可以產生隨機數的物件
		Random random = new Random();
		boolean running = true; // 控制迴圈的變數
		while(running) {
			int n = random.nextInt(100); // 100 表示會動產生 0~99 的隨機數
			if(n % 11 != 0) {
				continue; // 提早執行下一次的迴圈
			}
			System.out.println(n);
			if(n == 77) {
				//break; // 跳離迴圈
				running = false;
			}
		}

	}	

}