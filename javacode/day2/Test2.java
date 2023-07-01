package day2;

public class Test2 {

	public static void main(String[] args) {
		int score = 50;
		int point = 0;
		if(score >= 60) {
			System.out.printf("分數 = %d %s\n", score, "及格");
			point++;
			System.out.printf("點數 = %d\n", point);
		} else {
			System.out.printf("分數 = %d %s\n", score, "不及格");
			System.out.printf("點數 = %d\n", point);
		}

	}

}