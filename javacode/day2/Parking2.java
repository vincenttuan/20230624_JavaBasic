package day2;

import java.util.Scanner;

// 停車位元運算
public class Parking2 {

	public static void main(String[] args) {
		
		int parking = 0b10010;
		System.out.printf("目前車位狀況: %s\n", Integer.toBinaryString(parking));
		
		Scanner scanner = new Scanner(System.in); // 可以取得鍵盤所輸入的內容
		System.out.print("請輸入停車位(0~4): ");
		int no = scanner.nextInt(); // 取得使用者所輸入的鍵盤數字資料 (我要停 no 號車位)
		int car = (int)Math.pow(2, no); 

		// 判斷是否可以停車 ?
		if((parking & car) == 0) {
			System.out.printf("%d 號車位可以停車\n", no);
			// 將車子停進去
			parking = parking + car;
			System.out.printf("最新車位狀況:%s\n", Integer.toBinaryString(parking));
		} else {
			System.out.printf("%d 號車位不可以停車\n", no);
		}


	}

}