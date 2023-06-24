package day1;

public class Hello7 {

	public static void main(String[] args) {
		// 透過身高與體重來計算 bmi 的值
		int h = 170;
		int w = 60;
		// 請計算 bmi 結果印出 bmi = 20.76
		double bmi = w / Math.pow(h/100.0, 2);
		System.out.printf("bmi = %.2f\n", bmi);
	}

}