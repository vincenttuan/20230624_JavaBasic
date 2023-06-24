package day1;

public class Hello15 {

	public static void main(String[] args) {
		// 基礎判斷: 條件運算子 &&(and), ||(or), !(not)
		// 判斷閏年:
		// 如果年份 (能被4整除), 並且(不能被100整除)或者(能被400整除)，那麼該年將被視為閏年。
		// 否則，它將不是閏年。

		// 16 否被 4 整除
		System.out.println(16 % 4); // 得到 16 除以 4 的餘數
		System.out.println(16 % 4 == 0);

		int year = 2024;
		// 請問 2024 年是否是閏年 ?
		boolean isLeapYear = (year % 4 == 0) ? ((year % 100 != 0) || (year % 400 == 0) ? true : false) : false;
		System.out.printf("%s 是否是閏年 %b\n", year, isLeapYear);
	}

}