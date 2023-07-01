package day2;

// 透過 ChatGPT 優化的結果
public class Test3 {

	public static void main(String[] args) {
		int score = 50;
		int point = 0;
		
		System.out.printf("分數 = %d %s\n", score, (score >= 60) ? "及格" : "不及格");
		
		if (score >= 60) {
			point++;
		}
		
		System.out.printf("點數 = %d\n", point);
	}

}
