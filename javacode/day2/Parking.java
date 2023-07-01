package day2;

public class Parking {

	public static void main(String[] args) {
		
		int parking = 0b10010;
		System.out.printf("parking = %d\n", parking);
		// 透過 Integer.toBinaryString() 可以將 parking 以二進位形式呈現
		System.out.printf("parking = %s\n", Integer.toBinaryString(parking));

		//int car = (int)Math.pow(2, 0); // 我要停 0 號車位
		//int car = (int)Math.pow(2, 1); // 我要停 1 號車位
		//int car = (int)Math.pow(2, 2); // 我要停 2 號車位
		int car = (int)Math.pow(2, 3); // 我要停 3 號車位

		// 判斷是否可以停 3 號車位 ?
		if((parking & car) == 0) {
			System.out.println("3號車位可以停車");
			// 將車子停進去
			parking = parking + car;
			System.out.printf("parking = %d\n", parking);
			System.out.printf("parking = %s\n", Integer.toBinaryString(parking));
		} else {
			System.out.println("3號車位不可以停車");
		}


	}

}