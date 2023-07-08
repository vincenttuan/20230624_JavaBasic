package day3;
import java.util.Random;

public class WhileDemo1 {

	public static void main(String[] args) {
		// 建立一個可以產生隨機數的物件
		Random random = new Random();		
		while(true) {
			int n = random.nextInt(100); // 100 表示會動產生 0~99 的隨機數
			System.out.println(n);
		}

	}	

}