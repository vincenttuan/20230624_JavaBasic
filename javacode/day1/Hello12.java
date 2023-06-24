package day1;

public class Hello12 {

	public static void main(String[] args) {
		// 利用 ? : 三元運算子
		int score = 85;
		// "及格" 或 "不及格"
		String result = score >= 60 ? "及格" : "不及格";

		System.out.printf("分數: %d %s\n", score, result);

	}

}