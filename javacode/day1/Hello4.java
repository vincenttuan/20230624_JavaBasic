package day1;

/*
 * 這是我的 Java 程式
 * 版本: 1.0
 * 作者: Demo
 * 日期: 2023-06-24
*/
public class Hello4 {
	// 這是 Java 程式進入點
	public static void main(String[] args) {
		// 執行並印出數學運算
		System.out.println(1+3*4/2);
		System.out.println((5+2)*4/2-1);
		// 5的3次方
		System.out.println(5*5*5);
		// 5的3次方, 使用 Math.pow(x, n) --> x 的 n 次方
		System.out.println(Math.pow(5, 3));
		// 開根號, 使用 Math.sqrt(x)
		System.out.println(Math.sqrt(144));
		// 四捨五入, 使用 Math.round(x) 
		System.out.println(Math.round(9.5)); // 10
		// 無條件進入, 使用 Math.ceil(x)
		System.out.println(Math.ceil(9.1));  // 10.0
		// 無條件捨去, 使用 Math.floor(x)
		System.out.println(Math.floor(9.9)); // 9.0
	}

}