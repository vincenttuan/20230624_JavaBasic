package day1;

public class Hello13 {

	public static void main(String[] args) {
		// 考績 0~10 分
		// 若考績 >= 8 分, 獎金 10000
		// 若考績 >= 6 分, 獎金 5000
		// 其餘不發獎金(0)

		int performance = 7;  // 考績分數

		// 求獎金 = ? (利用 ? : 三元運算子)
		int bonus = performance >= 8 ? 10000 : performance >= 6 ? 5000 : 0;
		System.out.printf("考績 = %d 獎金 = %d\n", performance, bonus);

	}

}