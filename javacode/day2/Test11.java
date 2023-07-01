package day2;

public class Test11 {

	// 利用 if-else if 來判斷 bmi
	// bmi < 18 過輕
	// bmi >= 23 過重
	// 其餘正常
	public static void main(String[] args) {
		double h = 170;
		double w = 60;
		double bmi = w / Math.pow(h/100, 2);
		System.out.println(bmi);
		
		if(bmi < 18) 
			System.out.println("過輕");
		else if(bmi >= 23)
			System.out.println("過重");
		else
			System.out.println("正常");


	}

}