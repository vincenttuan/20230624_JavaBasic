package day2;

public class Test5 {

	public static void main(String[] args) {
		
		//int x = 0b00011100; // 0b 表示二進位
		int x = 0b11100; // 0b 表示二進位
		System.out.println(x);

		int y = 017; // 0開頭表示八進位
		System.out.println(y);	
		
		int z = 0x3A; // 0x開頭表示十六進位
		System.out.println(z);	

		int a = 5 & 3;
		int b = 5 | 3;
		int c = 5 ^ 3;
		System.out.printf("5 & 3 = %d\n", a);
		System.out.printf("5 | 3 = %d\n", b);
		System.out.printf("5 ^ 3 = %d\n", c);

	}

}