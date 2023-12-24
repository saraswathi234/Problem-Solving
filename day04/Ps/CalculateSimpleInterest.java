package day04.Ps;

public class CalculateSimpleInterest {
	public static void main(String[] args) {
		double principal = 1000.0;
		double time = 2.5;
		double rate = 5.0;
		double simpleInterest = (principal * time * rate) / 100;

		System.out.println(simpleInterest);
	}

}
