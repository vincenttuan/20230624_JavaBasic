package day1;

public class Hello6 {

	public static void main(String[] args) {
		// 計算圓面積 = ?
		int r = 10;
		double pi = 3.1415926;

		double area = Math.pow(r, 2) * pi;  // r * r * pi;
		System.out.printf("半徑 = %d 圓面積 = %f\n", r, area);
		System.out.printf("半徑 = %d 圓面積 = %.2f\n", r, area);

		// 計算球體積 = ?
		double volume = (4.0/3) * pi * Math.pow(r, 3);
		System.out.printf("半徑 = %d 球體積 = %f\n", r, volume);		
		System.out.printf("半徑 = %d 球體積 = %.2f\n", r, volume);	
	}

}