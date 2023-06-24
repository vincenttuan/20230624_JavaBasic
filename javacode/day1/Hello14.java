package day1;

public class Hello14 {

	public static void main(String[] args) {
		// 距離(distance)單位公里
		// 交通(transport): 汽車, 腳踏車, 走路
		// 若距離超過 10 公里就開汽車
		// 若距離少於 1 公里就走路
		// 試問若距離 = 3 公里則要使用哪一種交通工具 ?
		double distance = 3;

		String transport = distance >= 10 ? "汽車" : distance < 1 ? "走路" : "腳踏車";
		System.out.printf("距離: %.1f 交通工具: %s\n", distance, transport);

	}

}