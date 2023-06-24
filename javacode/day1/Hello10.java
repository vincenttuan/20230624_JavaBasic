package day1;

public class Hello10 {

	public static void main(String[] args) {
		double principal = 1000_0000; // 貸款金額(本金) 
		double annualInterestRate = 0.0195; // 房貸年利率
		int years = 40; // 貸款期數(年)

		// 以單利計算
		double totalInterest = principal * annualInterestRate * years; // 總利息
		double totalPapayment = principal + totalInterest; // 總還款金額
		int numberOfPayments = years * 12; // 總共還款次數

		// 計算每月還款金額
		double monthlyPayment = totalPapayment / numberOfPayments;

		System.out.printf("每月需要支付的金額為: %,.1f 元\n", monthlyPayment);
		System.out.printf("本金: %,.1f 元\n", principal);
		System.out.printf("利息: %,.1f 元\n", totalInterest);

	}

}