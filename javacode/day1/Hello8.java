package day1;

public class Hello8 {

	public static void main(String[] args) {
		// 有 A, B 二點
		// A點座標(10, 20), B點座標(5, -10)
		// A點座標(x1, y1), B點座標(x2, y2)
		// 求 AB 二點的直線距離(算到小數點第一位) = ?
		int x1=10, y1=20; // A 點座標
		int x2=5, y2=-10; // B 點座標

		double dx = Math.pow((x1-x2), 2);
		double dy = Math.pow((y1-y2), 2);
		double d  = Math.sqrt(dx + dy);
		System.out.printf("AB 二點的直線距離 = %.1f\n", d);
	}

}