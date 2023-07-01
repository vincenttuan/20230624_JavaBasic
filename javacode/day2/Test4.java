package day2;

// 透過 &&, & 的特性
public class Test4 {

	public static void main(String[] args) {
		
		int score = 50;
		int point = 0;

		if(score >= 60 && ++point > 0) { // 若用 & 就會可能有 bug
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
		System.out.printf("點數 = %d\n", point);

	}

}
