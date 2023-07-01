package day2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("John,170,50,Mary,160,60");
		// 請問誰的 BMI 判讀過重 ?
		scanner.useDelimiter(",");

		// John 的資訊
		String johnName = scanner.next();
		double johnHeight = scanner.nextDouble();
		double johnWeight = scanner.nextDouble();
		double johnBmi = johnWeight / Math.pow(johnHeight/100, 2);

		// Mary 的資訊		
		String maryName = scanner.next();
		double maryHeight = scanner.nextDouble();
		double maryWeight = scanner.nextDouble();
		double maryBmi = maryWeight / Math.pow(maryHeight/100, 2);

		// 判斷過重
		if(johnBmi >= 23) {
			System.out.println("John 過重");
		}
		if(maryBmi >= 23) {
			System.out.println("Mary 過重");
		}


	}

}