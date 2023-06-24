package day1;

public class Hello9 {

	public static void main(String[] args) {
		// 若華氏(fahrenheit) = 68 度
		// 請寫一個 Java 程式能計算出攝氏(celsius) = 20 度
		double fahrenheit = 68.0; // 華氏

		double celsius = (fahrenheit - 32) * (5.0/9.0);   // 攝氏

		System.out.printf("攝氏(celsius) = %.1f 度\n", celsius);

	}

}