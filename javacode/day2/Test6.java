package day2;

public class Test6 {
	public static void main(String[] args) {
		
		System.out.printf("data = %d\n", 123);
		System.out.printf("data = %05d\n", 123);
		System.out.printf("data = %08d\n", 123);

		String n = "100"; // 字串
		// 希望可以呈現 "00100"
		System.out.printf("n = %s\n", n);
		System.out.printf("n = %05d\n", Integer.parseInt(n));
	}
}