package day2;

public class Test13 {

	public static void main(String[] args) {
		
		int month = 12;
		int day = 18;
		String sign = "";

		if((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
			sign = "水瓶";
		} else if((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
			sign = "雙魚";
		} else if((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
			sign = "牡羊";
		} else if((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
			sign = "金牛";
		} else if((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
			sign = "雙子";
		} else if((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
			sign = "巨蟹";
		} else if((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
			sign = "獅子";
		} else if((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
			sign = "處女";
		} else if((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
			sign = "天秤";
		} else if((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
			sign = "天蠍";
		} else if((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
			sign = "射手";
		} else if((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
			sign = "魔羯";
		}

		System.out.printf("%d / %d %s座\n", month, day, sign);

	}

}