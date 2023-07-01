package day2;

public class Test14 {
	/* 
	 * 判斷身份證字號第三碼
	 * 0 – 5 在臺灣出生之本籍國民
	 *   6   入籍國民，原為外國人
	 *   7 	 入籍國民，原為無戶籍國民
	 *   8	 入籍國民，原為港澳居民
	 *   9   入籍國民，原為中國大陸人民
	*/
	public static void main(String[] args) {
		String id = "A183456789";
		System.out.println(id);
		// 取得第三碼
		char code = id.charAt(2);
		System.out.println(code);
		// 判斷第三碼
		if(code == '0' || code == '1' || code == '2' || code == '3' || code == '4' || code == '5') {
			System.out.println("在臺灣出生之本籍國民");
		} else if(code == '6') {
			System.out.println("入籍國民，原為外國人");
		} else if(code == '7') {
			System.out.println("入籍國民，原為無戶籍國民");
		} else if(code == '8') {
			System.out.println("入籍國民，港澳居民");
		} else if(code == '9') {
			System.out.println("入籍國民，原為中國大陸人民");
		} else {
			System.out.println("資料錯誤");
		}
	}

}