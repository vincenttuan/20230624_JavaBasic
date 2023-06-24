package day1;

public class Hello5 {

	public static void main(String[] args) {
		int x = 1, y = 3;
		System.out.println(x + y);

		int sum = x + y; // 將 x + y 的結果保存在 sum 變數中
		System.out.println(sum);

		// 若想要要出 1 + 3 = 4 (x + y = sum)
		System.out.println(x + " + " + y + " = " + sum);

		System.out.printf("%d + %d = %d\n", x, y, sum);
	}

}