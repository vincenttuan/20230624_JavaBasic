package day2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner("國文,100,數學,80,英文,90");
		scanner.useDelimiter(",");
		
		scanner.next();
		int chinese = scanner.nextInt();

		scanner.next();
		int math = scanner.nextInt();

		scanner.next();
		int english = scanner.nextInt();

		System.out.println(chinese + math + english);
	}

}